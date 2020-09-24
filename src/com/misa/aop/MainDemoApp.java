package com.misa.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.misa.aop.dao.AccountDAO;
import com.misa.aop.dao.MembershipDAO;

public class MainDemoApp {

	public static void main(String[] args) {
		// read config class
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(DemoConfig.class);
		// get the bean
		AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);
		MembershipDAO membershipDAO = context.getBean("membershipDAO", MembershipDAO.class);
		membershipDAO.addAccount();
		membershipDAO.getA();
		// call a method
		accountDAO.addAccount(1);
		accountDAO.getI();
		// close context
		context.close();
	}

}
