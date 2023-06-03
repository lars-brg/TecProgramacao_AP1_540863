
public class RoboPeao extends Robo{

	public RoboPeao() {
		super();
		this.nome = "Peao";
		this.id = 2;
	}

	@Override
	public String mostrar() {
		return "#";
	}
	@Override
	public void avancar(int numCelulas) {
		posicaoX++;
	}
	@Override
	public void retroceder(int numCelulas) {
		posicaoX--;
	}
}
