package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {
//pedro � filho da Ana, ent�o herda
	//precisa importar a Ana pois est� em outro pacote -ctrl+shift+o
	
	void testeAcessos () {
		//segredo
		//facoDentroDeCasa
		//formaDeFalar
		//todosSabem
		//Ana mae = new Ana(); como � heran�a, n�o instancia
		//System.out.println(segredo); nao consegue ver
		//System.out.println(facoDentroDeCasa); default e n�o consegue visualiza, s� dentro do mesmo pacote
		System.out.println(formaDeFalar);
		System.out.println(todosSabem);
		
	}
	
}
