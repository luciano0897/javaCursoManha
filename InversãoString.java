package javaCurso;
import java.util.Scanner;

public class InversãoString {

	public static void main(String[] args) {
		
		Scanner tc = new Scanner(System.in);
		
		System.out.println(" Digite um nome e veja a mgica: ");
		
		
		
		String java = tc.nextLine();
		
		String reverso = new StringBuilder(java).reverse().toString();
		
		
		System.out.println(" reverso :" +reverso);
		

	}

}
