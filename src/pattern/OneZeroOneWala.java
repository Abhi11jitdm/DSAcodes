package pattern;

public class OneZeroOneWala {
	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) {
			int n = 1;
			for (int j = 0; j <= i; j++) {
				if((i+j) % 2 == 0 ) {
					System.out.print(1);
				}else {
					System.out.print(0);
				}
			}
			System.out.println();
		}
	}
}