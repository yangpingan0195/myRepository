package com.ypan.sort.test;

public class DubbleSortTest {
	
	public void sort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			boolean isLog=false;
			for (int j = 0; j < a.length-i-1; j++) {
				if(a[j]>a[j+1]) {
					isLog=true;
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
			if(!isLog) {
				break;
			}
		}
		
	}
	
	
}
