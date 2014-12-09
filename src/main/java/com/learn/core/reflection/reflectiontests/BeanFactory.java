package com.learn.core.reflection.reflectiontests;

import java.lang.reflect.Field;
import java.util.Set;

public class BeanFactory {

  private static BeanFactory factory = new BeanFactory();

  public static BeanFactory getInstance() {
    return factory;
  }

  public static void destoy() {
    factory = null;
  }

  // for automated tests only!
  public void setId(BaseBean baseBean, Integer id) {
    baseBean.setId(id);
  }

  public static interface TrackableProcessor {
    public void processTrackable(Trackable trackable);
  }

  public void unlockBean(BaseBean baseBean, boolean resetId) {
    baseBean.unlock();
    if (resetId)
      baseBean.setId(null);
  }

  public void unlockAllBeans(BaseBean baseBean) {
    unlockAllBeans(baseBean, true, false, true);
  }

  private void unlockAllBeans(BaseBean baseBean, boolean recursively, boolean includingFields, final boolean resetId) {
    if (!baseBean.isLocked())
      return;
    process(baseBean, recursively, includingFields, new TrackableProcessor() {
      @Override
      public void processTrackable(Trackable trackable) {
        if (trackable instanceof BaseBean) {
          unlockBean((BaseBean) trackable, resetId);
        } else {
          trackable.unlock();
        }
      }
    });
  }

  public void lockAllBeans(BaseBean baseBean) {
    lockAllBeans(baseBean, true, true);
  }

  private void lockAllBeans(BaseBean baseBean, boolean recursively, boolean includingFields) {
    process(baseBean, recursively, includingFields, new TrackableProcessor() {
      @Override
      public void processTrackable(Trackable trackable) {
        if (trackable instanceof BaseBean) {
          if (((BaseBean)trackable).getId() != null) {
            trackable.lock();
          }
        } else {
          trackable.unlock();
          trackable.lock();
        }
      }
    });
  }

  private void process(Trackable trackable, boolean recursively, boolean includingFields, TrackableProcessor processor) {
    processor.processTrackable(trackable);
    if (!recursively) {
      return;
    }
    try {
      for (Field field: trackable.getClass().getDeclaredFields()) {
        field.setAccessible(true);
        Object fieldValue = field.get(trackable);
        if (fieldValue instanceof Trackable) {
          if (fieldValue instanceof BaseBean && !includingFields) {
            continue; // not including fields - skip BaseBean
          }

          processor.processTrackable((Trackable) fieldValue);

          if (fieldValue instanceof Iterable) {
            for (Object item : (Iterable)fieldValue) {
              if (item instanceof Trackable) {
                process((Trackable) item, recursively, includingFields, processor);
              }
            }
          }
        }
      }
    } catch (IllegalArgumentException e) {

    } catch (IllegalAccessException e) {

    }
  }

  @SuppressWarnings("unchecked")
  private Set<BaseBean> getBaseBeanSet(Object instance, Field field) throws IllegalAccessException {
    return (Set<BaseBean>)field.get(instance);
  }

  @SuppressWarnings("unchecked")
  private TrackableLinkedHashSet<BaseBean> getTrackableLinkedHashSet(Object instance, Field field) throws IllegalAccessException {
    return (TrackableLinkedHashSet<BaseBean>)field.get(instance);
  }

}
