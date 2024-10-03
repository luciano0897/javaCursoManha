package javaCurso;
import java.util.Scanner;
public class Votar {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual e sua idade é");
		int idade = entrada.nextInt();
		
		if (idade < 16) {
			System.out.println("Proibido vota");
		} else if ( idade == 16 || idade < 18) {
			System.out.println("vota se quiser");
		} else if (idade >= 18) {
			System.out.println("voto é obrigadorio");
		}
	}

}
