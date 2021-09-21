package Interview.Programs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class GetMaximumWordCountInATextFile {


	static String path =System.getProperty("user.dir")+"/SampelTest.txt";

	public static void main(String[] args) throws IOException {
		//getMaximumWordCountInATextFile(path);
		getMaximumWordCountInAText("chandraaffchandraafafchandra");
	}


	private static void getMaximumWordCountInATextFile(String path) throws IOException {

		BufferedReader reader = null;
		Map<String , Integer> wordMap = new HashMap<String, Integer>();
		try {
			reader= new BufferedReader(new FileReader(path));
			String line = reader.readLine();
			while(line!=null) {
				String words[] = line.toLowerCase().split(" ");
				for (String string : words) {
					if(!string.isBlank()) {
						if(wordMap.containsKey(string)) {
							wordMap.put(string, wordMap.get(string)+1);
						}else {
							wordMap.put(string,+1);
						}
					}
				}
				line = reader.readLine();
			}
			System.out.println(wordMap);
			wordMap.forEach((k,v) -> System.out.println(k +"-->" +v));



			Map<String , Integer> maxMap = new HashMap<String, Integer>();
			Integer val = Collections.max(wordMap.values());

			System.out.println("============"+val+"==============");

			wordMap.
			entrySet().
			stream().
			filter(entry -> entry.getValue()==Collections.max(wordMap.values()))
			.forEach(e -> maxMap.put(e.getKey(), e.getValue()) );


			System.out.println("maxMap "+maxMap);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			reader.close();
		}
	}



	private static void getMaximumWordCountInAText(String name) throws IOException {

		Map<String , Integer> wordMap = new HashMap<String, Integer>();
		
//		String words[] = name.substring(0, 6)
//		for (String string : words) {
//			if(!string.isBlank()) {
//				if(wordMap.containsKey(string)) {
//					wordMap.put(string, wordMap.get(string)+1);
//				}else {
//					wordMap.put(string,+1);
//				}
//			}
//		}
		System.out.println(name.substring(0, 7));
		String Newname =name.replace("chandra", ",");
		 char[] namelist = Newname.toCharArray();
			int count=0;
			 for (int i = 0; i < namelist.length; i++) {
				if(namelist[i]==',') {
					count =count +1;
				}
			}System.out.println(count);
		
	}

}


