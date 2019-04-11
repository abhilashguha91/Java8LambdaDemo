package java8.prep.demo.runnable;

// the run() of the Runnable interface is a good place to use a lambda expression... 
// reason: This interface has only one method run()!
// When java decides to add another method to this interface, we cannot use it as a lambda expression
public class RunnableExample {

	public static void main(String[] args) {

		// A thread should be spawned by an instance of the Runnable interface 
		// there are obviously different ways to do this.
		
		// Let's start by using another outer class implementing runnable.
		MyThread myThread = new MyThread();
		Thread t1 = new Thread(myThread);
		t1.start();
		
		// Let's try it with an anonymous innerclass to spare us the hassle to create
		// another class
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				System.out.println("Running... huff... puff");
			}
		});
		t2.start();
		
		// Now let's try using our new attained knowledge of lambda expressions.
		Thread t3Thread = new Thread(() -> System.out.println("Runn..nn...nning...... waater"));
		t3Thread.start();
		
		
	}

}
