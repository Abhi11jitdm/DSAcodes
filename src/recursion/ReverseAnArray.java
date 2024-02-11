package recursion;

import java.util.Arrays;

public class ReverseAnArray {
	public static void reverseArray(int [] a,int start, int end) {
		
		if(start<end) {
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			reverseArray(a, start+1, end-1);
		}
		
		
	}
	public static void main(String[] args) {
		int arr[] = {1,4,3,5,6};
		System.out.println(Arrays.toString(arr));
		reverseArray(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
}