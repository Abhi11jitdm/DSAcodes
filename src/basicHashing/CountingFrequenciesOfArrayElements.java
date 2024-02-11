package basicHashing;

import java.util.HashMap;
import java.util.Map;

public class CountingFrequenciesOfArrayElements {
	public static void main(String[] args) {
		int arr[] = {10,5,10,4,5,10};
		
		Map<Integer, Integer> m = new HashMap<>();
		
		for (int i = 0; i < arr.length; i++) {
			if(m.containsKey(arr[i])) {
				m.put(arr[i], m.get(arr[i])+1);
			}else {
				
				m.put(arr[i], 1);
			}
		}
		System.out.println(m);
	}
}