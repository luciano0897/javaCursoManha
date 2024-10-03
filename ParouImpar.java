package javaCurso;

import java.util.Scanner;

public class ParouImpar {

	public static void main(String[] args) {
		
		Scanner tc = new Scanner(System.in);
		
		System.out.println("vamos vê quem e o par e Impar:");
		int numero = tc.nextInt();
		
		String resultado = (numero % 2 == 0) ? "será par " : "Ele será impar";
		
		System.out.println(resultado);
		

	}

}
