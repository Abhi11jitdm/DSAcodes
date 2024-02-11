package arraysEasy;

import java.util.Arrays;

public class LeftShiftByDPlaces {
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6};
		
		for (int i = 1; i < 4; i++) {
			int temp = a[0];
			for (int j = 0; j < a.length-1; j++) {
				a[j] = a[j+1];
			}
			a[a.length-1] = temp;
		}
		System.out.println(Arrays.toString(a));
	}
}