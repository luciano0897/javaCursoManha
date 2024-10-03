package javaCurso;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		/*Exercício 2: Verificar se um número é par ou ímpar
		 *Descrição*: Crie um programa que receba um número inteiro do usuário e use a função if 
		*para verificar se o número é par ou ímpar. Se o número for divisível por
		 2, ele é par; caso contrário, é ímpar.*/
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Vamos verificar se seu numero e Par ou Impar: ");
		int valor = entrada.nextInt();
		
		int total = valor % 2  ;
		
		if (total == 0) {
			System.out.println("Seu numero é Par: " +valor);
		}else {
			System.out.println("Seu numero é Impar: "+valor);
		}
		
		
		
	}

}
