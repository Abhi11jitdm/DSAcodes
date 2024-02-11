package arraysMedium;

import java.util.Arrays;

public class SetMatrixZero {
	public static void main(String[] args) {
		int [][] a = {{1,1,1},{1,0,0},{1,1,1}};
		System.out.println(Arrays.deepToString(a));
		int [] row = new int[a[0].length];
		int [] column = new int[a[0].length];
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if(a[i][j]==0) {
					row[i] = 1;
					column[j] = 1;
				}
			}
		}
		//System.out.println(m+" "+n);
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if(row[i]==1||column[j]==1)
					a[i][j] = 0;
			}
		}
		System.out.println(Arrays.deepToString(a));
	}
}