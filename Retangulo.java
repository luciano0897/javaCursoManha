package javaCurso;

import java.util.Scanner;

public class Retangulo {

	public static void main(String[] args) {
		
		Scanner tc = new Scanner(System.in);
		
		System.out.println("Digite o valor da altura do retangulo");
		int alt = tc.nextInt();		
		
		System.out.println("Digite o valor do comprimento do retangulo");
		int comp = tc.nextInt();
		
		int total = alt * comp ;
		
		System.out.println("O tamanho do rentagulo é " +total);
	}

}
