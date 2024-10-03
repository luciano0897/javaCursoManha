package javaCurso;

import java.util.Scanner;

public class JurosSimples {

	public static void main(String[] args) {
		//Instanciar a classe (usando a classe):
		
		Scanner scanner = new Scanner(System.in);
		
		// Entrada de valores 
		
		System.out.println("----------------------------------------");
		System.out.println("(= CALCULADORA DE JUROS SIMPLE DO LBS =)");
		System.out.println("----------------------------------------");
		System.out.println("Digite o capital: ");
		double capital = scanner.nextDouble();
		
		System.out.println("Digite o taxa de Juros(%): ");
		double taxa = scanner.nextDouble();
		
		System.out.println("Informe o tempo(em anos): ");
		int tempo = scanner.nextInt();
		
		
		//calculando os juros 
		double juros = (capital * taxa * tempo) /100;
		System.out.println("O valor do juros são: "+juros);
		
		//resultado:
		
		double total = capital + juros;
		System.out.println(" O total + investidor + juros é de: "+total);
		
		
		scanner.close();

	}

}
