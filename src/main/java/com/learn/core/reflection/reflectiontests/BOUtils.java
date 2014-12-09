package com.learn.core.reflection.reflectiontests;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang.math.RandomUtils;

import java.lang.reflect.*;
import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Various utils for testing BOs
 * <p/>
 * Created by IntelliJ IDEA.
 * User: jelen
 * Date: 1.5.11
 * Time: 13:50
 */
public class BOUtils {

  public interface FieldProcessor {
    void processField(BaseBean bean, Field field) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException;
    void processCollection(BaseBean bean, Field field) throws IllegalAccessException, InstantiationException;
    void postProcessBean(BaseBean bean);
  }

  public static <T extends BaseBean> T createAndPopulateBean(Class<T> clazz, boolean recursive) throws IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException {
    T bean = clazz.newInstance();
    HashSet<Class<?>> classes = new HashSet<Class<?>>();
    classes.add(clazz);
    process(bean, recursive, new FieldPopulator(), classes);
    return bean;
  }

  /**
   * Iterates all declared fields on a bean and passes each one to the processor.
   *
   * @param baseBean
   * @param recursively
   * @param processor
   * @throws java.lang.reflect.InvocationTargetException
   * @throws NoSuchMethodException
   * @throws InstantiationException
   * @throws IllegalAccessException
   */
  public static void process(BaseBean baseBean, boolean recursively, FieldProcessor processor, Set<Class<?>> processedClasses) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
    if (baseBean == null) {
      return;
    }
    for (Field field : baseBean.getClass().getDeclaredFields()) {
      field.setAccessible(true);
      if (BaseBean.class.isAssignableFrom(field.getType())) {
        processor.processField(baseBean, field);
        if (recursively) {
          BaseBean fieldBaseBean = (BaseBean) field.get(baseBean);
          if (!processedClasses.contains(field.getType())) {
            processedClasses.add(field.getType());
            process(fieldBaseBean, recursively, processor, processedClasses);
            processedClasses.remove(field.getType());
          }
        }
      } else if (field.getType().equals(TrackableLinkedHashSet.class)) {
        Type genericFieldType = field.getGenericType();
        if (genericFieldType instanceof ParameterizedType) {
          ParameterizedType aType = (ParameterizedType) genericFieldType;
          Type[] fieldArgTypes = aType.getActualTypeArguments();
          for (Type fieldArgType : fieldArgTypes) {
            Class<?> clazz = (Class<?>) fieldArgType;
            if (hasSuperClass(clazz, BaseBean.class)) {
              if (!processedClasses.contains(clazz)) {
                processor.processCollection(baseBean, field);
                processedClasses.add(clazz);
                TrackableLinkedHashSet<BaseBean> trackableLinkedHashSet = getTrackableLinkedHashSet(baseBean, field);
                for (BaseBean bean : trackableLinkedHashSet.getAll()) {
                  process(bean, recursively, processor, processedClasses);
                }
                processedClasses.remove(clazz);
              }
            }
          }
        }
      } else if (Collection.class.isAssignableFrom(field.getType())) {
        Type genericFieldType = field.getGenericType();
        if (genericFieldType instanceof ParameterizedType) {
          ParameterizedType aType = (ParameterizedType) genericFieldType;
          Type[] fieldArgTypes = aType.getActualTypeArguments();
          for (Type fieldArgType : fieldArgTypes) {
            Class<?> clazz = (Class<?>) fieldArgType;
            if (hasSuperClass(clazz, BaseBean.class)) {
              if (!processedClasses.contains(clazz)) {
                processedClasses.add(clazz);
                Collection<BaseBean> baseBeanSet = getBaseBeanCollection(baseBean, field);
                if (baseBeanSet == null) {
                  baseBeanSet = Collections.emptySet();
                }
                for (BaseBean bean : baseBeanSet) {
                  process(bean, recursively, processor, processedClasses);
                }
                processedClasses.remove(clazz);
              }
            }
          }
        }
      } else {
        field.setAccessible(true);
        processor.processField(baseBean, field);
      }
    }
    processor.postProcessBean(baseBean);
  }

  public static boolean hasSuperClass(Class<?> clazz, Class<BaseBean> parent) {
    if (clazz == null)
      return false;
    if (clazz == parent)
      return true;
    return hasSuperClass(clazz.getSuperclass(), parent);
  }

  @SuppressWarnings("unchecked")
  private static Collection<BaseBean> getBaseBeanCollection(Object instance, Field field) throws IllegalAccessException {
    return (Collection<BaseBean>) field.get(instance);
  }

  @SuppressWarnings("unchecked")
  private static TrackableLinkedHashSet<BaseBean> getTrackableLinkedHashSet(Object instance, Field field) throws IllegalAccessException {
    return (TrackableLinkedHashSet<BaseBean>) field.get(instance);
  }

  public static class FieldPopulator implements FieldProcessor {

    @Override
    public void processField(BaseBean bean, Field field) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {
      if (Modifier.isFinal(field.getModifiers()) || Modifier.isStatic(field.getModifiers())) {
        return;
      }
      Class fieldClass = field.getType();
      if (fieldClass.isPrimitive()) {
        if (fieldClass.equals(Boolean.TYPE)) {
          field.setBoolean(bean, RandomUtils.nextBoolean());
        } else if (fieldClass.equals(Character.TYPE)) {
          field.setChar(bean, RandomStringUtils.random(1).charAt(0));
        } else if (fieldClass.equals(Byte.TYPE)) {
          field.setByte(bean, (byte) RandomUtils.nextInt(Byte.MAX_VALUE));
        } else if (fieldClass.equals(Short.TYPE)) {
          field.setShort(bean, (short) RandomUtils.nextInt(Short.MAX_VALUE));
        } else if (fieldClass.equals(Integer.TYPE)) {
          field.setInt(bean, RandomUtils.nextInt());
        } else if (fieldClass.equals(Long.TYPE)) {
          field.setLong(bean, RandomUtils.nextLong());
        } else if (fieldClass.equals(Float.TYPE)) {
          field.setFloat(bean, RandomUtils.nextFloat());
        } else if (fieldClass.equals(Double.TYPE)) {
          field.setDouble(bean, RandomUtils.nextDouble());
        }
      } else if (fieldClass.equals(String.class)) {
        field.set(bean, RandomStringUtils.randomAlphabetic(10));
      } else if (Number.class.isAssignableFrom(fieldClass)) {
        Constructor constructor = fieldClass.getConstructor(String.class);
        Object value = constructor.newInstance(RandomStringUtils.randomNumeric(2));
        field.set(bean, value);
      } else if (BaseBean.class.isAssignableFrom(fieldClass)) {
        // if a bean has a field of its type, it would cause an endless loop.
        if (bean.getClass() != field.getType()) {
          field.set(bean, fieldClass.newInstance());
        }
      } else if (fieldClass.equals(Date.class)) {
        field.set(bean, new Date(RandomUtils.nextLong()));
      } else if (fieldClass.isEnum()) {
        Object[] enums = fieldClass.getEnumConstants();
        Object enumValue = enums[RandomUtils.nextInt(enums.length)];
        field.set(bean, enumValue);
      }
    }

    @Override
    public void processCollection(BaseBean bean, Field field) throws IllegalAccessException, InstantiationException {
      Type genericFieldType = field.getGenericType();
      if (genericFieldType instanceof ParameterizedType) {
        ParameterizedType aType = (ParameterizedType) genericFieldType;
        Type[] fieldArgTypes = aType.getActualTypeArguments();
        for (Type fieldArgType : fieldArgTypes) {
          Class<?> clazz = (Class<?>) fieldArgType;
          if (hasSuperClass(clazz, BaseBean.class) && !clazz.equals(bean.getClass())) {
            Collection<BaseBean> col = (Collection<BaseBean>) field.getType().newInstance();
            for (int i = 0; i < RandomUtils.nextInt(5); i++) {
              col.add((BaseBean) clazz.newInstance());
            }
            field.set(bean, col);
          }
        }
      }
    }

    @Override
    public void postProcessBean(BaseBean bean) {
      bean.setId(AbstractTestBase.ID_DISPENSER.nextId());
    }
  }

  public static boolean compareBeans(BaseBean bean1, BaseBean bean2, boolean recursive) throws IllegalAccessException {
    if (bean1 == null && bean2 == null) {
      return true;
    }
    basicChecks(bean1, bean2);
    for (Field field : bean1.getClass().getDeclaredFields()) {
      field.setAccessible(true);
      Class fieldClass = field.getType();
      if (BaseBean.class.isAssignableFrom(fieldClass)) {
        if (recursive) {
          assertTrue(compareBeans((BaseBean) field.get(bean1), (BaseBean) field.get(bean2), recursive));
        } else {
          assertEquals("Values differ on field: " + field.toGenericString(), field.get(bean1), field.get(bean2));
        }
      } else if (Collection.class.isAssignableFrom(fieldClass)) {
        Collection col1 = (Collection) field.get(bean1);
        Collection col2 = (Collection) field.get(bean2);
        if (col1 == null && col2 == null) {
          return true;
        }
        basicChecks(col1, col2);
        assertEquals("Collections have a different size on field: " + field.toGenericString(), col1.size(), col2.size());
        for (Object next : col1) {
          assertTrue("One of the collections does not contain item: " + next.toString() + " on field: " + field.toGenericString(), col2.contains(next));
        }
      } else {
        Object field1 = field.get(bean1);
        Object field2 = field.get(bean2);
        basicChecks(field1, field2);
        assertEquals("Values differ on field: " + field.toGenericString(), field.get(bean1), field.get(bean2));
      }
    }
    return true;
  }

  private static void basicChecks(Object o1, Object o2) {
    if (o1 == null && o2 == null) {
      return;
    }
    assertTrue("One of the objects is null", o1 != null && o2 != null);
    assertTrue("Objects have a different class", o1.getClass().equals(o2.getClass()));
  }

}
