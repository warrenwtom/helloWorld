package helloWorld;

public class ClassesAndObjects {
	public static void main(String[] args) {
		Person kaden = new Person("Kaden");
		kaden.setAge(6);
		Person tyler = new Person("Tyler");
		tyler.setAge(8);
		
		/* Bad coding practice:
		 * kaden.name = "Kaden";
		 * kaden.age = 6;
		 * tyler.name = "Tyler";
		 * tyler.age = 8;
		 */
		
		kaden.sayHelloTo(tyler);
		tyler.sayHelloTo(kaden);
		
		System.out.println(kaden.getName() + " is " + kaden.getAge() + " years old");
		System.out.println(tyler.getName() + " is " + tyler.getAge() + " years old");
	}
}
