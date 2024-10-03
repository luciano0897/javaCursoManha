package javaCurso;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("o valor inicial é");
		
		
		// Conhecendo a condicional IF
		
		double idade = scanner.nextDouble();	
		
		//verificar o nome exato:
		for(int i = 0; i < idade; i++) {
			
		
		
		if (idade > 20 ) {
			System.out.println("o valor é maior que 20!" +idade+i);
		
		

	}else {
		System.out.println("menor que 20");
	}
	}
}
}


