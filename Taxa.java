package javaCurso;
import java.util.Scanner;

public class Taxa {

	public static void main(String[] args) {
		/*Crie um programa em Java que calcula o valor a ser pago por um táxi com base nos quilômetros rodados: 
			R$2 por km rodado + R$ 10 de taxa fixa.*/
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o km rodado é saiba o valor que ira pagar: ");
		
		double reais = 2.00;
		double km = entrada.nextDouble();
		double taxa = 10.00;
		
		double total = taxa + (km * reais);
		
		System.out.println("O valor a pagar é: "+total);
		
		
		
		

	}

}
