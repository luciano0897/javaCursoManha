package javaCurso;
import java.util.Scanner;

public class Exercicios5 {
public static void main(String[] args) {
	/* Exercício 5: Comparar dois números e verificar qual é maior
	 *Descrição*: Escreva um programa que receba dois números inteiros do usuário e use a estrutura if para verificar qual número é maior.
	 * O programa deve exibir qual dos números é maior ou, caso sejam iguais, informar que os números são iguais.*/
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Vamos verificar os numeros, nos informe um numero: ");
	
	int maior = entrada.nextInt();
	int menor = entrada.nextInt();
	
	
	if (maior > menor) {
		System.out.println("numero " +maior+ " e maior que: " + menor );
	}else if (maior < menor ) {
		System.out.println("Numero "+maior+ " e menor: " +menor);
	}else if (maior == menor) {
		System.out.println("os numeros são iguais: ");
	}
}
}
