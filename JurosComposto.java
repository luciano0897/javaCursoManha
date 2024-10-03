package javaCurso;
import java.util.Scanner;

public class JurosComposto {

	public static void main(String[] args) {
		//Instanciando uma classe para usá-la:
		
		Scanner sc = new Scanner(System.in);
		
		// Entrada do ususario:
		
		System.out.println("Digite o capital: ");
		double capital = sc.nextDouble();
		
		// Entradas do usuario:
		// Pegando a taxa de juros:
		System.out.println("Qual e a taxa de juros: ");
		double taxa = sc.nextDouble();
		
		System.out.println("Digite o tempo em anos: ");
		int tempo = sc.nextInt();
		
		// Calculando o juros compostos:
		
		double montante = capital * Math.pow(1 + (taxa/100), tempo);
		//saida final
		System.out.println("O montante final será de R$ "+montante);
		sc.close();
	}

}
