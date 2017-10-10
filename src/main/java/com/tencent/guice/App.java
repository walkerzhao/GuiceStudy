package com.tencent.guice;

import java.util.ArrayList;
import java.util.List;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;
import com.tencent.guice.hello.HelloWorldGuice;
import com.tencent.guice.hello.HelloWorldGuiceInjector;

public class App {
	public static void main(String[] args) {
		List<Module> modules = loadModule();
		Injector injector = Guice.createInjector(modules);
        HelloWorldGuice helloGuice = injector.getInstance(HelloWorldGuice.class);
        helloGuice.sayHello();
	}

	private static List<Module> loadModule() {
		List<Module> modules = new ArrayList<Module>();
		modules.add(new HelloWorldGuiceInjector());
		return modules;
	}

}
