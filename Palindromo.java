package javaCurso;
import java.util.Scanner;

public class Palindromo {
	public static void main(String[] args) {
		/*Crie um programa que peça uma palavra e verifique 
		se ela é um palíndromo (palavra que é igual de frente para trás*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Verifique se sua palavra e igual de trás pra frente: ");
		
		
		String nome = sc.nextLine();
		
		
		String reverso =  new StringBuilder(nome).reverse().toString();
		
		if (nome.equals(reverso)) {
			System.out.println("deu certo");
		}else {
			System.out.println("deu zebra");
		}
		
		
		
		
		
	}

}
