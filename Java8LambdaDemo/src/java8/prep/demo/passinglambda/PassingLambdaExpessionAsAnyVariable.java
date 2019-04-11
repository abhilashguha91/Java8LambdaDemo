package java8.prep.demo.passinglambda;

public class PassingLambdaExpessionAsAnyVariable {

	public static void main(String[] args) {
		
		// First Let's create a lambda to define the getLength method
		StringDisection stringDisectionLambda = (String s) -> {
			return s.length();
		};
		// Removing some code which the compiler can derive from the interface's method declaration signature
		// So we can remove the Argument type as it is clearly mentioned in the interface's method declaration signature
		// again it's a one line method so remove the {}
		// also, as the one line is a return statement, remove return
		StringDisection stringDisectionLambda1 = (s) -> s.length();
		
		// Now let's say like any other Variable we need to pass this "Logic" or the function definition to
		// another function we can do that like:
		printLength(stringDisectionLambda1);
		
		// As lamda is being treated a variable we can send the assigned inline value as well
		/*
		 *  e.g for any other variable
		 * String s = "abc"
		 * we can pass the reference variable
		 * System.out.println(s);
		 * or the inline variable
		 * System.out.println("abc");
		 * and both would be the same
		 */
		printLength((x) -> x.length());
		
		// The above is equivalent to passing a "function" as a callback in javascript
		// Mind you we are not sending the resolved function value, but the function definition itself

	}
	
	interface StringDisection {
		int getLength(String s);
	}
	
	static void printLength(StringDisection stringDisectionLambda1) {
		stringDisectionLambda1.getLength("Hello World!");
		
	}

}
