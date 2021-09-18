package Interview.Programs;

import java.awt.List;
import java.util.ArrayList;
import java.util.Hashtable;

		/*This program is for getting unique list of elements and also number of repeated count*/
public class FindDuplicatesInArray {


	static int array1[]= {1,2,3,1,2,3,1,2,3,1,2,3,1,2,3};
	static int array2[]= {1,2,3,4,5,6,6,5,4,3,2,1,1,2,3,4,5,6,9,8,7};
	static int array[]= {1,1,1,1,1,2,2,2,2,2,2,2,3,3,3,3,3,3,3,3,4,4,4,4,4,4,4,4,4,4};

	public static void main(String[] args) {
		findDuplicatesInArray(array);
	}
	private static void findDuplicatesInArray( int arr[]) {

		Hashtable<Integer, Integer> tabel = new Hashtable<Integer, Integer>();
		//List uniqueList = new List();
		ArrayList<Integer> uniqueList = new ArrayList<Integer>();  
		int count =1;
		for (int i = 0; i < arr.length; i++) {
			if(tabel.keySet().contains(arr[i])) {
				if(tabel.get(arr[i])==1) {
					tabel.put(arr[i], 2);
				}else {
					Integer tabelCount = tabel.get(arr[i]);
					count=tabelCount+1;
					tabel.put(arr[i], count);
				}
			}else {
				uniqueList.add(arr[i]);
				tabel.put(arr[i], 1);
			}
		}
		System.out.println(uniqueList);

		for (int i = 0; i < uniqueList.size(); i++) {
			Integer data = tabel.get(uniqueList.get(i));
			System.out.println("value of "+uniqueList.get(i) +" in given array is repeted "+(data) +" times");
		}
	}

}
