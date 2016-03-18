package lambda;

import java.util.function.Predicate;

public class Example3Predicate {
	public static void main(String[] args) {

		Predicate<String> predicate1 = new Predicate<String>() {
			@Override
			public boolean test(String t) {
				return t.startsWith("www");
			}
		};

		Predicate<String> predicate2 = url -> url.startsWith("www");

		System.out.println(predicate1.test("www.facebook.com"));
		System.out.println(predicate2.test("facebook.com"));
	}
}
