package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {
//pedro é filho da Ana, então herda
	//precisa importar a Ana pois está em outro pacote -ctrl+shift+o
	
	void testeAcessos () {
		//segredo
		//facoDentroDeCasa
		//formaDeFalar
		//todosSabem
		//Ana mae = new Ana(); como é herança, não instancia
		//System.out.println(segredo); nao consegue ver
		//System.out.println(facoDentroDeCasa); default e não consegue visualiza, só dentro do mesmo pacote
		System.out.println(formaDeFalar);
		System.out.println(todosSabem);
		
	}
	
}
