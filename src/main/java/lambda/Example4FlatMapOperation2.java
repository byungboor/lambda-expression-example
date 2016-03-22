package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example4FlatMapOperation2 {
	public static void main(String[] args) {
		List<String> wordList = Arrays.asList("Java", "Magazine");

		List<String> charList = wordList.stream().map(s -> s.split("")).flatMap(arr -> Arrays.stream(arr)).collect(Collectors.toList());
		charList.stream().forEach(System.out::println);
	}
}
