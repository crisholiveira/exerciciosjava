package arrays;

import java.util.Arrays;

public class Exercicios {

	public static void main(String[] args) {

		double[] notasAlunoA = new double[3];
		System.out.println(Arrays.toString(notasAlunoA));

		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;

		System.out.println(Arrays.toString(notasAlunoA));

		double totalAlumoA = 0;
		for (int i = 0; i < notasAlunoA.length; i++) {
			totalAlumoA += notasAlunoA[i];

		}

		System.out.println(totalAlumoA / notasAlunoA.length);

		double[] notasAlunoB = { 6.9, 8.9, 5.5, 10 };

		double totalAlunoB = 0;

		for (int i = 0; i < notasAlunoB.length; i++) {
			totalAlunoB += notasAlunoB[i];

		}
		System.out.println(totalAlunoB / notasAlunoB.length);

	}

}
