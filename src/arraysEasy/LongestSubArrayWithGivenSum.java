package arraysEasy;

public class LongestSubArrayWithGivenSum {
	public static void main(String[] args) {
		int[] a = {1,2,3,1,1,1,1,4,2,3};
		int k = 5;
		int len = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				 int sum = 0;
				 for (int l = i; l <= j; l++) {
					sum += a[l];
					
				}
				 if(sum == k) {
						len = Integer.max(len, j-i+1);
				}
			}
		}
		System.out.println(len);
	}
}