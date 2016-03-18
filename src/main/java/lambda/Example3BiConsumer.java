package lambda;

import java.util.function.BiConsumer;

public class Example3BiConsumer {
	public static void main(String[] args) {
		BiConsumer<String, String> c = (s1, s2) -> System.out.println(s1 + " : " + s2);
		c.accept("Hello", "world");
	}
}
