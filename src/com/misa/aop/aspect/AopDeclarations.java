package com.misa.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AopDeclarations {
	@Pointcut("execution(* com.misa.aop.dao.*.*(..))")
	public void forDaoPackage() {}
	
	@Pointcut("execution(* com.misa.aop.dao.*.get*(..))")
	public void getMethods() {}
	
	@Pointcut("execution(* com.misa.aop.dao.*.set*(..))")
	public void setMethods() {}
	
	@Pointcut("forDaoPackage() && !(getMethods() || setMethods())")
	public void daoMinusGetSet() {}
}
