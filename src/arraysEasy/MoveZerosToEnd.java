package arraysEasy;

import java.util.Arrays;

public class MoveZerosToEnd {
	public static void main(String[] args) {
		int a[] = {0,0,1 ,0 ,2 ,3 ,0 ,0,4 ,0 ,1,0,1,2};
		int l = a.length;
		for (int k = 0; k < l; k++) {
			for (int i = k; i < l-1; i++) {
				if(a[k]==0) {
					for (int j = i; j < l-1; j++) {
						a[j]=a[j+1];
					}
					i--;
					l--;
				}
			}
		}
		for (int i = l; i < a.length; i++) {
			a[i] = 0;
		}
		
		System.out.println(Arrays.toString(a));
	}
}