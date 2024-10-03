package javaCurso;

public class ClasseComMetodo {

	// Método 01: Calcula a soma de 2 numeros:

	public int soma(int a, int b) {
		return a + b;
	}

	// Método 02: Verificar se 1 numero e par:

	public boolean ehPar(int numero) {
		return numero % 2 == 0;
	}

	// Método 3: Inverte uma string

	public String inverteString(String a) {
		return new StringBuilder(a).reverse().toString();

	}
	
	//Método 04: calcula o fatorial de um número:
	
	public int factorial (int numero) {
		if ( numero == 0 || numero == 1 ) {
			return 1;
		}
		return numero * factorial(numero - 1);
	}

	public static void main(String[] args) {
		// Instanciando a classe:
		ClasseComMetodo utilidades = new ClasseComMetodo();

		// Chamando os metodos:

		System.out.println("A soma de 5 e 3 é: " + utilidades.soma(5, 3));
		System.out.println(utilidades.ehPar(2));
		System.out.println("este e o nome invertido: " + utilidades.inverteString("luciano"));
		System.out.println(utilidades.factorial(5));
	}

}
