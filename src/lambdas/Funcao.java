package lambdas;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {

		Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "Par" : "Impar";

		System.out.println(parOuImpar.apply(33));

		Function<String, String> oResultadoE = valor -> "O resultado é : " + valor;

		Function<String, String> empolgado = valor -> valor + "!!!";

		// composição de funções com o andThen
		//é possível pois na função anterior saiu uma string, e entrará String na próxima. Ou seja
		//o tipo de saída tem que ser o mesmo tipo para entrar
		String resultadoFinal = parOuImpar.andThen(oResultadoE).andThen(empolgado).apply(32);

		System.out.println(resultadoFinal);
	}

}
