package com.ypan.sort.test2;

public class S5 {
	
	public void quickSort(int[] a,int start,int end) {
		if(start<end) {
			int middle = getMiddle(a, start, end);
			quickSort(a, start, middle-1);
			quickSort(a, middle+1, end);
		}
		
	}
	
	public int getMiddle(int[] a,int start,int end) {
		int value=a[start];
		while(start<end) {
			while(start<end&& a[end]>value) {
				end--;
			}
			a[start]=a[end];
			while(start<end&&a[start]<value) {
				start++;
			}
			a[end]=a[start];
		}
		a[start]=value;
		return start;
	}
	
}
