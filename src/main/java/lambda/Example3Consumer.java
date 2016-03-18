package lambda;

import java.util.function.Consumer;

public class Example3Consumer {
	public static void main(String[] args) {
		Consumer<String> c = System.out::println;
		c.accept("Hello World");
	}
}
