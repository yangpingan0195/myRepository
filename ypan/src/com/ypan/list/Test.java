package com.ypan.list;

public class Test {
	public static void main(String[] args) throws Exception {
		MyLinkedList list=new MyLinkedList();

		list.addLast("bbb");
		list.addFirst("aaa");
		list.addFirst("ccc");
		System.out.println(list.getCount());
		list.update(1, "1111");
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
	}
}
