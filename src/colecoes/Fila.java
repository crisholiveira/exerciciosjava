package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		//offer e add -> adicionam elementos na fila
		// Diferen�a � o comportamento quando a fila est� cheia
		
		fila.add("Ana"); // retorna false
		fila.offer("Bia"); //lan�a uma exce��o
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		//peek e element -> obter o pr�ximo elemento da fila sem remover
		//diferen�a � o comportamento quando a fila est� vazia
		
		System.out.println(fila.peek()); //retorna false
		System.out.println(fila.element());//lan�a uma exece��o
		
		//fila.size();
		//fila.clear();
		//fila.isEmpty();
		
		
		
	}

}
