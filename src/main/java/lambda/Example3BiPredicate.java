package lambda;

import java.util.function.BiPredicate;

public class Example3BiPredicate {
	public static void main(String[] args) {
		BiPredicate<Integer, Integer> biPredicate = (i1, i2) -> i1 > i2;
		System.out.println(biPredicate.test(2, 3));
	}
}
