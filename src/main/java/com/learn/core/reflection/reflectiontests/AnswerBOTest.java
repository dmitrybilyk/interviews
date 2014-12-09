package com.learn.core.reflection.reflectiontests;

import junit.framework.TestSuite;

import java.math.BigDecimal;

public class AnswerBOTest extends GenericBOTest<AnswerBO> {
	@SuppressWarnings("serial")
	public AnswerBOTest() throws Exception {
		super(new ElementAccessorWithIdProperty<AnswerBO>(AnswerBO.class, new AnswerBO() {}, new ReflectivePrivatePropertyAccessor<AnswerBO, Integer>("answerid", AnswerBO.class, Integer.class)));
	}

	public static TestSuite suite() throws Exception {
		TestSuite result = new TestSuite(AnswerBOTest.class.getName());
		new AnswerBOTest().fillSuite(result);
		return result;
	}

	public void fillSuite(TestSuite result) throws Exception {
//		result.addTest(testsForSimpleProperty(new ReflectivePropertyAccessor<AnswerBO, Integer>("answerOrder", AnswerBO.class, Integer.class),
//				ExpectedValueConverter.ID.<Integer>getInstance(), true, 3, null, Integer.MAX_VALUE, -1024));
//		result.addTest(testsForSimpleProperty(new ReflectivePropertyAccessor<AnswerBO, String>("answerText", AnswerBO.class, String.class),
//				getStringConverter(), true, "123", null, "null", new Object().toString()));
		result.addTest(testsForSimpleProperty
            (
                    new ReflectivePropertyAccessor<AnswerBO, BigDecimal>("answerValue", AnswerBO.class, BigDecimal.class
                    )
                    ,
				ExpectedValueConverter.ID.<BigDecimal>getInstance(),
                    true,
                    BigDecimal.ONE)
    );

//		result.addTest(testsForEnumProperty(new ReflectivePropertyAccessor<AnswerBO, Compliance>("complianceEnum", AnswerBO.class, Compliance.class),
//				new ReflectivePrivatePropertyAccessor<AnswerBO, String>("compliance", AnswerBO.class, String.class),
//				Compliance.class, false));
//		result.addTest(testsForSimpleProperty(new ReflectivePropertyAccessor<AnswerBO, String>("description", AnswerBO.class, String.class),
//				getStringConverter(), true, "123", null, "null", new Object().toString()));
//		result.addTest(testsForSingleValuedAssociations(new NaiveElementAccessor<QuestionBO>(QuestionBO.class, null), new ReflectivePropertyAccessor<AnswerBO, QuestionBO>("questionBO", AnswerBO.class, QuestionBO.class),
//				null/*XXX: find inverse*/, QuestionBO.class));
//		result.addTest(testsForForeignKeyProperty(new ReflectivePrivatePropertyAccessor<AnswerBO, Integer>("questionid", AnswerBO.class, Integer.class)));
	}
}
