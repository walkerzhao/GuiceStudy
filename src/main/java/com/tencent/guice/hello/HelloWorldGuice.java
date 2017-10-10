package com.tencent.guice.hello;

import com.google.inject.ImplementedBy;

@ImplementedBy(HelloWorldGuiceImpl.class)
public interface HelloWorldGuice {
	public void sayHello();

}
