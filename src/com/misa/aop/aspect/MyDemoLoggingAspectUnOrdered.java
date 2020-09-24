package com.misa.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


public class MyDemoLoggingAspectUnOrdered {
	@Pointcut("execution(* com.misa.aop.dao.*.*(..))")
	private void forDaoPackage() {}
	
	@Pointcut("execution(* com.misa.aop.dao.*.get*(..))")
	private void getMethods() {}
	
	@Pointcut("execution(* com.misa.aop.dao.*.set*(..))")
	private void setMethods() {}
	
	@Pointcut("forDaoPackage() && !(getMethods() || setMethods())")
	private void daoMinusGetSet() {}
	
	@Before("daoMinusGetSet()")
	public void methodName() {
		System.out.println("# " + getClass());
	}
	
	@Before("daoMinusGetSet()")
	public void performApiAnalytics() {
		System.out.println("# Analytics");
	}

	@Before("daoMinusGetSet()")
	public void logging() {
		System.out.println("# Logging");
	}
}
