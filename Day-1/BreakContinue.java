public class BreakContinue{
	public static void windowPosSum(int[] a, int n){
		// Input: {1, 2, -3, 4, 5, 4}
		// Output: Should print 4, 8, -3, 13, 9, 4

		for(int x=0; x<=a.length-1; x++){

			int currentNumber = a[x];

			for(int j=x+1; j<=x+3; j++){
				
				if(currentNumber < 0){break;}

				if(j >= a.length){
					continue;
				}
				a[x] += a[j];
			}
		}


	}


	public static void main(String[] args){
		int[] a = {1, 2, -3, 4, 5, 4};
		int n = 3;
		windowPosSum(a,n);
		System.out.println(java.util.Arrays.toString(a));
		return;
	}
}