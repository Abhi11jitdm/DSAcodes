package pattern;

public class NumberMShape {
	public static void main(String[] args) {
		
		int space = 6;//2*(n-1)
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			
			for (int j = i; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.println();
			space -= 2;
		}
	}
}