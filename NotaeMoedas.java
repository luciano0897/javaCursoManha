package javaCurso;

import java.util.Scanner;

public class NotaeMoedas {

	public static void main(String[] args) {
		/*Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monetário.
		A seguir, calcule o menor número de notas e moedas possíveis no qual o valor pode ser decomposto. 
		As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. 
		A seguir mostre a relação de notas necessárias.*/
		
		Scanner ent = new Scanner(System.in);
		
		int entradaNumero =  ent.nextInt();
		
		int [] notas = {100, 50, 20, 10, 5, 2};
		
		int [] moedas = {100, 50, 25, 10, 5, 1};
		
		System.out.println("Notas: ");
		for (int nota: notas) {
		int cem = entradaNumero / nota ; 
		
	System.out.println(cem+ " "+nota);
		entradaNumero %= nota * 100;
		
		
		}
		
		System.out.println("Moedas:");
		
		for (int moeda: moedas) {
			int cem = entradaNumero / moeda ; 
			
			System.out.println(cem+ " "+moeda);
				entradaNumero %= moeda * 100;
				
		}
		
	}

}
