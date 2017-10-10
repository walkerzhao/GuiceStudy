package com.tencent.guice.annotation;

import java.util.ArrayList;
import java.util.List;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;
import com.tencent.guice.hello.HelloWorldGuice;
import com.tencent.guice.hello.HelloWorldGuiceModule;

public class AnnotationTest {
	public static void main(String[] args) {
		List<Module> modules = null;
//		 = loadModule();
		Injector injector = Guice.createInjector();
		
		System.out.println(injector.getAllBindings());
        HelloWorldGuice helloGuice = injector.getInstance(HelloWorldGuice.class);
        helloGuice.sayHello();
	}

	private static List<Module> loadModule() {
		List<Module> modules = new ArrayList<Module>();
		modules.add(new HelloWorldGuiceModule());
		return modules;
	}

}
