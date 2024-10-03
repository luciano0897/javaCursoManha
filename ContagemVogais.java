package javaCurso;
import java.util.Scanner;

public class ContagemVogais {

	public static void main(String[] args) {
		
		/*Escreva um programa que peça uma frase e 
		conte quantas vogais (a, e, i, o, u) ela contém.*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" vamos ve quantas vogais sua frase tem: ");
		
		String nome = sc.nextLine();
		int numeroVogais = contarVogais(nome);
		
		System.out.println("A  frase contém " + numeroVogais + " vogais");
		
		sc.close();
		
	}
	
	public static int contarVogais(String nome) {
		
	int contagem = 0;
	String vogais = "aeiouAEIOU";
		
		
		for (int i = 0; i < nome.length(); i++) {
			char letra = nome.charAt(i);
			if(vogais.indexOf(letra) != -1) {
				contagem++;
			}
		
		
		}
		 return contagem;
		
	}

}
