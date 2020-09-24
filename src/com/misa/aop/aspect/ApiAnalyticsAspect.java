package com.misa.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class ApiAnalyticsAspect {
	
	@Before("com.misa.aop.aspect.AopDeclarations.daoMinusGetSet()")
	public void performApiAnalytics() {
		System.out.println("# Analytics");
	}

}
