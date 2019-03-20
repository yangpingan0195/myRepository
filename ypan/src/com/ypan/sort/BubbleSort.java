package com.ypan.sort;

public class BubbleSort {
	
	public void sort(int[] a) {
		for (int i = 0; i < a.length-1; i++){
			boolean isLop=false;
			for (int j = 0; j < a.length-i-1; j++) {
				if(a[j]>a[j+1]) {
					isLop=true;
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
			if(!isLop) {
				break;
			}
		}	
	}
	
	public static void main(String[] args) {
		int a[] = { 3, 1, 5, 7, 2, 4, 9, 6, 10, 8 };
		BubbleSort obj = new BubbleSort();
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
	
}
