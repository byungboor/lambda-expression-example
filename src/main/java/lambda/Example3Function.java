package lambda;

import java.util.function.Function;

public class Example3Function {
	public static void main(String[] args) {
		Function<String, Long> f = s -> Long.valueOf(s);
		System.out.println(f.apply("123123"));
	}
}
