package arraysEasy;

import java.util.Arrays;

public class LeftShiftByDPlaces {
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7,8};
		/*
		 * Brute Force : 
		 * Time complexity: O(n+d)
		 * Space complexity: O(d)
		 * int d = 2;
		if(d>a.length) {
			d = d%a.length;
		}
		int temp[] = new int[d];
		for(int i = 0; i< temp.length; i++) {
			temp[i] = a[i];
		}
		
		for(int i = d; i< a.length;i++) {
			a[i-d] = a[i];
			
		}
		
		for(int i = a.length - d; i<a.length;i++) {
			a[i] = temp[i-(a.length-d)];
						
		}
		System.out.println(Arrays.toString(a));*/
		
		//Optimal Approach
		int d = 2;
		reverse(a, 0, d-1);
		reverse(a,d,a.length-1);
		reverse(a,0,a.length-1);
		System.out.println(Arrays.toString(a));
		
	}
	
	static void  reverse(int a[], int start, int end) {
		while(start<=end) {
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}
	}
}

