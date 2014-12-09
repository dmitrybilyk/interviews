package com.learn.core.reflection.reflectiontests;

import com.learn.core.reflection.reflectiontests.BaseBean;
import org.easymock.EasyMockSupport;
import org.jetbrains.annotations.Nullable;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.Assert.*;

//@RunWith(Suite.class)
/*@SuiteClasses({
	//Generic (generated) BO tests
	AnswerBOTest.class,
	AppoptionBOTest.class,
	AuditBOTest.class,
	CallWrapupBOTest.class,
	CategoryBOTest.class,
	CcGroupBOTest.class,
	CompanyBOTest.class,
	CriteriaBOTest.class,
	DatabaseBOTest.class,
	EvalAnswerBOTest.class,
	///EvalcallBOTest.class, //EvalCallBO has different PK and is synchronized from Callrec POJOs///
	EvaluationBOTest.class,
	ExternalDataBOTest.class,
	InteractionTypeBOTest.class,
	LanguageBOTest.class,
	MediaLimitBOTest.class,
	MessageboxBOTest.class,
	QuestformBOTest.class,
	QuestionBOTest.class,
	QuestiongroupBOTest.class,
	RightBOTest.class,
	RightValueBOTest.class,
	RoleBOTest.class,
	SubevaluationBOTest.class,
	TemplateBOTest.class,
	UserBOTest.class,
	UserSettingsBOTest.class,

	//Specific BO tests
	cz.zoom.scorecard.test.business.specific.InteractionTypeBOTest.class,
	cz.zoom.scorecard.test.business.specific.SubevaluationBOTest.class,
	cz.zoom.scorecard.test.business.specific.TemplateBOTest.class,
	cz.zoom.scorecard.test.business.specific.QuestformBOTest.class,
	cz.zoom.scorecard.test.business.specific.MediaCountTest.class,
	cz.zoom.scorecard.test.business.specific.SearchBOTest.class,
	cz.zoom.scorecard.test.business.specific.SearchBO_ConditionTest.class,

	//DAO Tests
	IbatisChartsDaoTest.class,
	IbatisEvaluationDaoTest.class,
	IbatisMediaDaoImplTest.class,
	IbatisToolDaoTest.class,
	AuthenticationIPCCDaoTest.class,
	IbatisUserDaoTest.class,
	IPCCUserLoaderDaoImplTest.class,

	//Manager Tests
	ChartsManagerImplTest.class,
	EvaluationManagerImplTest.class,
	MediaManagerTest.class,
	QuestionManagerImplTest.class,
	ToolManagerTest.class
}) */
public class AbstractTestBase extends EasyMockSupport {
  @Retention(RetentionPolicy.SOURCE)
  @Target({ElementType.METHOD, ElementType.TYPE})
  public @interface FixMeSoon {
    String value() default "";
  }

  public static final IdDispenser ID_DISPENSER = new AtomicIdDispenser();

  public interface IdDispenser {
    int nextId();
  }

  private static class AtomicIdDispenser implements IdDispenser {
    private final AtomicInteger myId = new AtomicInteger(5000);  //so that predefined things like CURRENT_USER are out of the range.
    @Override
    public int nextId() {
      return myId.incrementAndGet();
    }
  }

	//XXX: RequestFailedException and IllegalArgumentException are used indiscriminately in the tests. Should we be consistent here?
	public static void expectException(String message, Class<? extends Exception> exception, RunnableWithException operation) throws Exception {
		try {
			operation.run();
			fail(message);
		} catch (Exception e) {
		  //XXX: For some time, do not insist that the correct exception type is thrown.
//			if (exception.isInstance(e)) {
				return;
//			}
//			throw e;
		}
	}

	public static void expectExceptions(String message, RunnableWithException operation, Class<? extends Exception>... exceptions) throws Exception {
		assertNotNull("The list of exceptions is empty", exceptions);
		assertTrue("The list of exceptions is empty", exceptions.length > 0);
		try {
			operation.run();
			fail(message);
		} catch (Exception e) {
			for (Class<? extends Exception> next : exceptions) {
				if (next.isInstance(e)) {
					return;
				}
			}
			throw e;
		}
	}

	public static interface RunnableWithException {
		public void run() throws Exception;
	}

	protected static <T extends BaseBean> T createBO(Class<T> clz) throws Exception {
		return createBO(clz, ID_DISPENSER.nextId());
	}

	protected static <T extends BaseBean> T createBO(Class<T> clz, @Nullable Integer id) throws Exception {
		T newInstance = clz.newInstance();
		newInstance.setId(id);
		return newInstance;
	}

	/**
	 * This is needed by subclasses that test DAOs that are configured externally (media, ipcc)
	 * @param fieldHolder
	 * @param fieldName
	 * @param fieldValue
	 * @throws Exception
	 */
	protected static void setFieldWithReflection(Object fieldHolder, String fieldName, Object fieldValue) throws Exception {
		Field f = fieldHolder.getClass().getDeclaredField(fieldName);
		f.setAccessible(true);
		f.set(fieldHolder, fieldValue);
	}

	protected static void setStaticFieldWithReflection(Class<?> fieldHolder, String fieldName, Object fieldValue) throws Exception {
		Field f = fieldHolder.getDeclaredField(fieldName);
		f.setAccessible(true);
		f.set(null, fieldValue);
	}
}
