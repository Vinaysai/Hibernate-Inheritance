package com.inheritance.all.InheritanceHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	public static  SessionFactory sf;

	public  SessionFactory getsession() {

		Configuration con = new Configuration().configure();
		SessionFactory sf = con.buildSessionFactory();
		return sf;
	}

	public static Session getSession() {

		Session session = sf.openSession();

		return session;

	}

}
