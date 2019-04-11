package java8.prep.demo.greet.withoutextraclass;

import java8.prep.demo.greet.Greet;

public class GreeterWithoutExtraClass {

	public static void main(String[] args) {
		
		// In order to not create another specific class to implement the Greet interface
		// We need to create an inner class
		Greet greeterInnerClass = new Greet() {
			public void perform() {
				System.out.println("Hello World!");
			}
		};
		greeterInnerClass.perform();

	}

}
