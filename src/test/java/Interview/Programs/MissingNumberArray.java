package Interview.Programs;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MissingNumberArray {


	static int array[]= {3,5,9,10,7,11};


	private static void printMissingNumberInArray( int arr[]) {
		Arrays.sort(arr);
		int missing=1;
		for (int i = 0; i < arr.length; i++) {
			if((arr[i]==missing)) {

			}else {
				System.out.println("Missing number is "+missing);
				i=i-1;
			}
			missing=missing+1;
		}


	}
	public static void main(String[] args) {
		MissingNumberArray.printMissingNumberInArray(array);
	}

}
