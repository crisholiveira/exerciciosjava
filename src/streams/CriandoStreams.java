package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

	public static void main(String[] args) {

		Consumer<String> print = System.out::print;

		Stream<String> langs = Stream.of("Java ", "Lua ", "JS\n");
		langs.forEach(print);

		String[] maisLangs = { "Python ", "Lisp ", "Perl ", "Go\n" };

		Stream.of(maisLangs).forEach(print);
		Arrays.stream(maisLangs).forEach(print);
		Arrays.stream(maisLangs, 1, 2).forEach(print); // inclui o 1 e n�o inclui o 2

		List<String> outrasLangs = Arrays.asList("C ", "PHP ", "Kotlin\n");
		outrasLangs.stream().forEach(print);

		outrasLangs.parallelStream().forEach(print);// n�o s�o processados na ordem

	}

}
