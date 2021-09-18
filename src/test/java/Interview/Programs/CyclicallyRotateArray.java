package Interview.Programs;

public class CyclicallyRotateArray {

	static int array[]= {1,2,3,4,5,6,7,8,9};

	public static void rotateClockwis( int arr[]) {
		System.out.println("================== rotateClockwis old Array=======================");
		for (int i = 0; i <= arr.length-1; i++) {
			System.out.print(arr[i]);
		}

		int n =arr.length;
		System.out.println();
		int hold=arr[n-1];

		int[] array1 = new int[n];
		for (int i = 0; i < arr.length-1; i++) {
			array1[i+1]=arr[i];
		}
		array1[0]=hold;
		System.out.println("================== rotateClockwis new Array=======================");
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i]);
		}
		System.out.println();
	}

	public void rotateAntiClockwis( int arr[]) {
		System.out.println("================== rotateAntiClockwis old Array=======================");
		for (int i = 0; i <= arr.length-1; i++) {
			System.out.print(arr[i]);
		}

		int n =arr.length;
		System.out.println();
		int hold=arr[0];
		//		System.out.println(hold);

		int[] array1 = new int[n];
		for (int i = 0; i < arr.length-1; i++) {
			array1[i]=arr[i+1];
		}
		array1[n-1]=hold;
		System.out.println("================== rotateAntiClockwis new Array=======================");
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i]);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		CyclicallyRotateArray CyclicallyRotateArray = new CyclicallyRotateArray();
		CyclicallyRotateArray.rotateClockwis(array);
		CyclicallyRotateArray.rotateAntiClockwis(array);
	}


}
