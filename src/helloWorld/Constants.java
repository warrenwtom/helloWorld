package helloWorld;

public class Constants {

	// constants never change once a value is assigned
	// usually static
	// constant name is all-caps by convention
	// declare constants by using the "final" modifier
	
	public static final int WIDTH = 1920;
	public static final int HEIGHT = 1080;
	public static final Person P1 = new Person(""); // P1 is constant, but you can still access and change P1's data
	public static final int CONSTANT_MULTIPLE_WORDS = 5;
	
	public static void main(String[] args) {
	
		System.out.println(Constants.HEIGHT);
		System.out.println(HEIGHT);
		System.out.println(Math.PI);
		System.out.println(CONSTANT_MULTIPLE_WORDS);
	}
}
