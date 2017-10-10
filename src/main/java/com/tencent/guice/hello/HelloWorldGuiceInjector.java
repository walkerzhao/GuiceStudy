package com.tencent.guice.hello;

import com.google.inject.AbstractModule;

public class HelloWorldGuiceInjector extends AbstractModule {

	@Override
	protected void configure() {
		// bind service to implementation class
        bind(HelloWorldGuice.class).to(HelloWorldGuiceImpl.class);
		
	}

}
