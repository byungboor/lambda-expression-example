package lambda;

import java.util.Date;

public class Example1AnonymousClass {
	public static void main(String... args) {
		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				System.out.println(new Date());
			}
		};

		runnable.run();
	}
}
