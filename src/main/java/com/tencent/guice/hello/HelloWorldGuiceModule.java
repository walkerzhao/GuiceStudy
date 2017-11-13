package com.tencent.guice.hello;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

/**
 * Injectors 会通过 Module 来获取可能的 Bindings
 * @author ewanzhao
 *
 */
public class HelloWorldGuiceModule extends AbstractModule {

	@Override
	protected void configure() {
		// bind service to implementation class
        bind(HelloWorldGuice.class).annotatedWith(Names.named("hello")).to(HelloWorldGuiceImpl.class);
        bind(HelloWorldGuice.class).annotatedWith(Names.named("hello1")).to(HelloWorldGuiceImpl2.class);
//        bind(HelloWorldGuice.class).to(new HelloWorldGuiceImpl());
		
	}

}
