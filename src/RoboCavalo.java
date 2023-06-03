
public class RoboCavalo extends Robo{

	public RoboCavalo() {
		super();
		this.nome = "Cavalo";
		this.id = 5;
	}

	@Override
	public String mostrar() {
		return "£";
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
