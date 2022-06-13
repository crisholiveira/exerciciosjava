package oo.heranca.teste;

import oo.heranca.Heroi;
import oo.heranca.Monstro;

public class Jogo {
	
	public static void main(String[] args) {
		
		Monstro monstro = new Monstro();
		monstro.x = 10;
		monstro.y = 10;
		
		Heroi heroi = new Heroi();
		heroi.x = 10;
		
		heroi.y = 11;
		
		System.out.println(monstro.vida);
		System.out.println(heroi.vida);
		
		monstro.atacar(heroi);
		
		System.out.println(monstro.vida);
		System.out.println(heroi.vida);
	}

}
