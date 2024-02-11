package arraysMedium;

public class MaximumSubarraySumInAnArray {
	public static void main(String[] args) {
		int a[] = {-2,1,-3,4,-1,-2,1,5,-4};
//		---------better Approach---------------
//		int maxSum = 0;
//		
//		for (int i = 0; i < a.length; i++) {
//			int sum = 0;
//			for (int j = i; j < a.length; j++) {
//				if(sum>=maxSum) {
//					maxSum = sum;
//				}
//				sum+=a[j];
//			}
//			
//		}
//		System.out.println(maxSum);
		
//		------------optimal Approach-------------
		int max = Integer.MIN_VALUE;
		int sum = 0;
		int start = 0;
		int ansStart = -1;
		int ansEnd = -1;
		for (int i = 0; i < a.length; i++) {
			
			if(sum==0) {
				start = i;
			}
			sum += a[i];
			
			if(sum>max) {
				max = sum;
				ansStart = start;
				ansEnd = i;
			}
			
			if(sum<0) {
				sum = 0;
			}
		}
		for(int i = ansStart; i<=ansEnd; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println(max);
	}
}