package it.sella.com.afterservice;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class LoggingAfterAdvice implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object target, Method method, Object[] args, Object returnValue) throws Throwable {
		System.out.println("after calling:" + method.getName() + "On :" + target.getClass() + " With Arguments :"
				+ args.length + "Giving Return Value :" + returnValue);

	}

}
