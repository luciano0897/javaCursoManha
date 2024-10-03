package javaCurso;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		/*Exercício 4: Verificar se um número é divisível por 3 e 5
		 *Descrição*: Crie um programa que receba um número inteiro do usuário 
		 *e use a função if para verificar se o número é divisível tanto por 3 quanto por 5. 
		 *Se for, exiba "O número é divisível por 3 e 5"; caso contrário, exiba "O número não é divisível por 3 e 5".*/
		
		System.out.println("Vamos verificar se seu numero 3 e 5 são divisível: ");
		Scanner entrada = new Scanner(System.in);
		
		int numero = entrada.nextInt();
		
	
		
		if (numero % 3 == 0 || numero % 5 == 0) {
			System.out.println(" ele e divisivel ");
		

	}else {
		System.out.println("numero nao e divisível: ");
	}

}
}

