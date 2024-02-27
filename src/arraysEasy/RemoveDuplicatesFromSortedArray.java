package arraysEasy;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
	public static void main(String[] args) {
		int a[] = {1,1,2,2,2,3,3,4,5,6};
		int i = 0;
		for (int j = 1; j < a.length; j++) {
			if(a[i]!=a[j]) {
				i++;
				a[i] = a[j];
			}
		}
		System.out.println(Arrays.toString(a));
    }
}