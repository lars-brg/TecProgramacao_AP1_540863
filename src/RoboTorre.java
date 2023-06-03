
public class RoboTorre extends Robo{

	
	public RoboTorre() {
		super();
		this.nome = "Torre";
		this.id = 3;
	}

	@Override
	public String mostrar() {
		// TODO Auto-generated method stub
		return "T";
	}
	@Override
	public void avancar(int numCelulas) {
		posicaoY+=numCelulas;
	}
	@Override
	public void retroceder(int numCelulas) {
		posicaoY-=numCelulas;
	}
}
