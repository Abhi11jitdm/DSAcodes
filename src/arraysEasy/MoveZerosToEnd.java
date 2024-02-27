package arraysEasy;

import java.util.Arrays;

public class MoveZerosToEnd {
	public static void main(String[] args) {
		int a[] = {0,0,1 ,0 ,2 ,3 ,0 ,0,4 ,0 ,1,0,1,2};
//		int ans[] = new int[a.length];
//		int j = 0;
//		int i = 0;
//		while(j<a.length) {
//			if(a[j]!=0) {
//				ans[i] = a[j];
//				i++;
//			}
//			j++;
//		}
		
		int j = -1;
		for(int i = 0;i<a.length;i++) {
			if(a[i]==0) {
				j = i;
				break;
			}
		}
		System.out.println(j);
		
		for (int i = j+1; i < a.length; i++) {
			if(a[i]!=0) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				j++;
			}
		}
		System.out.println(Arrays.toString(a));
	}
}