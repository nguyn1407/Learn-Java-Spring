package com.luv2code.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aopdemo.dao.AccountDAO;
import com.luv2code.aopdemo.dao.MembershipDAO;

public class MainDemoApp {

	public static void main(String[] args) {

		// read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		
		// get the bean from spring container
		AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
		
		MembershipDAO theMembershipDAO = context.getBean("membershipDAO", MembershipDAO.class);
		
		// call the business method
		theAccountDAO.addAccount(new Account(), true);
		theAccountDAO.doWork();
		
		theAccountDAO.setName("Billy");
		theAccountDAO.setService("ABCD");
		
		String name = theAccountDAO.getName();
		String ser = theAccountDAO.getService();
		
		// call the membership method
		theMembershipDAO.addABCD();
		theMembershipDAO.goToSleep(true);
		
		// close the context
		context.close();
	}

}