package java8.prep.demo.greet.withlamdaexp;

import java8.prep.demo.greet.Greet;

public class GreeterWithLambdaExp {

	public static void main(String[] args) {

		// Here we will see lamda expression is a way to write a method without creating any particular
		// class for it, hence it looks like a re-syntaxing of the inner class implementation
		Greet greeter = () -> {
			System.out.println("Hello World!");
		};
		greeter.perform();
		
	}

}
