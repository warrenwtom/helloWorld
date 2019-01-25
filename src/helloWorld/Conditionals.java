package helloWorld;

public class Conditionals {
	public static void main(String[] args) {

		boolean arriving=true;

		if(arriving) {
			System.out.println("Hello");
		} else {
			System.out.println("Goodbye");			
		}

		int Marks = 95;
		char grade;

		if (Marks >= 90) {
			grade = 'A';
		} else if (Marks >= 80) {
			grade = 'B';
		} else if (Marks >= 70) {
			grade = 'C';
		} else if (Marks >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		System.out.println("Grade = " + grade);
	}
}
