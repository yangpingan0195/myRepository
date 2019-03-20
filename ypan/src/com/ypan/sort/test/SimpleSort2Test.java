package com.ypan.sort.test;

public class SimpleSort2Test {
	
	public void sort(int[] a) {
		int min,max,temp;
		for (int i = 0; i < a.length/2; i++) {
			min=i;
			max=i;
			for (int j =i+1; j < a.length-i; j++) {
				if(a[j]<a[min]) {
					min=j;
				}
				if(a[j]>a[max]) {
					max=j;
				}
			}
			
			temp=a[min];
			a[min]=a[i];
			a[i]=temp;
			
			temp=a[max];
			a[max]=a[a.length-1-i];
			a[a.length-1-i]=temp;
		}
		
		
	}
	
}
