package Interview.Programs;

public class Reverse_Number {
	public static void main(String[] args) {
		reverseNumber(123);
		System.out.println();
		reserveNumberRecursion(123);
	}

	private static void reverseNumber(int number) {
		while (number>0) {
			int rev=number%10;
			System.out.print(rev);
			number=number/10;
		}
	}

	private static void reserveNumberRecursion(int number) {
		
		if(number<10) {
			System.out.println(number);
			return;
		}else {
			int rev=number%10;
			System.out.print(rev);
			reserveNumberRecursion(number/10);
		}
	}
}
