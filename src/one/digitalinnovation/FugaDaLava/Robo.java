package one.digitalinnovation.FugaDaLava;

public class Robo {
	
	private Comportamento comportamento;
	private int status;

	public void setComportamento(Comportamento comportamento) {
		this.comportamento = comportamento;
	}
	
	public int mover() {
		return comportamento.mover();
		
	}

	public Comportamento getComportamento() {
		return comportamento;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	
}
