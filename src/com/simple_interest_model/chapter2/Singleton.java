package com.simple_interest_model.chapter2;

public class Singleton {
	
	private static final Singleton singleton=new Singleton();
	//限制产生多个对象
	private Singleton(){
		
	}
	//通过该方法获得实例对象
	public static Singleton getSingleton(){
		return singleton;
	}
	//类中的其他方法尽量是 static
	public static void doSomething(){
		
	}
}
