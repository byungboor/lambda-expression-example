package lambda;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		Runnable a = () -> System.out.println("Test");
		new Thread(a).run();
	}
}
