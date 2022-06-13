package oo.encapsulamento.casaA;

public class Paulo {
	//Paulo mora na mesma casa que a Ana
	Ana esposa = new Ana();
	
	
	void testeAcessos () {
		//segredo
		//facoDentroDeCasa
		//formaDeFalar
		//todosSabem
		
		//System.out.println(esposa.segredo); nao consegue ver
		System.out.println(esposa.facoDentroDeCasa);
		System.out.println(esposa.formaDeFalar);
		System.out.println(esposa.todosSabem);
		
	}

}
