package com.misa.aop.dao;
import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {
	private int a;
	
	public void addAccount() {
		System.out.println("> " + getClass());
	}

	public int getA() {
		System.out.println("> a= " + a);
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
	

}
