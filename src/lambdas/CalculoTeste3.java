package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {

	// agora com lambda

	public static void main(String[] args) {

		
		BinaryOperator<Double> calculo = (x, y) -> {
			return x + y;
		};

		System.out.println(calculo.apply(2.0, 3.0));

		// neste caso pode omitir as chaves e o return
		calculo = (x, y) -> x * y;

		System.out.println(calculo.apply(3.0, 4.0));

	}

}
