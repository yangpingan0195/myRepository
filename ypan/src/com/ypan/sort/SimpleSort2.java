package com.ypan.sort;

public class SimpleSort2 {

	public static void main(String[] args) {
		int a[] = { 3, 1, 5, 7, 2, 4, 9, 6, 10, 8 };
		SimpleSort2 obj = new SimpleSort2();
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
		int min, max, temp;
		for (int i = 0; i < a.length/2; i++) {
			min=i;
			max=i;
			for (int j=i+1; j<a.length-i;j++) {
				if(a[j]>a[max]) {
					max=j;
				}
				if(a[j]<a[min]) {
					min=j;
				}
			}
			temp=a[i];
			a[i]=a[min];
			a[min]=temp;
			
			temp=a[a.length-i-1];
			a[a.length-i-1]=a[max];
			a[max]=temp;
		}
	}

}
