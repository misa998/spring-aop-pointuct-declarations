package com.misa.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class MyDemoLoggingAspectOrdered {

	@Before("com.misa.aop.aspect.AopDeclarations.daoMinusGetSet()")
	public void methodName() {
		System.out.println("# " + getClass());
	}
}
