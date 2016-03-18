package lambda;

import java.util.function.UnaryOperator;

public class Example3UnaryOperator {
	public static void main(String[] args) {
		UnaryOperator<Double> sqrt = d -> d * d;
		System.out.println(">>" + sqrt.apply((double) 64));
	}
}
