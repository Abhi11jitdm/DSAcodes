package sortingAlgorithm;

import java.util.Arrays;

public class RecursiveBubbleSort {
	
	public static void bubbleSort(int arr[], int n) {
		if(n==1)return;
		for (int j = 0; j < n-2; j++) {
			if(arr[j]>arr[j+1]) {
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
		}
		bubbleSort(arr, n-1);
	}
	public static void main(String[] args) {
		int arr[] = {3,4,2,5,2,9};
		bubbleSort(arr, arr.length);
		System.out.println(Arrays.toString(arr));
	}
}