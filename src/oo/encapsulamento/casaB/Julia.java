package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Julia {

	void testeAcessos() {
		Ana sogra = new Ana();
		// segredo
		// facoDentroDeCasa
		// formaDeFalar
		// todosSabem

		// System.out.println(sogra.segredo); nao consegue ver
		//System.out.println(sogra.facoDentroDeCasa);
		//System.out.println(sogra.formaDeFalar);
		System.out.println(sogra.todosSabem); //s� o publico consegue ver

	}

}
