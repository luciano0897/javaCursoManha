package javaCurso;



import java.util.Scanner;

public class Dirigirl {

	public static void main(String[] args) {
		
		System.out.println("Qual e sua idade vamos vê se vc pode dirigir: ");
			
			Scanner scanner = new Scanner(System.in);
			
			int idade = scanner.nextInt();
			
			if(idade >= 18) {
				System.out.println("voce pode dirigir " +idade+ "anos");
			}else {
				System.out.println("você não pode dirigir "+idade+ "anos");
			}
	}

}
