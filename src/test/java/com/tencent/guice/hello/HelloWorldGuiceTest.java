package com.tencent.guice.hello;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.name.Named;

public class HelloWorldGuiceTest {
	
	@Inject
	@Named("hello1")
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
