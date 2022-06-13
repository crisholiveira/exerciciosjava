package oo.encapsulamento;

public class Pessoa {
	public int idade;
	
	//java cria automatico o get e setters, basta ir em source
	
	public Pessoa(int idade) {
		setIdade(idade);
	}
	
	//get ler idade
	public int getIdade() { 
		return idade;
	}
	
	public void setIdade(int novaIdade) {//alterar idade set
		novaIdade = Math.abs(novaIdade);
		if(novaIdade >= 0 && novaIdade <= 120) {
			this.idade = novaIdade;
		}
	}

}
