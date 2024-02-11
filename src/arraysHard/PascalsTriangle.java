package arraysHard;

public class PascalsTriangle {
	public static void main(String[] args) {
		
//		1st variation
		int r = 5;
		int c = 3;
		int res = 1;
		for (int i = 0; i < c-1; i++) {
			res = res * (r-1-i);
			res = res/(i+1);
		}
		System.out.println(res); 
//		----------------------------------------------
		
//		2nd variation
		int row = 5;
		int ans = 1;
		//System.out.print(ans+" ");
		for (int i = 1; i < row; i++) {
			ans = ans*(row-i);
			ans = ans/i;
			//System.out.print(ans+" ");
		}
		//System.out.println();
//		-----------------------------------------------
//		3rd variation
		for(int j  = 1 ; j<=5; j++) {
			int rows = j;
			int anss = 1;
			//System.out.print(ans+" ");
			for (int i = 1; i < rows; i++) {
				anss = anss*(rows-i);
				anss = anss/i;
			//	System.out.print(anss+" ");
			}
			//System.out.println();
		}
	}
}
