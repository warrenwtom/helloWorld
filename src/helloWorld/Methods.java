package helloWorld;

public class Methods {
	public static void main(String[] args) {

		String phone = phoneNumber();
		System.out.println(phone);
		
		sayHelloTo("");
		
		sayHelloWorld();
	}

	// method to return a string
	static String phoneNumber() {
		return "647-294-5826";

	}

	// method to take in a string and display a string which includes the input
	static void sayHelloTo(String name) {
		if (name=="") {
				System.out.println("Hello, stranger!");
		} else {
			System.out.println("Hello, " + name + "!");
		}
	}
	
	// method to display a string
	static void sayHelloWorld() {
		System.out.println("Hello World!");
	}
}