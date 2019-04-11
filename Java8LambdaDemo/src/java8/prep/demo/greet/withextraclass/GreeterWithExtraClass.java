package java8.prep.demo.greet.withextraclass;

import java8.prep.demo.greet.Greet;

// The job of greeter is to execute the greet method of the Greeting interface
public class GreeterWithExtraClass {
	
	public static void main(String args[]) {
		
		// To make the Greet interface perform we need another class that implements it, so that a
		// reference can be created for the Greet interface with the perform implementation
		Greet greeter = new Greeter();
		greeter.perform();
		
	}

}
