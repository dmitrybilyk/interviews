package com.learn.core.reflection.reflectiontests;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Set;

import static org.junit.Assert.*;
import static org.junit.Assume.assumeTrue;

public abstract class GenericBOTest<ParentType extends BaseBean> extends AbstractTestBase {
	protected final ElementAccessor<ParentType> myAccessor;

	protected GenericBOTest(ElementAccessor<ParentType> accessor) {
		myAccessor = accessor;
	}

	public static interface ExpectedValueConverter<T> {
		public boolean isCorrectConvertedValue(T valueBeingSet, T actualValue);
		public static class ID<T> implements ExpectedValueConverter<T> {
			public boolean isCorrectConvertedValue(T valueBeingSet, T actualValue) {
				return valueBeingSet == null ? actualValue == null : valueBeingSet.equals(actualValue);
			}
			@SuppressWarnings("unchecked")
			private static final ID ourInstance = new ID();
			@SuppressWarnings("unchecked")
			public static <T> ID<T> getInstance() {
				return (ID<T>)ourInstance;
			}
		}
		public static final ExpectedValueConverter<String> STRING_CONVERTER = new ExpectedValueConverter<String>() {
			@Override
			public boolean isCorrectConvertedValue(String valueBeingSet, String actualValue) {
				if (valueBeingSet == null) {
					return actualValue == null || "".equals(actualValue);
				}
				return valueBeingSet.trim().equals(actualValue) || valueBeingSet.equals(actualValue);
			}
		};
	}

	public static final ExpectedValueConverter<String> getStringConverter() {
	  return ExpectedValueConverter.STRING_CONVERTER;
	}

	protected static interface PropertyAccessor<E extends BaseBean, V> {
		public String getPropertyName();
		V getValue(E element);
		void setValue(E element, V value) throws Exception;
		RunnableWithException invocation(E element, V value);
	}

	protected static class ReflectivePropertyAccessor<E extends BaseBean, ValueType> implements PropertyAccessor<E, ValueType>{
		protected final Class<ValueType> myPropertyType;
		protected final String myPropertyName;
		protected final Class<E> myBeanClass;
		public ReflectivePropertyAccessor(String propertyName, Class<E> beanClass, Class<ValueType> propertyType) {
			myPropertyName = propertyName;
			myPropertyType = propertyType;
			myBeanClass = beanClass;
		}
		@Override
		public String getPropertyName() {
			return myBeanClass.getSimpleName() + "." + myPropertyName;
		}
		@SuppressWarnings("unchecked")
		public ValueType getValue(E element) {
			try {
				return (ValueType) getGetter().invoke(element);
			} catch (Exception e) {
				fail(e.getMessage());
				return null;
			}
		}
		protected Method getGetter() {
			try {
				String propertyNameCapitalized = Character.toUpperCase(myPropertyName.charAt(0)) + myPropertyName.substring(1);
				return myBeanClass.getMethod("get" + propertyNameCapitalized);
			} catch (Exception e) {
				fail(e.getMessage());	//cannot do anything about it.
				return null;
			}
		}
		public void setValue(E element, ValueType value) throws Exception {
			try {
        if (value != null) {
          getSetter().invoke(element, value);
        }
			} catch (InvocationTargetException e) {
				if (e.getCause() instanceof Exception) {
					throw (Exception) e.getCause();
				}
				if (e.getCause() instanceof Error) {
					throw (Error) e.getCause();
				}
				throw e;
			}
		}
		protected Method getSetter() {
			String propertyNameCapitalized = Character.toUpperCase(myPropertyName.charAt(0)) + myPropertyName.substring(1);
			try {
				return myBeanClass.getMethod("set" + propertyNameCapitalized, myPropertyType);
			} catch (Exception e) {
				fail(e.getMessage());	//cannot do anything about it.
				return null;
			}
		}
		public RunnableWithException invocation(final E element, final ValueType value) {
			return new RunnableWithException() {
				@Override
				public void run() throws Exception {
					setValue(element, value);
				}
			};
		}
	}

	protected static class ReflectivePrivatePropertyAccessor<E extends BaseBean, ValueType> extends ReflectivePropertyAccessor<E, ValueType> {
		public ReflectivePrivatePropertyAccessor(String propertyName, Class<E> beanClass, Class<ValueType> propertyType) {
			super(propertyName, beanClass, propertyType);
		}
		protected Method getGetter() {
			try {
				String propertyNameCapitalized = Character.toUpperCase(myPropertyName.charAt(0)) + myPropertyName.substring(1);
				Method result = myBeanClass.getDeclaredMethod("get" + propertyNameCapitalized);
				result.setAccessible(true);
				return result;
			} catch (Exception e) {
				fail(e.getMessage());	//cannot do anything about it.
				return null;
			}
		}
		protected Method getSetter() {
			String propertyNameCapitalized = Character.toUpperCase(myPropertyName.charAt(0)) + myPropertyName.substring(1);
			try {
				Method result = myBeanClass.getDeclaredMethod("set" + propertyNameCapitalized, myPropertyType);
				result.setAccessible(true);
				return result;
			} catch (Exception e) {
				fail(e.getMessage());	//cannot do anything about it.
				return null;
			}
		}
	}

	protected static interface ContainmentPropertyAccessor<Container extends BaseBean, Contained extends BaseBean> {
		Set<Contained> getValues(Container parent);
		void add(Container parent, Contained child) throws Exception;
		void remove(Container parent, Contained child) throws Exception;
		RunnableWithException addInvocation(Container parent, Contained child);
		RunnableWithException removeInvocation(Container parent, Contained child);
		String getPropertyName();
	}

	protected static class ReflectiveContainmentPropertyAccessor<Container extends BaseBean, Contained extends BaseBean> implements ContainmentPropertyAccessor<Container, Contained> {
		private Method myGetter;
		private Method myAdder;
		private Method myRemover;
		private Class<Container> myContainerClass;
		private String myPropertyName;
		public ReflectiveContainmentPropertyAccessor(String propertyName, String pluralPropertyName, Class<Container> parentClass, Class<Contained> childClass) throws Exception {
			myPropertyName = propertyName;
			myContainerClass = parentClass;
			String propertyNameCapitalized = Character.toUpperCase(propertyName.charAt(0)) + propertyName.substring(1);
			String pluralPropertyNameCapitalized = Character.toUpperCase(pluralPropertyName.charAt(0)) + pluralPropertyName.substring(1);
			myGetter = parentClass.getMethod("get" + pluralPropertyNameCapitalized);
			myAdder = parentClass.getDeclaredMethod("add" + propertyNameCapitalized, childClass);
			myRemover = parentClass.getDeclaredMethod("remove" + propertyNameCapitalized, childClass);
		}
		@Override
		public String getPropertyName() {
			return myContainerClass.getSimpleName() + "." + myPropertyName;
		}
		public void add(Container parent, Contained child) throws Exception {
			try {
				myAdder.invoke(parent, child);
			} catch (InvocationTargetException e) {
				if (e.getCause() instanceof Exception) {
					throw (Exception) e.getCause();
				}
				if (e.getCause() instanceof Error) {
					throw (Error) e.getCause();
				}
				throw e;
			}
		}
		public void remove(Container parent, Contained child) throws Exception {
			try {
				myRemover.invoke(parent, child);
			} catch (InvocationTargetException e) {
				if (e.getCause() instanceof Exception) {
					throw (Exception) e.getCause();
				}
				if (e.getCause() instanceof Error) {
					throw (Error) e.getCause();
				}
				throw e;
			}
		}
		@SuppressWarnings("unchecked")
		public Set<Contained> getValues(Container parent) {
			try {
				return (Set<Contained>) myGetter.invoke(parent);
			} catch (Exception e) {
				fail();
				return null;
			}
		}
		public RunnableWithException addInvocation(final Container parent, final Contained child) {
			return new RunnableWithException() {
				@Override
				public void run() throws Exception {
					add(parent, child);
				}
			};
		}
		public RunnableWithException removeInvocation(final Container parent, final Contained child) {
			return new RunnableWithException() {
				@Override
				public void run() throws Exception {
					remove(parent, child);
				}
			};
		}
	}

	protected static interface ElementAccessor<E extends BaseBean> {
		public E newInstance() throws Exception;
		public E getSubclassInstance() throws Exception;
		public Integer getId(E element);
		public void setId(E element, Integer newId) throws Exception;
		public Class<E> getBOClass();
	}

	protected static class NaiveElementAccessor<E extends BaseBean> implements ElementAccessor<E> {
		private final Class<E> myClass;
		private final E mySubclassInstance;

		public NaiveElementAccessor(Class<E> clz, E subclassInstance) {
			myClass = clz;
			mySubclassInstance = subclassInstance;
		}
		@Override
		public Class<E> getBOClass() {
			return myClass;
		}
		@Override
		public E newInstance() throws Exception {
			return myClass.newInstance();
		}
		@Override
		public E getSubclassInstance() throws Exception {
			return mySubclassInstance;
		}
		public Integer getId(E element) {
			return element.getId();
		}
		public void setId(E element, Integer newId) throws Exception {
			element.setId(newId);
		}
	}

//	protected static class EvalcallBOElementAccessor extends NaiveElementAccessor<EvalcallBO> {
//	  public EvalcallBOElementAccessor() {
//	    super(EvalcallBO.class, new EvalcallBO(){});
//	  }
//	  @Override
//	  public void setId(EvalcallBO element, Integer newId) throws Exception {
//	    super.setId(element, newId);
//	    element.setSid(String.valueOf(newId));
//	  }
//	}

	/**
	 * This is a workaround that signals a problem of its own. Methods getId/setId should be overridden.
	 */
	protected static class ElementAccessorWithIdProperty<E extends BaseBean> extends NaiveElementAccessor<E> {
		private final PropertyAccessor<E, Integer> myIdProperty;

		public ElementAccessorWithIdProperty(Class<E> clz, E subclassInstance, PropertyAccessor<E, Integer> idProperty) {
			super(clz, subclassInstance);
			myIdProperty = idProperty;
		}
		public Integer getId(E element) {
			return myIdProperty.getValue(element);
		}
		public void setId(E element, Integer newId) throws Exception {
			myIdProperty.setValue(element, newId);
		}
	}

	@Test
	public void checkGetIdSetIdIsOverridden() throws Exception {
		ParentType obj = createNewObject();
		myAccessor.setId(obj, 5);
		assertEquals("getId should be overridden", Integer.valueOf(5), obj.getId());
		obj.setId(4);
		assertEquals("setId should be overridden", Integer.valueOf(4), myAccessor.getId(obj));
	}

	@Test
	public void checkEquals() throws Exception {
		ParentType one = myAccessor.newInstance();
		assertNotNull(one);
		assumeTrue(!one.isLocked());
		assumeTrue(!one.hasChanged());
	
		assertTrue("Equals Reflexivity", one.equals(one));
		assertFalse("Nothing should equal null", one.equals(null));
	
		ParentType two = myAccessor.newInstance();
		assertNotNull(two);
		assumeTrue(!two.isLocked());
		assumeTrue(!two.hasChanged());
	
		myAccessor.setId(one, 1);
		myAccessor.setId(two, 1);
		assertEquals("Two objects with the same id are not equal", one, two);
		assertEquals("Two objects with the same id are not equal (or symmetry problem)", two, one);
		assertEquals("Equal objects have different hash codes", one.hashCode(), two.hashCode());
		myAccessor.setId(one, 2 + (int) (Math.random() * 100));
		assertFalse("Two objects with different ids are equal", one.equals(two));
		assertFalse("Two objects with different ids are equal", two.equals(one));
		myAccessor.setId(two, myAccessor.getId(one));
		assertEquals("Two objects are not equal after one is given the same id as the other", one, two);
		assertEquals("Two objects are not equal after one is given the same id as the other (or symmetry problem)", two, one);
		assertEquals("Hash codes of two objects are not equal after one is given the same id as the other", one.hashCode(), two.hashCode());
	}

	@SuppressWarnings("unchecked")
	@Test
	public void checkNewInstance() throws Exception {
		ParentType one = myAccessor.newInstance();
		assertNotNull(one);
		BaseBean newInstance = one.newInstance();
		assertNotNull(myAccessor.getBOClass().getName() + ".newInstance returns null", newInstance);
		assertNotSame(myAccessor.getBOClass().getName() + ".newInstance returns the same object as the method receiver", newInstance, one);
		assertEquals(myAccessor.getBOClass().getName() + ".newInstance returns an object of an unexpected class", one.getClass(), newInstance.getClass());
		assertFalse(myAccessor.getBOClass().getName() + ".newInstance returns a changed object", newInstance.hasChanged());
		assertFalse(myAccessor.getBOClass().getName() + ".newInstance returns a locked object", newInstance.isLocked());
		assertFalse(myAccessor.getBOClass().getName() + ".newInstance returns a something-has-changed object", newInstance.hasAnythingChanged());
		myAccessor.setId(one, 5);
		BaseBean anotherInstance = one.newInstance();
		assertNotNull(myAccessor.getBOClass().getName() + ".newInstance returns null", anotherInstance);
		assertEquals(myAccessor.getBOClass().getName() + ".newInstance returns an object of an unexpected class", one.getClass(), newInstance.getClass());
		assertFalse(myAccessor.getBOClass().getName() + ".newInstance returns an object with the same (non-null) id as parent", myAccessor.getId(one).equals(myAccessor.getId((ParentType) anotherInstance)));
		// presumably, null, but at least should be predictable.
		assertEquals(myAccessor.getBOClass().getName() + ".newInstance returns an object with indeterministic id", myAccessor.getId((ParentType) newInstance), myAccessor.getId((ParentType) anotherInstance));
	}

	@Test
  @Ignore
	public void checkSubclassNotEqual() throws Exception {
		ParentType one = myAccessor.newInstance();
		assertNotNull(one);

		ParentType subclassProper = myAccessor.getSubclassInstance();
		assertNotNull(subclassProper);
		assumeTrue(subclassProper.getClass() != one.getClass());
		assertFalse("object should not be equal to an object of its type's subclass: this would not be symmetric", one.equals(subclassProper));
	
		myAccessor.setId(one, 1);
		myAccessor.setId(subclassProper, 1);
		assertFalse("object should not be equal to an object of its type's subclass: this would not be symmetric", one.equals(subclassProper));
		assertFalse("instance of a subclass should not be equal to an instance of its type's superclass", subclassProper.equals(one));
		assertEquals("hash code should depend on id, not class name", one.hashCode(), subclassProper.hashCode());
	
		myAccessor.setId(one, 2);
		assertFalse("object should not be equal to an object of its type's subclass: this would not be symmetric", one.equals(subclassProper));
		assertFalse("instance of a subclass should not be equal to an instance of its type's superclass", subclassProper.equals(one));
	}

	protected <T> TestSuite testsForSimpleProperty(final PropertyAccessor<ParentType, T> propertyAccessor,
					final ExpectedValueConverter<T> valueConverter, final boolean testNull, final T...values) {
		TestSuite result = new TestSuite("For a simple-valued property " + propertyAccessor.getPropertyName());
		result.addTest(new TestCase(propertyAccessor.getPropertyName() + ".checkSimpleValueProperty") {
			@Override
			protected void runTest() throws Throwable {
				checkSimpleValueProperty(propertyAccessor, valueConverter, testNull, values);
			}
		});
		result.addTest(new TestCase(propertyAccessor.getPropertyName() + ".checkLockingDoesNotChangePropertyValue") {
			@Override
			protected void runTest() throws Throwable {
				checkLockingDoesNotChangePropertyValue(propertyAccessor, values);
			}
		});
		return result;
	}

	protected <EnumType extends Enum<EnumType>> TestSuite testsForEnumProperty(
					final PropertyAccessor<ParentType, EnumType> propertyAccessor, 
					final PropertyAccessor<ParentType, String> counterpartStringProperty,
					final Class<EnumType> enumType, final boolean testNull) {
		TestSuite result = new TestSuite("For an Enum-valued property " + propertyAccessor.getPropertyName());
		result.addTest(new TestCase(propertyAccessor.getPropertyName() + ".checkEnumProperty") {
			@Override
			protected void runTest() throws Throwable {
				checkEnumProperty(propertyAccessor, enumType, testNull);
			}
		});
		if (counterpartStringProperty != null) {
			result.addTest(new TestCase(propertyAccessor.getPropertyName() + ".checkStringCounterpartToEnumProperty") {
				@Override
				protected void runTest() throws Throwable {
					checkStringCounterpartToEnumProperty(propertyAccessor, counterpartStringProperty, enumType, testNull);
				}
			});
		}
		result.addTest(new TestCase(propertyAccessor.getPropertyName() + ".checkLockingDoesNotChangePropertyValue") {
			@Override
			protected void runTest() throws Throwable {
				checkLockingDoesNotChangePropertyValue(propertyAccessor, enumType.getEnumConstants());
			}
		});
		return result;
	}

	protected TestSuite testsForForeignKeyProperty(
					final PropertyAccessor<ParentType, Integer> propertyAccessor) {
		TestSuite result = new TestSuite("For a FK-valued property " + propertyAccessor.getPropertyName());
		result.addTest(new TestCase(propertyAccessor.getPropertyName() + ".checkForeignKeyProperty") {
			@Override
			protected void runTest() throws Throwable {
				checkForeignKeyProperty(propertyAccessor);
			}
		});
		result.addTest(new TestCase(propertyAccessor.getPropertyName() + ".checkLockingDoesNotChangePropertyValue") {
			@Override
			protected void runTest() throws Throwable {
				checkLockingDoesNotChangePropertyValue(propertyAccessor, 0, null, 5);
			}
		});
		return result;
	}

	protected <RefType extends BaseBean> TestSuite testsForSingleValuedAssociations(
					final ElementAccessor<RefType> refAccessor,
					final PropertyAccessor<ParentType, RefType> associationAccessor,
					final PropertyAccessor<RefType, ParentType> inverse, final Class<RefType> refType) {
	  return testsForSingleValuedAssociations(refAccessor, associationAccessor, inverse, refType, false);
  }

  protected <RefType extends BaseBean> TestSuite testsForSingleValuedAssociations(
          final ElementAccessor<RefType> refAccessor,
          final PropertyAccessor<ParentType, RefType> associationAccessor,
          final PropertyAccessor<RefType, ParentType> inverse, final Class<RefType> refType, final boolean immutableOnLocking) {
		TestSuite result = new TestSuite("For an association " + associationAccessor.getPropertyName());
		result.addTest(new TestCase(associationAccessor.getPropertyName() + ".checkAssociationProperty") {
			@Override
			protected void runTest() throws Throwable {
				checkAssociationProperty(refAccessor, associationAccessor, inverse, immutableOnLocking);
			}
		});
		result.addTest(new TestCase(associationAccessor.getPropertyName() + ".checkLockingDoesNotChangePropertyValue") {
			@SuppressWarnings("unchecked")
			@Override
			protected void runTest() throws Throwable {
				RefType[] values = (RefType[]) Array.newInstance(refType, 3);
				values[0] = refAccessor.newInstance();
				refAccessor.setId(values[0], 5);
				values[1] = null;
				values[2] = refAccessor.newInstance();	//uninitialized id
				checkLockingDoesNotChangePropertyValue(associationAccessor, values);
			}
		});
		result.addTest(new TestCase(associationAccessor.getPropertyName() + ".checkLockingDoesNotChangePropertyValue") {
			@SuppressWarnings("unchecked")
			@Override
			protected void runTest() throws Throwable {
				RefType[] values = (RefType[]) Array.newInstance(refType, 3);
				values[0] = refAccessor.newInstance();
				refAccessor.setId(values[0], 5);
				values[1] = null;
				values[2] = refAccessor.newInstance();	//uninitialized id
				checkLockingDoesNotChangePropertyValue(associationAccessor, values);
			}
		});
		return result;
	}

	protected <ChildType extends BaseBean> TestSuite testsForContainments(
					final ElementAccessor<ChildType> childAccessor,
					final ContainmentPropertyAccessor<ParentType, ChildType> containmentProperty,
					final PropertyAccessor<ChildType, ParentType> containerProperty) {
		TestSuite result = new TestSuite("For a containment " + containmentProperty.getPropertyName());
		result.addTest(new TestCase(containmentProperty.getPropertyName() + ".checkContainment") {
			@Override
			protected void runTest() throws Throwable {
				checkContainment(childAccessor, containmentProperty, containerProperty);
			}
		});
		//This test consistently fails. It seems that, although this assumption makes sense, it is not implemented.
		//Rather, when any manager returns an object, it locks all children manually. 
//		result.addTest(new TestCase(containmentProperty.getPropertyName() + ".checkLockingParentLocksChild") {
//			@Override
//			protected void runTest() throws Throwable {
//				checkLockingParentLocksChild(childAccessor, containmentProperty);
//			}
//		});
		//This test does not make much sense. If the object is reported as added by its parent, it
		//does not matter if it is locked or not.
//		result.addTest(new TestCase(containmentProperty.getPropertyName() + ".checkAddingToLockedObjectLocksChild") {
//			@Override
//			protected void runTest() throws Throwable {
//				checkAddingToLockedObjectLocksChild(childAccessor, containmentProperty);
//			}
//		});
		//XXX: nice to have, but not important right now.
//		result.addTest(new TestCase(containmentProperty.getPropertyName() + ".checkContainmentWithEqualNonIdenticalObjects") {
//			@Override
//			protected void runTest() throws Throwable {
//				checkContainmentWithEqualNonIdenticalObjects(childAccessor, containmentProperty);
//			}
//		});
		return result;
	}

  protected <RefType extends BaseBean> TestSuite testMarshalling(final Class<RefType> refClass) {
    TestSuite result = new TestSuite("Test JAXB Marshalling ");
    result.addTest(new TestCase("Class marshalled: " + refClass.getName()) {

      @Rule
      public TemporaryFolder tempFolder = new TemporaryFolder();

      @Override
      protected void runTest() throws Throwable {
        JAXBContext context = JAXBContext.newInstance("cz.zoom.scorecard.business");

        Marshaller m = context.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        BaseBean bean = BOUtils.createAndPopulateBean(refClass, true);
        File file = tempFolder.newFile("bean.xml");
        m.marshal(bean, file);

        Unmarshaller um = context.createUnmarshaller();
        RefType restored = (RefType) um.unmarshal(file);

        assertTrue("Some properties on original and deserialized bean are different", BOUtils.compareBeans(bean, restored, true));
      }
    });
    return result;
  }


	protected ParentType createNewObject() throws Exception {
		ParentType result = myAccessor.newInstance();
		assertNotNull(result);
		assumeTrue(!result.isLocked());
		assumeTrue(!result.hasChanged());
		assumeTrue(!result.hasAnythingChanged());
		assumeTrue(null == myAccessor.getId(result));
		return result;
	}

	@Test
	public void checkIdImmutableOnLocking() throws Exception {
		final ParentType obj = createNewObject();
		RunnableWithException setRandomId = new RunnableWithException() {
			@Override
			public void run() throws Exception {
				myAccessor.setId(obj, (int) (Math.random() * 100));
			}
		};
		RunnableWithException setSameId = new RunnableWithException() {
			@Override
			public void run() throws Exception {
				myAccessor.setId(obj, myAccessor.getId(obj));
			}
		};
		obj.lock(); // without any ID
		expectException("it should not be possible to change id of a locked object " + myAccessor.getBOClass().getSimpleName(), UnsupportedOperationException.class, setRandomId);
		expectException("it should not be possible to set (even the same) id to a locked object " + myAccessor.getBOClass().getSimpleName(), UnsupportedOperationException.class, setSameId);

		BeanFactory.getInstance().unlockBean(obj, true);
		// Now should be OK to set id.
		setSameId.run();
		setRandomId.run();
		setSameId.run();

		obj.lock(); // with the new ID
		expectException("it should not be possible to set (even the same) id to a locked object " + myAccessor.getBOClass().getSimpleName(), UnsupportedOperationException.class, setSameId);
		expectException("it should not be possible to change id of a locked object " + myAccessor.getBOClass().getSimpleName(), UnsupportedOperationException.class, setRandomId);
		expectException("it should not be possible to set (even the same) id to a locked object " + myAccessor.getBOClass().getSimpleName(), UnsupportedOperationException.class, setSameId);
	}

	class CheckSimplePropertyValue<T> {
		private PropertyAccessor<ParentType, T> propertyAccessor;
		private ExpectedValueConverter<T> valueConverter;
		private boolean testNull;
		private T[] values;

		public CheckSimplePropertyValue(final PropertyAccessor<ParentType, T> propertyAccessor,
				final ExpectedValueConverter<T> valueConverter, final boolean testNull, final T... values) {
			this.propertyAccessor = propertyAccessor;
			this.valueConverter = valueConverter;
			this.testNull = testNull;
			this.values = values;
		}

		public void check(ParentType obj, boolean expectedLocked) throws Exception {
			T oldValue = propertyAccessor.getValue(obj);
			propertyAccessor.setValue(obj, oldValue);
			assertFalse("setting the same value to property " + propertyAccessor.getPropertyName() + " should not mark the object as changed", 
							obj.hasChanged());
			assertFalse("setting the same value to property " + propertyAccessor.getPropertyName() + " should not mark the object as something-has-changed", 
							obj.hasAnythingChanged());
			assertEquals("setting the same value to property " + propertyAccessor.getPropertyName() + " should not change the locking of the object", 
							expectedLocked, obj.isLocked()); // should not become (un)locked spuriously
			assertEquals("setting the same value to property " + propertyAccessor.getPropertyName() + " should not actually change the value of the property", 
							oldValue, propertyAccessor.getValue(obj));
			if (testNull) {
				boolean nullIsDifferent = !valueConverter.isCorrectConvertedValue(null, oldValue);
				propertyAccessor.setValue(obj, null);
        //XXX: Not so important for unlocked objects
				//allow situation when ""->null is marked as changed
        if (obj.isLocked() && nullIsDifferent) {
          assertEquals("setting property " + propertyAccessor.getPropertyName() + " to null should predictably make the object as (un)changed", nullIsDifferent, obj.hasChanged());
          assertEquals("setting property " + propertyAccessor.getPropertyName() + " to null should predictably make the object as (un)changed", nullIsDifferent, obj.hasAnythingChanged());
        }
				assertEquals("setting property " + propertyAccessor.getPropertyName() + " to null should not change the locking of the object", expectedLocked, obj.isLocked()); // should not become (un)locked spuriously
				assertTrue("incorrect value after setting property " + propertyAccessor.getPropertyName() + " to null", valueConverter.isCorrectConvertedValue(null, propertyAccessor.getValue(obj)));
			}
			boolean nextValueIsDifferent = !valueConverter.isCorrectConvertedValue(values[0], propertyAccessor.getValue(obj));
			for (T next : values) {
	      if (obj.isLocked()) {
	        obj.lock();  //reset changed flag
	      }
				propertyAccessor.setValue(obj, next);
				//XXX: Not so important for unlocked objects
				if (obj.isLocked()) {
  				//Well, the comment is correct on the first iteration. Afterwards, we only check that changed mark does not mysteriously disappear.
  				assertEquals("setting property " + propertyAccessor.getPropertyName() + " to " + next + " should mark the object as changed", nextValueIsDifferent, obj.hasChanged());
  				assertEquals("setting property " + propertyAccessor.getPropertyName() + " to " + next + " should mark the object as something-has-changed", nextValueIsDifferent, obj.hasAnythingChanged());
				}
				assertEquals("setting property " + propertyAccessor.getPropertyName() + " to " + next + " should not change the locking of the object", expectedLocked, obj.isLocked()); // should not become (un)locked spuriously
				assertTrue("incorrect value after setting property " + propertyAccessor.getPropertyName() + " to " + next, valueConverter.isCorrectConvertedValue(next, propertyAccessor.getValue(obj)));
				nextValueIsDifferent = true;  //hopefully, the values provided in the list ARE different.
			}
		}
	}

	private <T> void checkSimpleValueProperty(final PropertyAccessor<ParentType, T> propertyAccessor,
					final ExpectedValueConverter<T> valueConverter, final boolean testNull, final T... values) throws Exception {
		assertTrue(values != null);
		assertTrue(values.length > 0);
		assertTrue(values[0] != null); // other values may be null
		assertTrue(!"".equals(values[0]));
		ParentType obj = createNewObject();
		new CheckSimplePropertyValue<T>(propertyAccessor, valueConverter, testNull, values).check(obj, false);
		// same with locked objects
		obj = createNewObject();
		obj.lock();
		new CheckSimplePropertyValue<T>(propertyAccessor, valueConverter, testNull, values).check(obj, true);
	}

	/**
	 * For simple and enum-valued properties.
	 */
	private <T> void checkLockingDoesNotChangePropertyValue(PropertyAccessor<ParentType, T> propertyAccessor, T... values)
					throws Exception {
		for (T next : values) {
			ParentType obj = createNewObject();
			propertyAccessor.setValue(obj, next);
			// In this test, we don't care about the converters, the expected
			// conversion is checked elsewhere.
			// Here, we only check that the value is not changed by locking.
			T valueActuallySet = propertyAccessor.getValue(obj);
			obj.lock();
			assertFalse("locking should not mark the object as changed", obj.hasChanged());
			assertFalse("locking should not mark the object as something-has-changed", obj.hasAnythingChanged());
			assertEquals("locking should not change the value of property " + propertyAccessor.getPropertyName(), valueActuallySet, propertyAccessor.getValue(obj));
		}
	}

	class CheckEnumProperty<EnumType extends Enum<EnumType>> {
		private PropertyAccessor<ParentType, EnumType> propertyAccessor;
		private Class<EnumType> enumType;
		private boolean testNull;
		public CheckEnumProperty(final PropertyAccessor<ParentType, EnumType> propertyAccessor, final Class<EnumType> enumType, final boolean testNull) {
			this.propertyAccessor = propertyAccessor;
			this.enumType = enumType;
			this.testNull = testNull;
		}
		public void check(ParentType obj) throws Exception {
			boolean expectedLocked = obj.isLocked();
			EnumType oldValue = propertyAccessor.getValue(obj);
			propertyAccessor.setValue(obj, oldValue);
			assertFalse("setting the same value to property " + propertyAccessor.getPropertyName() + " should not mark the object as changed", 
							obj.hasChanged());
			assertFalse("setting the same value to property " + propertyAccessor.getPropertyName() + " should not mark the object as something-has-changed", 
							obj.hasAnythingChanged());
			assertEquals("setting the same value to property " + propertyAccessor.getPropertyName() + " should not change the locking of the object", 
							expectedLocked, obj.isLocked()); // should not become (un)locked spuriously
			assertEquals("setting the same value to property " + propertyAccessor.getPropertyName() + " should not actually change the value of the property", 
							oldValue, propertyAccessor.getValue(obj));
			for (EnumType next : enumType.getEnumConstants()) {
				if (oldValue != null && next == oldValue) {
					continue;
				}
				oldValue = null;
				propertyAccessor.setValue(obj, next);
				if (expectedLocked) {
				  //XXX: not so important for unlocked
				  assertTrue("setting property " + propertyAccessor.getPropertyName() + " should mark the object as changed", obj.hasChanged());
				  assertTrue("setting property " + propertyAccessor.getPropertyName() + " should mark the object as somehting-has-changed", obj.hasAnythingChanged());
				}
				assertEquals("setting property " + propertyAccessor.getPropertyName() + " should not change the locking of the object", expectedLocked, obj.isLocked());
				assertEquals("incorrect value after setting property " + propertyAccessor.getPropertyName() + " to " + next, next, propertyAccessor.getValue(obj));
			}
			if (testNull) {
				propertyAccessor.setValue(obj, null);
        if (expectedLocked) {
          //XXX: not so important for unlocked
          assertTrue("setting property " + propertyAccessor.getPropertyName() + " should mark the object as changed", obj.hasChanged());
          assertTrue("setting property " + propertyAccessor.getPropertyName() + " should mark the object as somehting-has-changed", obj.hasAnythingChanged());
        }
				assertEquals("setting property " + propertyAccessor.getPropertyName() + " should not change the locking of the object", expectedLocked, obj.isLocked());
				assertEquals("incorrect value after setting property " + propertyAccessor.getPropertyName() + " to null", null, propertyAccessor.getValue(obj));
			}
		}
	}

	private <EnumType extends Enum<EnumType>> void checkEnumProperty(
					final PropertyAccessor<ParentType, EnumType> propertyAccessor, final Class<EnumType> enumType,
					final boolean testNull) throws Exception {
		ParentType obj = createNewObject();
		new CheckEnumProperty<EnumType>(propertyAccessor, enumType, testNull).check(obj);
		// Same with locked objects
		obj = createNewObject();
		obj.lock();
		new CheckEnumProperty<EnumType>(propertyAccessor, enumType, testNull).check(obj);
	}

	abstract class CheckStringCounterpart<EnumType extends Enum<EnumType>> {
		protected final PropertyAccessor<ParentType, EnumType> enumProperty;
		protected final PropertyAccessor<ParentType, String> counterpartStringProperty;
		protected final Class<EnumType> enumType;
		protected final boolean testNull;

		public CheckStringCounterpart(final PropertyAccessor<ParentType, EnumType> enumProperty,
				final PropertyAccessor<ParentType, String> counterpartStringProperty, final Class<EnumType> enumType,
				final boolean testNull) {
			this.enumProperty = enumProperty;
			this.counterpartStringProperty = counterpartStringProperty;
			this.enumType = enumType;
			this.testNull = testNull;
		}
		public void check(ParentType obj) throws Exception {
			// 1. Set enum property, observe string property change
			for (EnumType next : enumType.getEnumConstants()) {
				enumProperty.setValue(obj, next);
				assertEquals("setting enum property " + enumProperty.getPropertyName() + " to " + next + " should change the counterpart property " + counterpartStringProperty.getPropertyName() + " accordingly", 
								next.toString(), counterpartStringProperty.getValue(obj));
			}
			// 2. set String property, observe enum property change (or, for
			// locked objects, that the exception is thrown).
			for (EnumType next : enumType.getEnumConstants()) {
				RunnableWithException invocation = counterpartStringProperty.invocation(obj, next.toString());
				executeSetStringAndCheckEnum(invocation, obj, next);
			}
			// 3. set string property that does not exist
			StringBuilder propertyValueThatCannotExist = new StringBuilder();
			for (EnumType next : enumType.getEnumConstants()) {
				propertyValueThatCannotExist.append(next.toString());
			}
			RunnableWithException invocation = counterpartStringProperty.invocation(obj, propertyValueThatCannotExist
							.toString());
			executeSetInvalidStringValue(invocation, obj);
			if (testNull && counterpartStringProperty != null) {
				enumProperty.setValue(obj, null);
				assertEquals("Null enum property should map to an empty string in counterpart String property" + counterpartStringProperty.getPropertyName(), "", counterpartStringProperty.getPropertyName());
			}
		}

		protected abstract void executeSetStringAndCheckEnum(RunnableWithException op, ParentType obj,
						EnumType expectedResult) throws Exception;

		protected abstract void executeSetInvalidStringValue(RunnableWithException op, ParentType obj) throws Exception;
	}
	class CheckStringCounterpart_Unlocked<EnumType extends Enum<EnumType>> extends CheckStringCounterpart<EnumType> {
		public CheckStringCounterpart_Unlocked(final PropertyAccessor<ParentType, EnumType> enumProperty,
				final PropertyAccessor<ParentType, String> counterpartStringProperty, final Class<EnumType> enumType,
				final boolean testNull) {
			super(enumProperty, counterpartStringProperty, enumType, testNull);
		}
		protected void executeSetStringAndCheckEnum(RunnableWithException op, ParentType obj, EnumType expectedResult)
						throws Exception {
			op.run();
			assertEquals("setting string property should change the counterpart enum property accordingly", 
							expectedResult, enumProperty.getValue(obj));
		}

		protected void executeSetInvalidStringValue(RunnableWithException op, ParentType obj) throws Exception {
			expectException("It should not be possible to set string value that does not correspond to any enum", IllegalArgumentException.class, op);
		}
	}
	class CheckStringCounterpart_Locked<EnumType extends Enum<EnumType>> extends CheckStringCounterpart<EnumType> {
		public CheckStringCounterpart_Locked(final PropertyAccessor<ParentType, EnumType> enumProperty,
				final PropertyAccessor<ParentType, String> counterpartStringProperty, final Class<EnumType> enumType,
				final boolean testNull) {
			super(enumProperty, counterpartStringProperty, enumType, testNull);
		}
		protected void executeSetStringAndCheckEnum(RunnableWithException op, ParentType obj, EnumType expectedResult) throws Exception {
//XXX not currently tested AT ALL. This is probably not so important.
		  //expectException("It should not be possible to set any string value (even the one that corresponds to a enum) to an enum property of a locked object", UnsupportedOperationException.class, op);
		}

		protected void executeSetInvalidStringValue(RunnableWithException op, ParentType obj) throws Exception {
			expectException("It should not be possible to set any string value (even the one that does not correspond to any enum) to an enum property of a locked object", UnsupportedOperationException.class, op);
		}
	}

	protected <EnumType extends Enum<EnumType>> void checkStringCounterpartToEnumProperty(
					final PropertyAccessor<ParentType, EnumType> enumProperty,
					final PropertyAccessor<ParentType, String> counterpartStringProperty, final Class<EnumType> enumType,
					final boolean testNull) throws Exception {
		ParentType obj = createNewObject();
		new CheckStringCounterpart_Unlocked<EnumType>(enumProperty, counterpartStringProperty, enumType, testNull).check(obj);
		// Same with locked objects
		obj = createNewObject();
		obj.lock();
		new CheckStringCounterpart_Locked<EnumType>(enumProperty, counterpartStringProperty, enumType, testNull).check(obj);
	}

	abstract class CheckFKProperty {
		protected boolean myValueChanged = false;
		protected PropertyAccessor<ParentType, Integer> propertyAccessor;

		public CheckFKProperty(PropertyAccessor<ParentType, Integer> propertyAccessor) {
			this.propertyAccessor = propertyAccessor;
		}

		public void check(ParentType obj) throws Exception {
			Integer oldValue = propertyAccessor.getValue(obj);
			executeAndCheck(obj, propertyAccessor.invocation(obj, oldValue), oldValue);
			myValueChanged = (oldValue != null);
			executeAndCheck(obj, propertyAccessor.invocation(obj, null), null);
			myValueChanged = true;
			executeAndCheck(obj, propertyAccessor.invocation(obj, 1), 1);
			executeAndCheck(obj, propertyAccessor.invocation(obj, Integer.MIN_VALUE), Integer.MIN_VALUE);
			executeAndCheck(obj, propertyAccessor.invocation(obj, null), null);
			executeAndCheck(obj, propertyAccessor.invocation(obj, Integer.MAX_VALUE), Integer.MAX_VALUE);
			int randomValue = (int) (1000 * Math.random());
			executeAndCheck(obj, propertyAccessor.invocation(obj, randomValue), randomValue);
			executeAndCheck(obj, propertyAccessor.invocation(obj, 0x566), 0x566);
		}

		protected abstract void executeAndCheck(ParentType obj, RunnableWithException op, Integer valueBeingSet)
						throws Exception;
	}
	class CheckFKProperty_Unlocked extends CheckFKProperty {
		public CheckFKProperty_Unlocked(PropertyAccessor<ParentType, Integer> propertyAccessor) {
			super(propertyAccessor);
		}

		@Override
		protected void executeAndCheck(ParentType obj, RunnableWithException op, Integer valueBeingSet) throws Exception {
			op.run();
			assertEquals("Unexpected value after value has been set", valueBeingSet, propertyAccessor.getValue(obj));
			//XXX: For FK properties, it seems to be EXPECTED that the object is not changed. I don't know why, but still...
//			assertEquals("Unexpectedly (un)changed after value has been set", myValueChanged, obj.hasChanged());
//			assertEquals("Unexpectedly something-has-changed (or vice versa) after value has been set", myValueChanged, obj.hasAnythingChanged());
			assertEquals("Should not become spuriously (un)locked after a value has been set", false, obj.isLocked());
		}
	}
	// For locked objects, it should not be possible to set anything.
	class CheckFKProperty_Locked extends CheckFKProperty {
		public CheckFKProperty_Locked(PropertyAccessor<ParentType, Integer> propertyAccessor) {
			super(propertyAccessor);
		}
		@Override
		protected void executeAndCheck(ParentType obj, RunnableWithException op, Integer valueBeingSet) throws Exception {
		  //XXX: this may not be so important
//			expectException("It should not be possible to change FK property of a locked object of type " + myAccessor.getBOClass().getSimpleName(), UnsupportedOperationException.class, op);
//			assertFalse("Setting FK failed, should not have mark the object as changed", obj.hasChanged());
//			assertFalse("Setting FK failed, should not have mark the object as something-has-changed", obj.hasAnythingChanged());
//			assertTrue("Setting FK should not have unlocked the object", obj.isLocked());
		}
	}
	private void checkForeignKeyProperty(final PropertyAccessor<ParentType, Integer> propertyAccessor) throws Exception {
		new CheckFKProperty_Unlocked(propertyAccessor).check(createNewObject());
		ParentType obj = createNewObject();
		myAccessor.setId(obj, 128);
		new CheckFKProperty_Unlocked(propertyAccessor).check(obj);

		obj = createNewObject();
		propertyAccessor.setValue(obj, (int) (Math.random() * 1000));
		obj.lock();
		new CheckFKProperty_Locked(propertyAccessor).check(obj);

		obj = createNewObject();
		propertyAccessor.setValue(obj, null);
		obj.lock();
		new CheckFKProperty_Locked(propertyAccessor).check(obj);
	}

	abstract class CheckAssociationProperty<RefType extends BaseBean> {
		protected boolean myValueChanged = false;
		protected PropertyAccessor<ParentType, RefType> associationAccessor;
		protected ElementAccessor<RefType> refAccessor;
		protected PropertyAccessor<RefType, ParentType> inverse;

		public CheckAssociationProperty(ElementAccessor<RefType> refAccessor, PropertyAccessor<ParentType, RefType> associationAccessor,
				PropertyAccessor<RefType, ParentType> inverse) {
			this.associationAccessor = associationAccessor;
			this.refAccessor = refAccessor;
			this.inverse = inverse;
		}

		public void check(ParentType obj) throws Exception {
			RefType oldValue = associationAccessor.getValue(obj);
			executeAndCheckUnlocked(obj, associationAccessor.invocation(obj, oldValue), oldValue);
			myValueChanged = (oldValue != null);
			executeAndCheckUnlocked(obj, associationAccessor.invocation(obj, null), null);
			myValueChanged = true;
			RefType initializedValue = refAccessor.newInstance();
			refAccessor.setId(initializedValue, (int) (1000 * Math.random()));
			executeAndCheckUnlocked(obj, associationAccessor.invocation(obj, initializedValue), initializedValue);
			RefType uninitializedValue = refAccessor.newInstance();
			executeAndCheckUnlocked(obj, associationAccessor.invocation(obj, uninitializedValue), uninitializedValue);
			executeAndCheckUnlocked(obj, associationAccessor.invocation(obj, initializedValue), initializedValue);
			RefType uninitializedLockedValue = refAccessor.newInstance();
			uninitializedLockedValue.lock();
			executeAndCheckLocked(obj, associationAccessor.invocation(obj, uninitializedLockedValue),
							uninitializedLockedValue);
			RefType initializedLockedValue = refAccessor.newInstance();
			refAccessor.setId(initializedValue, (int) (1000 * Math.random()));
			initializedLockedValue.lock();
			executeAndCheckLocked(obj, associationAccessor.invocation(obj, initializedLockedValue), initializedLockedValue);
		}

		protected abstract void executeAndCheckUnlocked(ParentType obj, RunnableWithException op, RefType valueBeingSet)
						throws Exception;

		protected abstract void executeAndCheckLocked(ParentType obj, RunnableWithException op, RefType valueBeingSet)
						throws Exception;
	}
	// Seems that the operation should succeed no matter what the locked status is
	class CheckAssociationPropertyWithPredefinedLockStatus<RefType extends BaseBean> extends CheckAssociationProperty<RefType> {
		private boolean myLockStatus;
		private boolean myImmutableOnLocking;

		public CheckAssociationPropertyWithPredefinedLockStatus(final ElementAccessor<RefType> refAccessor,
					final PropertyAccessor<ParentType, RefType> associationAccessor,
					final PropertyAccessor<RefType, ParentType> inverse,
					boolean immutableOnLocking) {
			super(refAccessor, associationAccessor, inverse);
			myImmutableOnLocking = immutableOnLocking;
		}

		public void check(ParentType obj) throws Exception {
			myLockStatus = obj.isLocked();
			super.check(obj);
		}

		@Override
		protected void executeAndCheckUnlocked(ParentType obj, RunnableWithException op, RefType valueBeingSet)
						throws Exception {
			executeAndCheck(obj, op, valueBeingSet, false);
		}

		@Override
		protected void executeAndCheckLocked(ParentType obj, RunnableWithException op, RefType valueBeingSet)
						throws Exception {
		  executeAndCheck(obj, op, valueBeingSet, true);
		}

		private void executeAndCheck(ParentType obj, RunnableWithException op, RefType valueBeingSet, boolean valueWasLocked)
						throws Exception {
      if (myImmutableOnLocking && myLockStatus) {
        expectException("Should be immutable", UnsupportedOperationException.class, op);
      } else {
  			op.run();
  			assertEquals("Unexpected value after value has been set", valueBeingSet, associationAccessor.getValue(obj));
  			if (valueWasLocked) {
  			  //XXX: not so important for unlocked.
  			  assertEquals("Unexpectedly (un)changed after value has been set", myValueChanged, obj.hasChanged());
  			  assertEquals("Unexpectedly something-has-changed (or vice versa) after value has been set", myValueChanged, obj.hasAnythingChanged());
  			}
  			assertEquals("Should not become spuriously (un)locked after a value has been set", myLockStatus, obj.isLocked());
  			if (valueBeingSet != null && inverse != null) {
  				assertEquals("Association end should not become spuriously (un)locked after it is assigned", valueWasLocked, valueBeingSet.isLocked());
  				assertTrue("Association end should have become changed after it is assigned", valueBeingSet.hasChanged());
  				assertTrue("Association end should have become something-has-changed after it is assigned", valueBeingSet.hasAnythingChanged());
  				assertEquals("Unexpected inverse value", obj, inverse.getValue(valueBeingSet));
  			}
      }
		}
	}

	private <RefType extends BaseBean> void checkAssociationProperty(final ElementAccessor<RefType> refAccessor,
					final PropertyAccessor<ParentType, RefType> associationAccessor,
					final PropertyAccessor<RefType, ParentType> inverse, boolean immutableOnLocking) throws Exception {
		new CheckAssociationPropertyWithPredefinedLockStatus<RefType>(refAccessor, associationAccessor, inverse, immutableOnLocking).check(createNewObject());
		ParentType obj = createNewObject();
		myAccessor.setId(obj, (int) (1000 * Math.random()));
		new CheckAssociationPropertyWithPredefinedLockStatus<RefType>(refAccessor, associationAccessor, inverse, immutableOnLocking).check(obj);
		// Now for locked
		obj = createNewObject();
		obj.lock();
		new CheckAssociationPropertyWithPredefinedLockStatus<RefType>(refAccessor, associationAccessor, inverse, immutableOnLocking).check(obj);
		obj = createNewObject();
		myAccessor.setId(obj, (int) (1000 * Math.random()));
		obj.lock();
		new CheckAssociationPropertyWithPredefinedLockStatus<RefType>(refAccessor, associationAccessor, inverse, immutableOnLocking).check(obj);
		// XXX: Seems that associating an unlocked object with a locked object does not change the object's lock status. Is it an expected behavior?
	}

	class CheckContainment<ChildType extends BaseBean> {
		protected ElementAccessor<ChildType> childAccessor;
		protected ContainmentPropertyAccessor<ParentType, ChildType> containmentProperty;
		protected PropertyAccessor<ChildType, ParentType> containerProperty;

		public CheckContainment(final ElementAccessor<ChildType> childAccessor,
				final ContainmentPropertyAccessor<ParentType, ChildType> containmentProperty,
				final PropertyAccessor<ChildType, ParentType> containerProperty) {
			this.childAccessor = childAccessor;
			this.containmentProperty = containmentProperty;
			this.containerProperty = containerProperty;
		}

		@SuppressWarnings("unchecked")
		public void check(final ParentType obj) throws Exception {
			assertTrue(containmentProperty.getValues(obj).isEmpty());
			assertTrue(!obj.hasChanged());
			assertTrue(!obj.hasAnythingChanged());
			boolean wasLocked = obj.isLocked();
			// First, check that it is impossible to add/remove null.
			expectExceptions("It should not be possible to add null to a multi-valued containment property " + containmentProperty.getPropertyName(), new RunnableWithException() {
				@Override
				public void run() throws Exception {
					containmentProperty.add(obj, null);
				}
			}, NullPointerException.class, IllegalArgumentException.class);
			assertEquals("Failed operation should not have changed locking", wasLocked, obj.isLocked());
			// Now check the simplest scenario: element is added.
			ChildType child = childAccessor.newInstance();
			childAccessor.setId(child, 5);
			assertTrue(!child.isAssigned());
			if (containerProperty != null) {
				assertNull(containerProperty.getValue(child));
			}
			executeAndCheckAddingUnlocked(obj, containmentProperty.addInvocation(obj, child), child);
			assertEquals("Adding an object should not have changed locking", wasLocked, obj.isLocked());

			// A locked element is added.
			ChildType anotherChild = childAccessor.newInstance();
			childAccessor.setId(anotherChild, 10);
			anotherChild.lock();
			if (containerProperty != null) {
				assertNull(containerProperty.getValue(anotherChild));
			}
			executeAndCheckAddingLocked(obj, containmentProperty.addInvocation(obj, anotherChild), anotherChild);
			assertEquals("Adding a locked child should not have changed locking of the parent", wasLocked, obj.isLocked()); // XXX: should this lock the container? probably not

			// Remove a child
			child.lock(); // to make sure it is "clean" and unchanged.
			executeAndCheckRemoval(obj, containmentProperty.removeInvocation(obj, child), child);

			// "Remove" spurious element
			ChildType spurious = childAccessor.newInstance();
			childAccessor.setId(spurious, Integer.MAX_VALUE);
			spurious.lock(); // to make it clean
			assertTrue(!containmentProperty.getValues(obj).contains(spurious));
			executeAndCheckRemovingSpurious(obj, containmentProperty.removeInvocation(obj, spurious), spurious);
		}

		protected void executeAndCheckAddingUnlocked(ParentType obj, RunnableWithException op, ChildType child) throws Exception {
			executeAndCheckAddingNoMatterWhatTheLockingIs(obj, op, child);
		}

		protected void executeAndCheckAddingLocked(ParentType obj, RunnableWithException op, ChildType child) throws Exception {
			executeAndCheckAddingNoMatterWhatTheLockingIs(obj, op, child);
			if (obj.isLocked()) {
			  assertTrue("The parent should be reported as something-has-changed upon adding a child", obj.hasAnythingChanged());
			}
		}

		protected void executeAndCheckAddingNoMatterWhatTheLockingIs(ParentType obj, RunnableWithException op, ChildType child) throws Exception {
			op.run();
			assertFalse("The added child should not be reported as deleted", child.isToBeDeleted());
			if (containerProperty != null) {
				assertTrue("The added child should be reported as changed: its container reference should have changed", child.hasChanged());
				assertTrue("The added child should be reported as something-has-changed", child.hasAnythingChanged());
			}
			//XXX: Some containments (e.g., CriteriaBO.*) do report change. Does it matter if they should be something-have-changed, anyway?
			//Comment for the time being.
//			assertFalse("The parent should not be reported as changed upon adding a child", obj.hasChanged());
			if (containerProperty != null) {
				assertEquals("Container reference " + containerProperty.getPropertyName() + "should point to the parent", obj, containerProperty.getValue(child));
				assertTrue("Containment set " + containerProperty.getPropertyName() + "should contain the child", containmentProperty.getValues(obj).contains(child));
			}
		}

		protected void executeAndCheckRemoval(ParentType obj, RunnableWithException op, ChildType child) throws Exception {
			op.run();
			if (containerProperty != null) {
			  assertTrue("The removed child should be reported as changed: its container reference should have changed", child.hasChanged());
			  assertTrue("The removed child should be reported as something-has-changed", child.hasAnythingChanged());
			}
			if (containerProperty != null) {
				assertNull("Incorrect value of container reference " + containerProperty.getPropertyName(), containerProperty.getValue(child));
			}
			assertFalse("The parent still reports the child among its children after deletion", containmentProperty.getValues(obj).contains(child));
			// Does not make sense to check properties of the parent: they have been changed even before we started removal.
		}

		protected void executeAndCheckRemovingSpurious(ParentType obj, RunnableWithException op, ChildType child)
						throws Exception {
			op.run();
			assertFalse("The object was never a child, should not be reported as deleted", child.isToBeDeleted());
			assertFalse("The object was never a child, should not be reported as changed", child.hasChanged());
			assertFalse("The object was never a child, should not be reported as something-has-changed", child.hasAnythingChanged());
			assertFalse("The object was never a child of anything, should not be reported as assigned", child.isAssigned());
			if (containerProperty != null) {
				assertNull("Spurious container reference " + containerProperty.getPropertyName(), containerProperty.getValue(child));
			}
			assertFalse("The parent added a spurious child instead of ignoring its deletion", containmentProperty.getValues(obj).contains(child));
		}
	}
	class CheckContainment_Locked<ChildType extends BaseBean> extends CheckContainment<ChildType> {
		public CheckContainment_Locked(final ElementAccessor<ChildType> childAccessor,
				final ContainmentPropertyAccessor<ParentType, ChildType> containmentProperty,
				final PropertyAccessor<ChildType, ParentType> containerProperty) {
			super(childAccessor, containmentProperty, containerProperty);
		}
		protected void executeAndCheckRemoval(ParentType obj, RunnableWithException op, ChildType child) throws Exception {
      TrackableLinkedHashSet<ChildType> values = (TrackableLinkedHashSet<ChildType>) containmentProperty.getValues(obj);
      assumeTrue(values.isLocked());
      values.relock();
			super.executeAndCheckRemoval(obj, op, child);
			assertTrue("The removed child should be reported as scheduled for deletion", child.isToBeDeleted());
			//XXX: deleting does not remove assigned flag for some unknown reason. But isAssigned is (currently?) not asked separately from isToBeDeleted, anyway.
//			assertFalse("The removed child should not be reported as assigned", child.isAssigned());
			assertTrue("The locked element should report a deleted child in its deleted set", values.getRemoved().contains(child));
		}
		protected void executeAndCheckAddingLocked(ParentType obj, RunnableWithException op, ChildType child) throws Exception {
			super.executeAndCheckAddingLocked(obj, op, child);
			assertTrue("The added child should be reported as assigned", child.isAssigned());
		}
		protected void executeAndCheckAddingNoMatterWhatTheLockingIs(ParentType obj, RunnableWithException op, ChildType child) throws Exception {
			super.executeAndCheckAddingNoMatterWhatTheLockingIs(obj, op, child);
			TrackableLinkedHashSet<ChildType> values = (TrackableLinkedHashSet<ChildType>) containmentProperty.getValues(obj);
			assertTrue("The locked element should report an added child in its added set", values.getAdded().contains(child));
			assertFalse("The locked element should not report an added child in its unchanged set", values.getUnchanged().contains(child));
		}
	}

	private <ChildType extends BaseBean> void checkContainment(final ElementAccessor<ChildType> childAccessor,
					final ContainmentPropertyAccessor<ParentType, ChildType> containmentProperty,
					final PropertyAccessor<ChildType, ParentType> containerProperty) throws Exception {
		ParentType unlocked = createNewObject();
		myAccessor.setId(unlocked, 3);
		new CheckContainment<ChildType>(childAccessor, containmentProperty, containerProperty).check(unlocked);
		ParentType lockedObject = createNewObject();
		myAccessor.setId(lockedObject, 1);
		lockedObject.lock();
		new CheckContainment_Locked<ChildType>(childAccessor, containmentProperty, containerProperty).check(lockedObject);
	}

	/**
	 * This is known to fail. The question is whether we want to get rid of this
	 * inconsistency, which could be quite a sophisticated thing to do.
	 */
	private <ChildType extends BaseBean> void checkContainmentWithEqualNonIdenticalObjects(
					ElementAccessor<ChildType> childAccessor,
					ContainmentPropertyAccessor<ParentType, ChildType> containmentProperty) throws Exception {
		ParentType obj = createNewObject();
		myAccessor.setId(obj, 4);
		obj.lock();
		ChildType one = childAccessor.newInstance();
		childAccessor.setId(one, 5);
		ChildType two = childAccessor.newInstance();
		childAccessor.setId(two, 5);
		containmentProperty.add(obj, one);
		// We can't reasonably expect that the object two automatically knows
		// that one was added, so we don't check that.
		containmentProperty.remove(obj, two);
		// Now, however, we would definitely like to see one knowing it was
		// removed, as well as two.
		// After all, it is it who was actually removed, wasn't it?
		assertTrue("The object being deleted should be reported as scheduled for deletion", two.isToBeDeleted());
		assertTrue("The original object should be reported as scheduled for deletion", one.isToBeDeleted());
	}
}
