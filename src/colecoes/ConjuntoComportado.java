package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {

		// Set<String> listaAprovados = new HashSet<String>(); // indica que a lista vai
		// ser de string

		SortedSet<String> listaAprovados = new TreeSet<>(); // destaforma respeita a ordem de inser��o
		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("Maria");

		for (String candidato : listaAprovados) {
			System.out.println(candidato);
		}

		Set<Integer> nums = new HashSet<>();
		nums.add(1);
		nums.add(2);
		nums.add(120);

		for (int n : nums) {
			System.out.println(n);
		}

	}

}
