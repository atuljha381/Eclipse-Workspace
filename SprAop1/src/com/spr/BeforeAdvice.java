package com.spr;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforeAdvice implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] arg1, Object arg2) throws Throwable {
		System.out.println("Current stock of the product is "+Customer.product+" units");
		System.out.println("method "+method.getName()+" calling "+arg2);

	}

}
