package classe;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook", 3825.44);
		
				
		Produto.desconto = 0.29;
		
		var p2 = new Produto();
		p2.nome = "Caneta Preta";
		p2.preco = 12.56;
		
		
		
		System.out.println(p1.nome);
		
		double precoFinal1 = p1.precoComDesconto();
		
		
		System.out.println(precoFinal1);
	}

}
