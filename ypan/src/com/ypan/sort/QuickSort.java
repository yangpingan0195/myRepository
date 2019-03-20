package com.ypan.sort;

public class QuickSort {
	
	public void sort(int[] a,int low,int high) {
		if(low<high) {
			int middle=getMiddle(a, low, high);
			sort(a, low, middle-1);
			sort(a, middle+1, high);
		}
		
	}
	
	public int getMiddle(int[] a,int low,int high) {
		int key=a[low];
		while(low < high) {
			while(low<high&&a[high]>key) {
				high--;
			}
			a[low]=a[high];
			while(low<high&&a[low]<key) {
				low++;
			}
			a[high]=a[low];
		}
		a[low]=key;
		return low;
	}
	
	
	public static void main(String[] args) {
		int a[] = { 3, 1, 5, 7, 2, 4, 9, 6, 10, 8 };
		QuickSort obj = new QuickSort();
		System.out.println("初始值：");
		obj.print(a);
		obj.sort(a,0,a.length-1);
		System.out.println("\n排序后：");
		obj.print(a);
	}
	
	public void print(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
