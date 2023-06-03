import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("+================================================+");
		System.out.println("           BEM VINDO(A) A ILHA DE JAVA!           ");
		System.out.println("+================================================+");
		
		System.out.println("                                                  \n"
				+ "                                 (                \n"
				+ "                                ((                \n"
				+ "                                ((                \n"
				+ "                              (((                 \n"
				+ "                            (((                   \n"
				+ "                        (((((        ((           \n"
				+ "                     (((((      (((               \n"
				+ "                   ((((     ((((                  \n"
				+ "                 ((((     ((((                    \n"
				+ "                 (((      (((                     \n"
				+ "                 (((      (((((                   \n"
				+ "                   ((      (((((                  \n"
				+ "                     ((      ((((                 \n"
				+ "                       (      (((                 \n"
				+ "              ///            (           /  .///  \n"
				+ "       ////                          //        ///\n"
				+ "          ////////////////////                 ///\n"
				+ "              /                               /// \n"
				+ "           ///////          ////////       ///    \n"
				+ "                  //////////                      \n"
				+ "                                                  \n"
				+ "              /////////////////////               \n"
				+ "      ,///          ////////                      \n"
				+ " ////                                        //   \n"
				+ "   /////////////////////////////////////        */\n"
				+ "                                        //////    \n");

		
		try {
			String nome;
			
			System.out.print("\nDigite seu nome: ");
			nome = input.nextLine();
			
			boolean entradaValida = false;
			
			while (!entradaValida) {
				System.out.println("\n+== PREENCHA OS SEGUINTE VALORES ==+");
	            try {
	            	int larguraPlano;
	    			int alturaPlano;
	    			int qtdAlunos;
	    			int qtdBugs;
	                System.out.print("\nDigite a quantidade de células \npara a largura do plano: ");
	                larguraPlano = Integer.parseInt(input.nextLine());

	                if (larguraPlano <= 0) {
	                    throw new IllegalArgumentException("A largura do plano deve ser um valor positivo!");
	                }

	                System.out.print("\nDigite a quantidade de células \npara a altura do plano: ");
	                alturaPlano = Integer.parseInt(input.nextLine());

	                if (alturaPlano <= 0) {
	                    throw new IllegalArgumentException("A altura do plano deve ser um valor positivo!");
	                }

	                System.out.print("\nDigite a quantidade de alunos \npara serem resgatados da ilha: ");
	                qtdAlunos = Integer.parseInt(input.nextLine());

	                if (qtdAlunos < 0) {
	                    throw new IllegalArgumentException("A quantidade de alunos deve ser um valor positivo!");
	                }
	                
	                if (qtdAlunos > ((larguraPlano*alturaPlano)/2)) {
	                    throw new IllegalArgumentException("O numero de alunos deve ser menor que a metade de células do plano");
	                }

	                System.out.print("\nDigite a quantidade de bugs que\nvocê deve evitar na ilha: ");
	                qtdBugs = Integer.parseInt(input.nextLine());

	                if (qtdBugs < 0) {
	                    throw new IllegalArgumentException("A quantidade de bugs deve ser um valor positivo!");
	                }
	                
	                if (qtdBugs > ((larguraPlano*alturaPlano)/2)) {
	                    throw new IllegalArgumentException("O numero de bugs deve ser menor que a metade de células do plano");
	                }
	                
	                System.out.println("\n\n+== JOGO INICIADO! ==+");
	                Jogo jogo = new Jogo(nome, larguraPlano, alturaPlano, qtdAlunos, qtdBugs);
					jogo.Jogar();
	                entradaValida = true;
	            } catch (NumberFormatException e) {
	                System.out.println("Entrada inválida. Digite um número válido.");
	            } catch (IllegalArgumentException e) {
	                System.out.println(e.getMessage());
	            }
	        } 
        } catch (InputMismatchException e) {
            System.out.println("\nEntrada inválida. Certifique-se de digitar um valor numérico válido.");
        }
		                                                                                                                                                                                                                                                                                                                                                            
	}
}