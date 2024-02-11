package arraysMedium;

import java.util.Arrays;

public class SortAnArrayOfZeroOneTwo {
	public static void main(String[] args) {
		int a[] = {2,0,2,1,1,0,0,1,2,0};
		int c = 0;
		int b[] = new int[a.length];
		for (int i = 0; i <= 2; i++) {
			int count = 0;
			for (int j = 0; j < a.length; j++) {
				if(i == a[j]) {
					count++;
				}
			}
//			System.out.println(count);
			for(int k = c; k<count+c;k++) {
				
				b[k] = i;
				
			}
			c+=count;
		}
		System.out.println(Arrays.toString(b));
	}
}