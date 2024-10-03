package javaCurso;

import java.util.Scanner;

public class MaiorMenor {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite os numeros e saber quem e maior e quem e menor");
		int maior = teclado.nextInt();
		int menor = teclado.nextInt();
		
		String resultado = (maior > menor) ? "maior" : "menor";
		System.out.println(resultado);
		
	}

}
