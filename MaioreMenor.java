package javaCurso;

import java.util.Scanner;

public class MaioreMenor {

	public static void main(String[] args) {
		
		/*### 7. *Comparação de Três Números*
		- Faça um programa que peça três números inteiros e exiba o maior e o menor deles.*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int valor = sc.nextInt();
		
		System.out.println("Digite outro numero: ");
		int valor1 = sc.nextInt();
		
		System.out.println("Digite mais um numero: ");
		int valor2 = sc.nextInt();
		
		if (valor > valor1 || valor1 > valor && valor2 > valor1 || valor1 > valor2 ) {
			System.out.println("Este valor e maior");
			
		}else if (0 < valor1 || valor1 < valor && valor2 < valor1 || valor1 < valor2 ){
			System.out.println("Este valor é menor");
		}
		

	}

}
