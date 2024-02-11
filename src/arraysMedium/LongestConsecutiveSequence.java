package arraysMedium;

public class LongestConsecutiveSequence {
	public static void main(String[] args) {
		int [] a = {100,200,1,3,2,4 };
		int length = 1;
		for (int i = 0; i < a.length; i++) {
			int cnt = 1;
			int n = a[i];
			for (int j = 0; j < a.length; j++) {
				if(linearSearch(a, n+1)==true) {
					n+=1;
					cnt++;
				}
			}
			length = Math.max(length, cnt);
		}
		System.out.println(length);
	}
	
	public static boolean linearSearch(int [] a, int n) {
		for (int i = 0; i < a.length; i++) {
			if(a[i]==n) {
				return true;
			}
		}
		return false;
	}
}