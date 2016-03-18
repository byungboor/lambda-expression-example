package lambda;


public class Example2MethodReference {
	public static void main(String... args) {
		// Runnable runnable = System.out::println;
		Runnable runnable = () -> {System.out.println("qwerty");
		};
		runnable.run();
	}
}
