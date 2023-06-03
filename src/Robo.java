import java.util.ArrayList;

public abstract class Robo implements ElementoDeJogo {

	public String nome;
	public int id;
	public int posicaoX = 1;
	public int posicaoY = 1;
	//Usar os seguintes valores pro relatório
	private int pontos = 0;
	private int qtdAlunosResgatados = 0;
	private int qtdBugsEncontrados = 0;
	private ArrayList<String> celulasVisitadas = new ArrayList<String>();
	// só pegar o robo e printar os valores em servicos
	
	
	public String mostrar() {
		return "@";
	}
	
	public abstract void avancar(int numCelulas);
	
	public abstract void retroceder(int numCelulas);
	
	public void ganharPontos() {
		pontos+=10;
	}
	
	public void perderPontos() {
		pontos-=15;
	}
	
	public int getPontos() {
		return this.pontos;
	}
	
	public int getTipo() {
		return 3;
	}
	
	public void adicionarAluno() {
		this.qtdAlunosResgatados++;
	}
	
	public void adicionarBug() {
		this.qtdBugsEncontrados++;
		this.adicionarCelula(1, 1);
	}

	public int getQtdAlunosResgatados() {
		return qtdAlunosResgatados;
	}

	public int getQtdBugsEncontrados() {
		return qtdBugsEncontrados;
	}
	
	public void adicionarCelula(int x, int y) {
		String coordenada = "("+ x +", "+ y +")";
		this.celulasVisitadas.add(coordenada);
	}
	
    public String retornarCelulasVisitadas() {
        StringBuilder resultado = new StringBuilder();
        
        for (int i = 0; i < celulasVisitadas.size(); i++) {
            resultado.append(celulasVisitadas.get(i));
            
            if ((i + 1) % 4 == 0 && i < celulasVisitadas.size() - 1) {
                resultado.append(",\n    ");
            } else if (i < celulasVisitadas.size() - 1) {
                resultado.append(", ");
            }
        }
        
        return resultado.toString();
    }
}