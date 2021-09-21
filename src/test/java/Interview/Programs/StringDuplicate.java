package Interview.Programs;

public class StringDuplicate {
	static String name = "ChandraChandraChandra";
	private static void stringDuplicate(String  name) {
		  name = new String(name);
		int count=0;
		String array=name.substring(0, 7);
		System.out.println(array);
		while (name.length()>0) {
			if(name.contains(array)) {
				name.replaceFirst("(.*)Chandra(.*)", "");
				//name.replaceFirst(array, " ");
				count=count+1;
			}
		}
		
		System.out.println(count);
	}
	
	
	
	public static void main(String[] args) {
		 String Str = new String("Welcome to Tutorialspoint.com");

	      System.out.print("Return Value :" );
	      System.out.println(Str.replaceFirst("(.*)Tutorials(.*)", "AMROOD"));

	      System.out.print("Return Value :" );
	      System.out.println(Str.replaceFirst("Tutorials", "AMROOD"));
	      
		StringDuplicate.stringDuplicate(name);
	}

}
