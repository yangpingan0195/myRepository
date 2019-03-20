package com.ypan.sort.test;

public class QuickSortTest {
	
	public void sort(int[] a,int start,int end) {
		if(start<end) {
			int middle=getMiddle(a, start, end);
			sort(a, start, middle-1);
			sort(a, middle+1, end);
		}
	}
	
	public int getMiddle(int[] a,int start,int end) {
		int middle=a[start];
		while(start<end) {
			while(start<end&&a[end]>middle) {
				end--;
			}
			a[start]=a[end];
			while(start<end&&a[start]<middle) {
				start++;
			}
			a[start]=a[end];
		}
		a[start]=middle;
		return start;
	}
	
	
}
