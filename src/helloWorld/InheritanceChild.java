package helloWorld;

// class "InheritanceChild" inherits all methods and variables from "InheritanceParent" class via "extends"
// every class in Java automatically inherits from a class "Object"
public class InheritanceChild extends InheritanceParent{
	public static void main(String[] args) {
		InheritanceChild c = new InheritanceChild();
		
		System.out.println(c.eyeColour);
	}
}
