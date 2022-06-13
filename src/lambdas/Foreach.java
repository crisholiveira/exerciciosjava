package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {

	public static void main(String[] args) {

		List<String> aprovados = Arrays.asList("Ana", "Lia", "Bia", "Gui");

		System.out.println("Forma tradicional ...");

		for (String nome : aprovados) {
			System.out.println(nome);
		}

		System.out.println("\nLambda #01 ...");
		aprovados.forEach(nome -> System.out.println(nome));

		System.out.println("\nMethod Reference #01 ...");
		// neste método não consegue personalizar o print com !!, é automatizado, vai
		// aparecer apenas os nome
		aprovados.forEach(System.out::println);

		System.out.println("\nLambda #02 ...");
		aprovados.forEach(nome -> meuImprimir(nome));

		System.out.println("\nMethod Reference #02 ...");
		aprovados.forEach(Foreach::meuImprimir);

	}

	// observe que não está dentro do main
	static void meuImprimir(String nome) {
		System.out.println("Oi, meu nome é " + nome);
	}

}
