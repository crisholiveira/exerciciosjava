package oo.heranca;

public class Jogador {

	public int vida = 100;

	public int x;
	public int y;

	public boolean atacar(Jogador oponente) {
		int deltax = Math.abs(x - oponente.x);
		int deltay = Math.abs(y - oponente.y);

		if (deltax == 0 && deltay == 1) {
			oponente.vida -= 10;
			return true;
		} else if (deltax == 1 && deltay == 0) {
			oponente.vida -= 10;
			return true;
		} else {
			return false;
		}

	}

	public boolean andar(Direcao direcao) {

		switch (direcao) {
		case NORTE:
			y--;
		case LESTE:
			x++;
		case SUL:
			y++;
		case OESTE:
			x--;
			break;
		}

		return true;

	}

}
