package com.core.java;

public class FarFromZero {
	
	
	
	public static void main(String[] args) {
		//int[] arr = {1,2,4,0,4,6,4,8,0,2,0,1,5,7,5,0,3,1,2,2,8,9,0,0,2,5,0};
		int[] arr = {0,2,4,0,4,6,4,8,1,0,2,1};
		findFar(arr);

	}

	private static void findFar(int[] arr) {
		int maxDist = 0;
		int left =0, index = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == 0) {
				//left = i;
				
				
				if(i-left > maxDist) {
					maxDist = i-left-1;
					index = i-1;
				}
				left =i;
			}
		}
		System.out.println("Fathest distance "+maxDist+"\nNumber: "+arr[index]);
	}

}
