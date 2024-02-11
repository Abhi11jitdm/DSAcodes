package arraysEasy;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class NumbersAppearingOnceOthersTwice {
	public static void main(String[] args) {
		int[] a = {4,1,2,1,2};
		int ans=0;
		for (int i = 0; i < a.length; i++) {
			int n = a[i];
			int count = 0;
			
			for (int j = 0; j < a.length; j++) {
				if(n==a[j]) {
					count++;
				}
			}
			if(count==1) {
				ans = a[i];
			}
		}
		System.out.println(ans);
		

//		Map<Integer, Integer> m = new HashMap<>();
//		
//		for(int i = 0; i<a.length;i++) {
//			if(m.containsKey(a[i])) {
//				m.put(a[i], m.get(a[i])+1);
//			}
//			else {
//				m.put(a[i], 1);
//			}
//		}
//		
//		for(Entry<Integer, Integer> an : m.entrySet()) {
//			if(an.getValue()==1) {
//				System.out.println(an.getKey());
//			}
//		}
	}
}
