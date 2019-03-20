package com.ypan.sort.test2;

public class S1 {
	
	public void sort(int[] a) {
		for (int i = 1; i < a.length; i++) {
			int key=a[i];
			int j;
			for (j = i; j >0 && a[j-1]>key; j--) {
				a[j]=a[j-1];
			}
			a[j]=key;
		}
	}
	
	
}
