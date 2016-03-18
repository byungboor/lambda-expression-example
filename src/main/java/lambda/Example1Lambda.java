package lambda;

import java.util.Date;

public class Example1Lambda {
	public static void main(String... args) {
		Runnable runnable = () -> System.out.println(new Date());
		runnable.run();
	}
}
