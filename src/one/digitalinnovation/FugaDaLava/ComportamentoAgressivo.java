package one.digitalinnovation.FugaDaLava;

import java.util.Random;

public class ComportamentoAgressivo implements Comportamento {

	private int chanceDefeitoPadrao=45;

	@Override
	public int mover() {
		Random rand = new Random(); 
		int chanceAleatoria = rand.nextInt(100);
		if (chanceAleatoria > chanceDefeitoPadrao){
			return 3;
		}else{//movimento foi interrompido, retorne o quanto o robo andou antes de ser interrompido
			return rand.nextInt(3)*(-1);

		}
	}

	

}
