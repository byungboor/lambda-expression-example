package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Example4MapOperation {
	public static void main(String[] args) {
		List<String> itemList = Arrays.asList("a", "b", "c", "d", "e", "f");

		Optional<String> optional = itemList.stream().map(a -> a.toUpperCase()).reduce((a, b) -> a + b);
		optional.ifPresent(a -> System.out.println(a));
	}
}
