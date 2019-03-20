package com.ypan.single;

public class Singleton4 {
	
	private Singleton4() {}
	
	private static class Inner{
		private static Singleton4 instance=new Singleton4();
	}
	
	public static Singleton4 getInstance() {
		return Inner.instance;
	}
	
}
