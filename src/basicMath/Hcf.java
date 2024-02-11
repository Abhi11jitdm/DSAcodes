package basicMath;

public class Hcf {
	public static void main(String[] args) {
		int n = 24;
		int m = 36;
		
		while(m!=0) {
			int r = n%m;
			n = m;
			m = r;
		}
		System.out.println(n);
	}
}