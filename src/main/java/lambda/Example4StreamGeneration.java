package lambda;

import java.util.Random;
import java.util.stream.Stream;

public class Example4StreamGeneration {

	public static void main(String[] args) {
		Example4StreamGeneration example = new Example4StreamGeneration();
		example.createOf().forEach(s -> System.out.println("[Of] : " + s));
		example.createEmpty().forEach(s -> System.out.println("[Empty] : " + s));
		example.createGenreate().forEach(s -> System.out.println("[Generation] : " + s));
		example.createIterate().forEach(s -> System.out.println("[Iterator] : " + s));
	}

	public Stream<String> createOf() {
		return Stream.of("www.facebook.com", "www.pikicast.com", "wwww.naver.com", "www.daum.net", "www.google.com");
	}

	public Stream<String> createEmpty() {
		return Stream.of("www.facebook.com", "www.pikicast.com", "www.naver.com", null).flatMap(s -> s == null ? Stream.empty() : Stream.of(s));
	}

	public Stream<String> createGenreate() {
		Random random = new Random();
		return Stream.generate(() -> random.nextInt()).limit(10).map(i -> String.valueOf(i));
	}

	public Stream<String> createIterate() {
		return Stream.iterate(65, i -> i + 1).limit(26).map(i -> Character.toChars(i)).map(c -> String.valueOf(c));
	}
}
