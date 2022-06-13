package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
	
	public static void main(String[] args) {
		
		Consumer<Produto> imprimir = p -> System.out.println(p.nome + "!!!");
		
		Produto p1 = new Produto("Caneta", 12.34, 0.09);
		
		imprimir.accept(p1);
		
		Produto p2 = new Produto("Lapiseira", 9.98, 0.08);
		Produto p3 = new Produto("Borracha", 11.50, 0.10);
		Produto p4 = new Produto("Apontador", 7.98, 0.05);
		Produto p5 = new Produto("Clips", 15.34, 0.20);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
		
		produtos.forEach(imprimir);
		
		produtos.forEach(p -> System.out.println(p.preco));
		
		produtos.forEach(System.out::println);
		
		
		
	}

}
