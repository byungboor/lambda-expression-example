package lambda;

import java.util.Optional;

public class Example5Optional2 {
	public static void main(String[] args) {
		Optional<String> opt = Optional.of("Date Time");
		System.out.println(opt.map(s -> "Not null : " + s).orElse("Not Null"));
	}
}
