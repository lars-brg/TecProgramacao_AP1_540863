
public class RoboBispo extends Robo {

	
	public RoboBispo() {
		super();
		this.nome = "Bispo";
		this.id = 4;
	}

	@Override
	public String mostrar() {
		return "+";
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
