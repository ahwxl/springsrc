package test.aop;

import java.util.ArrayList;
import java.util.List;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class PageInterceptor implements MethodInterceptor{

	public Object invoke(MethodInvocation invocation) throws Throwable {
		
		List list = new ArrayList();
		
		Object obj = invocation.proceed();
		list.add(obj);
		
		return list;
	}

}
