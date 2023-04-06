package one.digitalinnovation.FugaDaLava;

import java.util.Random;

public class ComportamentoDefensivo implements Comportamento {

	private int chanceDefeitoPadrao = 10;

	@Override
	public int mover() {
		Random rand = new Random();
		int chanceAleatoria = rand.nextInt(100);
		if (chanceAleatoria > chanceDefeitoPadrao) {
			return 1;
		} else {//movimento foi interrompido, retorne o quanto o robo andou antes de ser interrompido
			return rand.nextInt(1) * (-1);

		}
	}

}
