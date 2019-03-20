package com.ypan.sort.test2;

public class S3 {
	
	public void sort(int[] a) {
		int min,max,temp;
		for (int i = 0; i < a.length/2; i++) {
			min=i;
			max=i;
			for (int j = i+1; j < a.length-i; j++) {
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
			a[max]=a[a.length-i-1];
			a[a.length-i-1]=temp;
		}
	}
	
	
}
