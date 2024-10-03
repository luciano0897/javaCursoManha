package javaCurso;
import java.util.Scanner;

public class PositivosNegativos {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int valor = entrada.nextInt();
		
		if( valor < 0) {
			System.out.println("Valor Negativos: "+valor);
			
		}else if ( valor > 0) {
			for (int i = 0; i < valor ; i++ ) {
			System.out.println("Valor Positivo e será repetido: "+valor);
			}
		}else {
			System.out.println("O valor é Zero: "+valor);
		}
	}

}
