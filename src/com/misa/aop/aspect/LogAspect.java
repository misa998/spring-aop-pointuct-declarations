package com.misa.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(3)
public class LogAspect {
	
	@Before("com.misa.aop.aspect.AopDeclarations.daoMinusGetSet()")
	public void logging(JoinPoint joinPoint) {
		System.out.println(joinPoint.getSignature());
	}

}
