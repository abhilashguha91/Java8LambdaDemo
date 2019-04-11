package java8.prep.demo.greet.withextraclass;

import java8.prep.demo.greet.Greet;

public class Greeter implements Greet {

	@Override
	public void perform() {
		System.out.println("Hello World!");
	}

}
