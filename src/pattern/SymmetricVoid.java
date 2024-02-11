package pattern;

public class SymmetricVoid {
	public static void main(String[] args) {
		int spaces = 0;
		int n = 5;
		
		for (int i = 0; i<=5; i++) {
			for (int j = 0; j < n-i; j++) {
				System.out.print("*");
			}
			
			for (int j = 0; j < spaces; j++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j < n-i; j++) {
				System.out.print("*");
			}
			System.out.println();
			spaces +=2;
		}
//		System.out.println("hi");
		spaces = 8;
		for (int i = 0; i<n ; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			
			for (int j = 0; j < spaces; j++	) {
				System.out.print(" ");
			}
			
			for (int j = 0; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println();
			spaces -=2;
		}
	}
}
