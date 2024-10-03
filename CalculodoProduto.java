package javaCurso;

import java.util.Scanner;

public class CalculodoProduto {

	public static void main(String[] args) {
		/*### 6. *Cálculo de Desconto*
		- Escreva um programa que peça o preço original de um produto e um percentual de desconto. 
		O programa deve calcular o preço final após o desconto.*/
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Digite o valor do produto: ");
		double valor = sc.nextDouble();
		
		System.out.println("Digite a porcentagem do desconto: ");
		double desc = sc.nextDouble();
		
		
		double total = (valor * (desc / 100));
		
		double desctotal = valor - total;
		
		System.out.println(" o Preço final do desconto é: "+  desctotal );
		

	}

}
