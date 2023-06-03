public class RoboAndador extends Robo{
	
	public RoboAndador() {
		super();
		this.nome = "Andador";
		this.id = 1;
	}

	@Override
	public String mostrar() {
		// TODO Auto-generated method stub
		return "@";
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
