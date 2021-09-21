package Interview.Programs;

import java.io.IOException;

public class OpenAnyApplicationUsingJava {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		Runtime runtime = Runtime.getRuntime();
		Process process = runtime.exec("notepad.exe");
		Thread.sleep(5000);
		process.destroy();
		
	}

}
