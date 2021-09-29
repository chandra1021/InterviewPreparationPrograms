package Interview.Programs;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

	/*
	 * Complete the 'aVeryBigSum' function below.
	 *
	 * The function is expected to return a LONG_INTEGER.
	 * The function accepts LONG_INTEGER_ARRAY ar as parameter.
	 */

	public static long aVeryBigSum(List<Long> ar, Long sum) {
		// Write your code here

		if(ar.size()==0){
			return sum ;
		}
		else{
			sum=sum+ar.get(0);
			ar.remove(0);
			return aVeryBigSum(ar, sum);
		}
	}

}

public class AdditionLongValues {
	public static void main(String[] args)
			throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new
				InputStreamReader(System.in)); BufferedWriter bufferedWriter = new
				BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

				int arCount = Integer.parseInt(bufferedReader.readLine().trim());

				List<Long> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$",
						"").split(" ")) .map(Long::parseLong) .collect(toList());

				//		List<Long> ar = new ArrayList<Long>();
				//		ar.add(1000000001L);
				//		ar.add(1000000002L);
				//		ar.add(1000000003L);
				//		ar.add(1000000004L);
				//		ar.add(1000000005L);


				long result = Result.aVeryBigSum(ar,0L);
				//		System.out.println(result);


				bufferedWriter.write(String.valueOf(result)); bufferedWriter.newLine();

				bufferedReader.close(); bufferedWriter.close();

	}
}

