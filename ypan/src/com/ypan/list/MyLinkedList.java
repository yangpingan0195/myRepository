package com.ypan.list;

public class MyLinkedList {
	
	private Node first;
	private int size;
	private Node last;
	
	public MyLinkedList() {
		size=0;
	}
	
	public void addLast(Object o) {
		Node node = new Node(o);
		if(first==null&&last==null) {
			first=node;
			last=node;
		}
		if(last!=null) {
			last.setAfter(node);
			node.setBefore(last);
			last=node;
		}
		
		size++;
	}
	
	public void addFirst(Object o) {
		Node node = new Node(o);
		if(first==null&&last==null) {
			first=node;
			last=node;
		}
		if(first!=null) {
			first.setBefore(node);
			node.setAfter(first);
			first=node;
		}
		size++;
	}
	
	public void removeFirst() throws Exception {
		if(first==null) {
			throw new Exception();
		}
		Node temp = first.getAfter();
		if(temp==null) {
			first=null;
			last=null;
		}else {
			first=temp;
		}
		size--;
	}
	
	public void removeLast() throws Exception {
		if(last==null) {
			throw new Exception();
		}
		Node temp=last.getBefore();
		if(temp==null) {
			first=null;
			last=null;
		}else {
			last=temp;
		}
		size--;
	}
	
	public Object getFirst() {
		return first.getValue();
	}
	
	public Object getLast(){
		return last.getValue();
	}
	
	public Object get(int i) throws Exception {
		if(i<0||i>size) {
			throw new Exception();
		}
		if(i==0) {
			return first.getValue();
		}else if(i==size) {
			return last.getValue();
		}else {
			Node node=first;
			for (int j = 0; j < i; j++) {
				node = node.getAfter();
			}
			return node.getValue();
		}
	}
	
	public void update(int i,Object o) throws Exception {
		if(i<0||i>size) {
			throw new Exception();
		}
		if(i==0) {
			first.setValue(o);
		}else if(i==size) {
			last.setValue(o);
		}else {
			Node node=first;
			for (int j = 0; j < i; j++) {
				node = node.getAfter();
			}
			node.setValue(o);
		}
		
		
	}
	
	public int getCount() {
		return size;
	}
}
