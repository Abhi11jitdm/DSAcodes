package arraysEasy;

public class CheckIfSorted {
	public static void main(String[] args) {
		int a[] = {1,1,1,2,3,3,4,5,7};
		boolean b = false;
		for (int i = 0; i < a.length-1; i++) {
			if(a[i]>a[i+1]) {
				b=true;
				break;
			}
		}
		if(b) {
			System.out.println("not sorted");
		}else {
			System.out.println("sorted");
		}
	}
}