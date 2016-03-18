package lambda;

import java.util.function.BiFunction;
import java.util.function.Consumer;

public class Example3BiFunction {
	public static void main(String[] args) {
		BiFunction<String, String, Long> f = (s1, s2) -> Long.valueOf(s1) + Long.valueOf(s2);
		Consumer<Long> c = l -> System.out.println(l);

		c.accept(f.apply("123123", "502123"));
	}
}
