package com.ypan.sort.test2;

public class S2 {
	
	public static void main(String[] args) {
		int a[] = { 3, 1, 5, 7, 2, 4, 9, 6, 10, 8 };
		S2 obj = new S2();
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
		for (int i = 0; i < a.length; i++) {
			int k=i;
			for (int j = i+1; j < a.length; j++) {
				if(a[j]<a[k]) {
					k=j;
				}
			}
			if(k!=i) {
				int temp=a[k];
				a[k]=a[i];
				a[i]=temp;
			}
		}
		
		
	}
}
