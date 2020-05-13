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
		System.out.println("2) Ensino Médio");
		System.out.println("3) Ensino Superior");
		System.out.println("4) Pós-graduação");
		System.out.print("Digite uma opção: ");
		
		escolaridade = sc.nextInt();
		System.out.println();
		// leitura da experiencia
		System.out.print("Você tem quantos anos de experiência profissional? ");
		experiencia = sc.nextInt();
		System.out.print("Você tem disponibilidade para viajar (S/N)? ");
		disponibilidade = sc.next().charAt(0);
		// leitura da habilitacao
		System.out.print("Você tem habilitação de motorista (S/N)? ");
		habilitacao = sc.next().charAt(0);
		System.out.println();
		// pontuação da escolaridade
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
		// pontuação da experiência
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
		System.out.println("Pontos por experiência: " + pontoExpe);
		sc.close();

	}

}
