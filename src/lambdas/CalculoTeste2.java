package lambdas;

public class CalculoTeste2 {

	// agora com lambda

	public static void main(String[] args) {

		// expressão anonima, função lambda
		Calculo calculo = (x, y) -> {
			return x + y;
		};

		System.out.println(calculo.executar(2, 3));

		// neste caso pode omitir as chaves e o return
		calculo = (x, y) -> x * y;

		System.out.println(calculo.executar(3, 4));

	}

}
