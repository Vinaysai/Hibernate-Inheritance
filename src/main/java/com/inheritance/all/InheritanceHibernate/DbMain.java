package com.inheritance.all.InheritanceHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.all.bean.Cheque;
import com.all.bean.CreditCard;

public class DbMain {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		System.out.println("Session created");
		CreditCard c = new CreditCard();

		c.setAmount(2000);
		c.setCreditCardType("SBI");
		c.setPaymentId(1);

		Cheque c1 = new Cheque();

		c1.setPaymentId(2);
		c1.setAmount(2600);
		c1.setChequeType("ICICI");

		session.save(c);
		session.save(c1);

		System.out.println("Object saved successfully.....!!");

		Transaction tx = session.beginTransaction();
		tx.commit();
		session.close();
	}
}
