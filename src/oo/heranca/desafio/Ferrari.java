package oo.heranca.desafio;

public class Ferrari extends Carro {

	public Ferrari() {
		this(315);
	}

	// segunda opção de construtor
	public Ferrari(int velocidadeMaxima) {
		super(velocidadeMaxima);

	}

	@Override
	public void acelerar() {

		velocidadeAtual += 15;
	}

}
