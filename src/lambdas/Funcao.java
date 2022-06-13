package lambdas;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {

		Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "Par" : "Impar";

		System.out.println(parOuImpar.apply(33));

		Function<String, String> oResultadoE = valor -> "O resultado � : " + valor;

		Function<String, String> empolgado = valor -> valor + "!!!";

		// composi��o de fun��es com o andThen
		//� poss�vel pois na fun��o anterior saiu uma string, e entrar� String na pr�xima. Ou seja
		//o tipo de sa�da tem que ser o mesmo tipo para entrar
		String resultadoFinal = parOuImpar.andThen(oResultadoE).andThen(empolgado).apply(32);

		System.out.println(resultadoFinal);
	}

}
