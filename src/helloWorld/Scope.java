package helloWorld;

public class Scope {

	// variable x is declared outside of all methods, so it is available to use by all methods
	// it's called a class variable
	static int x;
	
	public static void main(String[] args) {
		x = 5;
		System.out.println(x); // displays 5
		doSomething();
		System.out.println(x); // displays 10
	}
	
	static void doSomething() {
		x = 10;
	}
	
	static void doSomethingLocally() {
		int y = 100; // declared inside this method, it is local only to this method
		System.out.println(y);
	}
}
