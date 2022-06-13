package lambdas;

public class Produto {

	final String nome;
	final double preco;
	final double desconto;

	public Produto(String nome, double preco, double desconto) {
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}

	// fun��o necess�ria para imprimir a lista de produtos, para n�o ficar ilegivel
	public String toString() {
		double precoFinal = preco * (1 - desconto);
		return  nome + " tem pre�o de R$ " + precoFinal;
	}

}
