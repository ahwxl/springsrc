package org.springframework.aop.framework;

import org.junit.Test;

import test.aop.PageInterceptor;
import test.beans.Page;
import test.beans.PageService;

public class ProxyFactory2Tests {

	
	@Test
	public void testPage(){
		
		PageService page = new PageService();
		ProxyFactory pf = new ProxyFactory(page);
		
		PageInterceptor pageItr = new PageInterceptor();
		
		pf.addAdvice(pageItr);
		
		PageService pageService = (PageService)pf.getProxy();
		
		pageService.getPage("11");
		
		System.out.println("");
	}
	
}
