package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example4FlatMapOperation {
	public static void main(String[] args) {
		List<String> itemList = Arrays.asList("abc", "de", "f");

		List<String> list = itemList.stream().flatMap(new Function<String, Stream<String>>() {
			@Override
			public Stream<String> apply(String t) {
				return t.chars().mapToObj(c -> Character.toString((char) c));
			}
		}).map(s -> s.toUpperCase()).collect(Collectors.toList());

		list.stream().forEach(System.out::println);
	}
}
