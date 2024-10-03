package javaCurso;

import java.util.Scanner;
import java.util.Random;

public class NumeroAleatorio {

	public static void main(String[] args) {
		
		/*### 5. *Gerador de Números Aleatórios*
		- Crie um programa que gere 5 números aleatórios entre 1 e 100 e exiba-os.*/
		
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 5 numeros iremos deixa eles aleatorios: ");
		int numero = sc.nextInt();
		
		
		
		for (int i = 0; i < numero ; i++) {
			int alea = random.nextInt(100) +1;
			System.out.println(alea);
		}
		

	}

}
