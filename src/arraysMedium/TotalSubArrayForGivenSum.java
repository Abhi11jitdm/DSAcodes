package arraysMedium;

public class TotalSubArrayForGivenSum {
	public static void main(String[] args) {
		int a[] = {3,1,2};
		int sum = 3;
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				int s = 0;
				for (int k = i; k <= j; k++) {
					s+=a[k];
				}
				if(s==sum) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}