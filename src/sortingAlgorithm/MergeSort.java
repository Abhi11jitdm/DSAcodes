package sortingAlgorithm;

import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args) {
		int a[] = {4,2,6,8,1,7};
		mergeSort(a, 0, a.length-1);
		System.out.println(Arrays.toString(a));
	}
	public static void mergeSort(int[]a, int low, int high) {
		if(low>=high)return;
		int mid = (low+high)/2;
		mergeSort(a,low,mid);
		mergeSort(a,mid+1,high);
		merge(a, low, mid, high);
		
	}
	public static void merge(int arr[],int low, int mid, int high) {
		
		int a[] = arr.clone();
		int left = low;
		int right = mid+1;
		 mid = (left + right)/2;
		int k = 0;
		while(mid>=left && high>=right) {
			if(arr[left]<arr[right]) {
				a[k] = arr[left];
				left++;
				k++;
			}else {
				a[k] = arr[right];
				right++;
				k++;
			}
		}
		while(left<=mid) {
			a[k] = arr[left];
			k++;
			left++;
		}
		while(right<=high) {
			a[k]=arr[right];
			k++;
			right++;
		}
		for(int i = low; i<= high; i++) {
			arr[i] = a[i-low];
		}
	}
}
