package com.learn.hibernate.queries.hql.util;

import com.learn.hibernate.queries.hql.model.Book;
import com.learn.hibernate.queries.hql.model.Group;
import com.learn.hibernate.queries.hql.model.Library;
import com.learn.hibernate.queries.hql.model.Student;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * 
 * @author Dimon
 * This class is meant for persisting using Annotations. It is not required to use a seperate configuration file
 * for annotation. But here we use it to avoid the hibernate mapping using XML files (*.hbm.xml).
 *
 */
public class HibernateAnnotationUtil {

    private static SessionFactory sessionFactory;
    private static ServiceRegistry serviceRegistry;

	static {
		try {
            Configuration configuration = new Configuration();
            configuration.configure("hibernate.hql/hql-hibernate.cfg.xml");
            configuration.addAnnotatedClass(Group.class);
            configuration.addAnnotatedClass(Library.class);
            configuration.addAnnotatedClass(Book.class);
            configuration.addAnnotatedClass(Student.class);
            serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		} catch (Throwable ex) {
			throw new ExceptionInInitializerError(ex);
		}
	}
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	public static void shutdown() {
		// Close caches and connection pools
		getSessionFactory().close();
	}

}
