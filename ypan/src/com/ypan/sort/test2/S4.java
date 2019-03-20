package com.ypan.sort.test2;

public class S4 {
	
	public void sort(int[] a) {
		for (int i = 0; i < a.length-1; i++) {
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
