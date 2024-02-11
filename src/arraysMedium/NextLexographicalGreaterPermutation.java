package arraysMedium;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NextLexographicalGreaterPermutation {
	
	 public static List<Integer> nextGreaterPermutation(List<Integer> a){
		 int ind = -1;
		 int n = a.size();
		 
		 for(int i = n-2; i>=0; i--) {
			 if(a.get(i)<a.get(i+1)) {
				 ind = i;
				 break;
			 }
		 }
		 
		 if(ind==-1) {
			 Collections.reverse(a);
			 return a;
		 }
		 
		 for(int i = n-1; i>ind; i--) {
			 if(a.get(i)>a.get(ind)) {
				 int temp = a.get(i);
				 a.set(i, a.get(ind));
				 a.set(ind, temp);
				 break;
			 }
		 }
		 
		 List<Integer> subList = a.subList(ind+1, n);
		 Collections.reverse(subList);
		 
		 return a;
	 }
	
	public static void main(String[] args) {
		 List<Integer> A = Arrays.asList(new Integer[] {2, 1, 5, 4, 3, 0, 0});
	        List<Integer> ans = nextGreaterPermutation(A);

	        System.out.print("The next permutation is: [");
	        for (int i = 0; i < ans.size(); i++) {
	            System.out.print(ans.get(i) + " ");
	        }
	        System.out.println("]");
	}
}
