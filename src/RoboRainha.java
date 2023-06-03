public class RoboRainha extends Robo {

	public RoboRainha() {
		super();
		this.nome = "Rainha";
		this.id = 7;
	}

	@Override
	public String mostrar() {
		return "¥";
	}
	@Override
	public void avancar(int numCelulas) {
		posicaoY+=numCelulas;
		posicaoX+=numCelulas;
	}
	@Override
	public void retroceder(int numCelulas) {
		posicaoY-=numCelulas;
		posicaoX-=numCelulas;
	}

}
