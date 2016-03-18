package lambda;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Example3Supplier {
	public static void main(String[] args) {
		Random random = new Random();
		random.setSeed(3);

		Supplier<Integer> s = () -> random.nextInt();
		Consumer<Integer> c = i1 -> {
			System.out.println(i1);
		};

		int val = s.get();
		c.accept(val);
	}
}
