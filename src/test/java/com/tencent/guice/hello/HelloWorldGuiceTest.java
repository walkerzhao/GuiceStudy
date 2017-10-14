package com.tencent.guice.hello;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;

public class HelloWorldGuiceTest {
	
	@Inject
	protected HelloWorldGuice helloWorldGuice;
	
	@Before
	public void setup() {
		Guice.createInjector(new HelloWorldGuiceModule()).injectMembers(this);
	}

	@Test
	public void testSayHello() {
//		Injector injector = Guice.createInjector(new HelloWorldGuiceModule());
//		HelloWorldGuice helloWorldGuice = injector.getInstance(HelloWorldGuice.class);
		helloWorldGuice.sayHello();
//		fail("Not yet implemented");
	}

}
