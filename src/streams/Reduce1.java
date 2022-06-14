package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {
	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		BinaryOperator<Integer> soma = (ac, n) -> ac + n;

		// reduce funciona como um acumululador
		// get pega o numero

		int total = nums.stream().reduce(soma).get();
		System.out.println(total);

		// aqui passou um valor inicial para somar no acumulador
		// neste caso não precisa de get
		// com o parallel vai ter um acumulador diferente se só usar stream
		Integer total2 = nums.parallelStream().reduce(100, soma);
		System.out.println(total2);
		
		
		//neste caso só vai somar se corresponder verdadeiro no filter
		nums.stream().filter(n -> n > 5).reduce(soma).ifPresent(System.out::println);

	}

}
