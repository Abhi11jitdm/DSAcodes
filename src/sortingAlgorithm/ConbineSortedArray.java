package sortingAlgorithm;

import java.util.Arrays;

public class ConbineSortedArray {
	public static void main(String[] args) {
		int arr1[] = {1,5,7,9};
		int arr2[] = {2,3,4,6,8,10};
		
		int ans[] = new int[arr1.length+arr2.length];
		int left = 0;
		int right = 0;
		int mid = (left + right)/2;
		int k = 0;
		while(arr1.length>left && arr2.length>right) {
			if(arr1[left]<arr2[right]) {
				ans[k] = arr1[left];
				left++;
				k++;
			}else {
				ans[k] = arr2[right];
				right++;
				k++;
			}
		}
		while(left<arr1.length) {
			ans[k] = arr1[left];
			k++;
			left++;
		}
		while(right<arr2.length) {
			ans[k]=arr2[right];
			k++;
			right++;
		}
		System.out.println(Arrays.toString(ans));
	}
}
