package com.ypan.list;

public class Node {

	private Node before;
	private Object value;
	private Node after;

	public Node(Object o) {
		this.value=o;
	}
	
	public Node getBefore() {
		return before;
	}

	public void setBefore(Node before) {
		this.before = before;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public Node getAfter() {
		return after;
	}

	public void setAfter(Node after) {
		this.after = after;
	}

}
