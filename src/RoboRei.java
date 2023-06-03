
public class RoboRei extends Robo{

	public RoboRei() {
		super();
		this.nome = "Rei";
		this.id = 6;
	}

	@Override
	public String mostrar() {
		return "§";
	}
	@Override
	public void avancar(int numCelulas) {
		posicaoY+=numCelulas;
		posicaoX+=numCelulas;
	}
	@Override
	public void retroceder(int numCelulas) {
		posicaoY+=numCelulas;
		posicaoX-=numCelulas;
	}
}
