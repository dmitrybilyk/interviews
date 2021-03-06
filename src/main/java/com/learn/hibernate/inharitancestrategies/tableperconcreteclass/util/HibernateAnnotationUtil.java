package com.learn.hibernate.inharitancestrategies.tableperconcreteclass.util;

import com.learn.hibernate.inharitancestrategies.tableperconcreteclass.FourWheeler;
import com.learn.hibernate.inharitancestrategies.tableperconcreteclass.TwoWheeler;
import com.learn.hibernate.inharitancestrategies.tableperconcreteclass.Vehicle;
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
            configuration.configure("hibernateinharitance.tableperclass/tableperclassstrategy-hibernate.cfg.xml");
            configuration.addAnnotatedClass(FourWheeler.class);
            configuration.addAnnotatedClass(TwoWheeler.class);
            configuration.addAnnotatedClass(Vehicle.class);
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
