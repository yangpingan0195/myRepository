package com.ypan.single;

/**
 * 饿汉式
 * @author Administrator
 *
 */
public class Singleton1 {
	
	private static Singleton1 instance=new Singleton1();
	private Singleton1() {}
	
	public static Singleton1 sgetInstance() {
		return instance;
	}
	
}
