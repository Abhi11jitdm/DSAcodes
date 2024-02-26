package arraysEasy;

public class LaregestInAnArray {
	public static void main(String[] args) {
		int a[] = {1,3,2,5,4,8,7,6,8};
		int max = a[0];
		int max2 = a[0];
		for (int i = 0; i < a.length; i++) {
			if(a[i]>max) {
				max2 = max;
				max = a[i];
				
			}else if(a[i]!=max && max2<a[i]) {
				max2 = a[i];
			}
		}
		System.out.println(max);
		System.out.println(max2);
	}
}
