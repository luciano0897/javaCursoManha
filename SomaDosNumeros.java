package javaCurso;

import java.util.Scanner;

public class SomaDosNumeros {

	public static void main(String[] args) {
		/*### 4. *Soma dos Dígitos de um Número*
		- Faça um programa que peça um número inteiro e calcule a soma de seus dígitos.  
		  Exemplo: Para o número 1234, a soma seria \(1 + 2 + 3 + 4 = 10\).*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Digite os numero para serem somado em seguencia: exemp 1234");
		
		int entrada = sc.nextInt();
		int soma = 0;
		
		
		for (; entrada != 0; entrada /= 10) {
			 
			 soma = soma + entrada % 10;
			 
			
		}
		
		System.out.println("A soma dos Digitos é: " +soma);


	}

}
