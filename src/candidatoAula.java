import java.util.Locale;
import java.util.Scanner;

public class candidatoAula {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int escolaridade, experiencia, pontoExpe, pontoEscola, cargo;
		char disponibilidade, habilitacao;
		//leitura da escolaridade
		System.out.println("Qual sua escolaridade?");
		System.out.println("1) Ensino Fundamental");
		System.out.println("2) Ensino M�dio");
		System.out.println("3) Ensino Superior");
		System.out.println("4) P�s-gradua��o");
		System.out.print("Digite uma op��o: ");
		
		escolaridade = sc.nextInt();
		System.out.println();
		// leitura da experiencia
		System.out.print("Voc� tem quantos anos de experi�ncia profissional? ");
		experiencia = sc.nextInt();
		System.out.print("Voc� tem disponibilidade para viajar (S/N)? ");
		disponibilidade = sc.next().charAt(0);
		// leitura da habilitacao
		System.out.print("Voc� tem habilita��o de motorista (S/N)? ");
		habilitacao = sc.next().charAt(0);
		System.out.println();
		// pontua��o da escolaridade
		if (escolaridade == 1) {
			pontoEscola = 10;
		}
		else if (escolaridade == 2) {
			pontoEscola = 20;
		}
		else if (escolaridade == 3) {
			pontoEscola = 30;
		}
		else {
			pontoEscola = 40;
		}
		// pontua��o da experi�ncia
		if(experiencia == 0) {
			pontoExpe = 0;
		}
		else if (experiencia > 0 && experiencia <= 2) {
			pontoExpe = 10;
		}
		else if (experiencia > 2 && experiencia <= 5) {
			pontoExpe = 20;
		}
		else {
			pontoExpe = 40;
		}
		System.out.println("Pontos por escolaridade: " + pontoEscola);
		System.out.println("Pontos por experi�ncia: " + pontoExpe);
		sc.close();

	}

}
