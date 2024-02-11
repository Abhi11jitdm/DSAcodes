package arraysMedium;

public class CheckIfPairWithGivenSumExist {
	public static void main(String[] args) {
		int a[] = {2,6,5,8,11};
		int target = 13;
		boolean b = false;
		for (int i = 0; i < a.length-1; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]+a[j]==target) {
					b = true;
					System.out.println("Yes");
					System.out.println(i+" "+j);
				}
			}
		}
		if(b==false) {
			System.out.println("no");
			System.out.println(-1+" "+-1);
		}
	}
}
