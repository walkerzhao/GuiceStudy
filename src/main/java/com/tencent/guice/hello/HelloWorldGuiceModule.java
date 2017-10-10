package com.tencent.guice.hello;

import com.google.inject.AbstractModule;

/**
 * Injectors 会通过 Module 来获取可能的 Bindings
 * @author ewanzhao
 *
 */
public class HelloWorldGuiceModule extends AbstractModule {

	@Override
	protected void configure() {
		// bind service to implementation class
        bind(HelloWorldGuice.class).to(HelloWorldGuiceImpl.class);
		
	}

}
