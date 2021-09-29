package Interview.Programs;

public class ChildClass extends ParentCalss {
	
	
	public static void add(int a,int b,int c) {
		System.out.println("Privare add "+ a+c);
	}
	
	public void add() {
		System.out.println("Privare add Child");
	}
	
	public static void main(String[] args) {
		ParentCalss ParentCalss = new ParentCalss();
		ParentCalss ChildClass = new ChildClass();

		ParentCalss.add();
		ChildClass.add();
		
	}

}
