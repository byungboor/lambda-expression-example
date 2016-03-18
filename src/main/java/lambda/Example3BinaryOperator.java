package lambda;

import java.util.function.BinaryOperator;


public class Example3BinaryOperator {
	public static void main(String... args) {
		BinaryOperator<String> biOper = (s1, s2) -> s1 + " : " + s2;
		System.out.println(biOper.apply("Hello", "World"));
	}
}
