package oo.composicao.desafio;

public class Sistema {
	public static void main(String[] args) {

		

		Compra compra1 = new Compra();
		compra1.adicionarItem("Caneta", 9.67, 100);
		compra1.adicionarItem(new Produto("Notebook", 1897.88), 2);

		Compra compra2 = new Compra();
		compra2.adicionarItem("Caderno", 19.67, 10);
		compra2.adicionarItem(new Produto("Impressora", 2125.44), 3);
		
		Cliente cliente = new Cliente("Maria Moraes");
		cliente.adicionarCompra(compra1);//são duas formas de adicionar compra
		cliente.compras.add(compra2);
		
		System.out.println(cliente.obterValorTotal());

	}

}
