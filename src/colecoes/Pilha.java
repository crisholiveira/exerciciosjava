package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	
	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<String>();
		
		livros.add("O pequeno principe");
		livros.push("Don Quixote");
		livros.push("O Hobbit");
		
		//pegar os livros
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		
		//remover os livros
		System.out.println(livros.poll());
		System.out.println(livros.remove());
		System.out.println(livros.pop());
	}

}
