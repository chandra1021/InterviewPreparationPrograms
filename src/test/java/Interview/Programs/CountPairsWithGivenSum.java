package Interview.Programs;

import java.util.Arrays;

public class CountPairsWithGivenSum {


	static int array[]= {1,2,-3,4,5,6,7,8,9};
	static int sum =10;

	private static void countPairsWithGivenSum( int arr[], int sum) {
		int pair = 0;
		for (int i = 0; i < arr.length/2; i++) {
			for (int j = 1; j < arr.length; j++) {
				if(!(arr[i]==arr[j])) {
					//if(arr[i]+arr[j]== sum) {
					if((arr[i]+arr[j])%2== 0) {
						System.out.println("PAIRS are "+arr[i] +" and "+arr[j] +" = "+ (arr[i]+arr[j]));
						pair = pair +1;
					}
				}
			}
		}
		System.out.println("Pair is "+pair);
	}
	public static void main(String[] args) {
		countPairsWithGivenSum(array, sum);
	}
}
