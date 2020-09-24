package com.misa.aop.dao;
import org.springframework.stereotype.Component;

@Component
public class AccountDAO {
	private int i;
	
	public void addAccount(int i) {
		System.out.println("> " + getClass());
	}

	public int getI() {
		System.out.println("> i= " + i);
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	
}
