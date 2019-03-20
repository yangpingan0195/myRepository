package com.ypan.sort;

public class SimpleSort {
	public static void main(String[] args) {
		int a[] = { 3, 1, 5, 7, 2, 4, 9, 6, 10, 8 };
		SimpleSort obj = new SimpleSort();
		System.out.println("初始值：");
		obj.print(a);
		obj.sort(a);
		System.out.println("\n排序后：");
		obj.print(a);
	}
	
	
	public void print(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
	
	public void sort(int[] a) {
		for (int i = 0; i < a.length-1; i++) {
			int k=i;
			for (int j = i+1; j < a.length; j++) {
				if(a[k]>a[j]) {
					k=j;
				}
			}
			if(i!=k) {
				int temp=a[i];
				a[i]=a[k];
				a[k]=temp;
				
			}
			
		}
		
		
	}
}
