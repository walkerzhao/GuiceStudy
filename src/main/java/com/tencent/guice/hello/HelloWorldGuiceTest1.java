package com.tencent.guice.hello;

import java.util.ArrayList;
import java.util.List;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;

public class HelloWorldGuiceTest1 {
	public static void main(String[] args) {
		List<Module> modules = null;
//		 = loadModule();
		Injector injector = Guice.createInjector();
		
//		System.out.println(injector.getAllBindings());
        HelloWorldGuice helloGuice = injector.getInstance(HelloWorldGuice.class);
        helloGuice.sayHello();
	}

	private static List<Module> loadModule() {
		List<Module> modules = new ArrayList<Module>();
		modules.add(new HelloWorldGuiceModule());
		return modules;
	}

}
