package javaCurso;

import java.util.Scanner;

public class VerificarseParImpar {

	public static void main(String[] args) {
		
		Scanner tc = new Scanner(System.in);
		
		System.out.println("Verifique se seu numero e Par ou Impar, digite o mesmo: ");
		
		int numero = tc.nextInt();
		
		String total = (numero % 2 == 0) ? "Ele será par "+numero+ " Nº" : "Ele e impar";
		System.out.println(total);
		

	}

}
