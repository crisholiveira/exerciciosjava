package oo.composicao;

public class Motor {

	// atributos

	boolean ligado = false;
	double fatorInjecao = 1;

	// metodos

	int giros() {
		if (!ligado) {
			return 0;
		} else {
			return (int) Math.round(fatorInjecao * 3000); // necess�rio para arredoindar pois um � bouble e o outro int
		}
	}

}
