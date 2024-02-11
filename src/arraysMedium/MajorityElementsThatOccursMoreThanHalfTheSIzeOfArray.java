package arraysMedium;

public class MajorityElementsThatOccursMoreThanHalfTheSIzeOfArray {
	public static void main(String[] args) {
		int a [] ={4,4,2,4,3,4,4,3,2,4};
		int n = a.length/2;
//		----------BruteForce Solution-----------
//		for (int i = 0; i < a.length-1; i++) {
//			int count = 1;
//			for (int j = i+1; j < a.length; j++) {
//				if(a[i]==a[j]) {
//					count++;
//				}
//			}
////			System.out.println(count);
//			if(count>n) {
//				System.out.println(a[i]);
//				break;
//			}
//		}
		
		int cnt = 0;
		int el=0;
		for (int i = 0; i < a.length; i++) {
			if(cnt == 0) {
				cnt++;
				el = a[i];
			}else if(a[i]==el) {
				cnt++;
			}else {
				cnt--;
			}
		}
		int cnt1 = 0;
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]==el) {
				cnt1++;
			}
			
		}
		if(cnt1>a.length/2) {
			System.out.println(el);
		}
		
	}
}