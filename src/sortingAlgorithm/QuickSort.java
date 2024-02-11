package sortingAlgorithm;

import java.util.Arrays;

public class QuickSort {
	public static void main(String[] args) {
		int arr[] = {4,5,6,2,7,1,3,9};
		quickSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void quickSort(int arr[], int low, int high) {
		if(low<high) {
			int pivot = quick(arr, low, high);
			quickSort(arr, low, pivot-1);
			quickSort(arr, pivot+1, high);
		}
	}
	
	public static int quick(int arr[], int low, int high) {
		int pivot = low;
		int i = low;
		int j = high;
		while(i<j) {
			while(arr[i]<=arr[pivot]&&i<=high) {
				i++;
			}
			while(arr[j]>arr[pivot]&&j>=low) {
				j--;
			}
			if(i<j) {
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[pivot];
		arr[pivot] = arr[j];
		arr[j] = temp;
		return j;
	}
}
