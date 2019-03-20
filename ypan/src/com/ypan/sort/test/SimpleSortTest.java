package com.ypan.sort.test;

public class SimpleSortTest {
	
	public void sort(int[] a) {
		
		for (int i = 0; i < a.length; i++) {
			int key=i;
			for (int j = i+1; j < a.length; j++) {
				if(a[j]<a[key]) {
					key=j;
				}
			}
			if(key!=i) {
				int temp=a[i];
				a[i]=a[key];
				a[key]=temp;
			}
		}
		
		
		
	}
	
}
