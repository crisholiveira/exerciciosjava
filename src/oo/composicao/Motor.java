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
			return (int) Math.round(fatorInjecao * 3000); // necessário para arredoindar pois um é bouble e o outro int
		}
	}

}
