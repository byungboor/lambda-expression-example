package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Example4PrefixFilter {

	public static void main(String[] args) {
		List<String> wordList =
		        Arrays.asList("www.facebook.com", "www.pikicast.com", "wwww.naver.com",
		        		"www.daum.net", "www.google.com");
		Stream<String> stream = wordList.stream();
		System.out.println(stream.filter(s -> s.startsWith("www")).count());
	}
}
