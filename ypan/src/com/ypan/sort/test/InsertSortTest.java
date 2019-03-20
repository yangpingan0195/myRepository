package com.ypan.sort.test;

public class InsertSortTest {
	
	public void sort(int[] a) {
		for (int i = 1; i < a.length; i++) {
			int j;
			int key=a[i];
			for (j = i; j>0&&a[j-1]>key; j--) {
				a[j]=a[j-1];
			}
			a[j]=key;
		}
	}
	
	
}
