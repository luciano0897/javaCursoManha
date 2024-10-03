package javaCurso;

import java.util.Scanner;

public class TrabalhanoComString {

	public static void main(String[] args) {
		
		Scanner tc = new Scanner(System.in);
		
		String  texto = "Bem Vindo ao curso de java";
		String  texto2 = "Vamos aprender sobre String";
		String  nome = "Luciano batista da Silva";
		
		//1. Comprimento da String:
		System.out.println("*******************************************************************");
		System.out.println("-----------------Comprimento da String-------------------------------");
		
		System.out.println("Comprimento da String: "+texto.length());
		System.out.println("Comprimento da String: "+texto2.length());
		System.out.println("Nome: "+nome.length());
		
		//2. Concatenar Strings:
		System.out.println("*******************************************************************");
		System.out.println("---------------------Concatenar String------------------------");
		
		String textoCompleto = texto +" "+ texto2;
		
		System.out.println(textoCompleto);
		
		String nome2 = "Luciano";
		String sobreNome = "Batista";
		
		System.out.println(nome2 + " "+ sobreNome);
		
		
		
		
		//3. Converter para MAIÙSCULAS E minúsculas:
		System.out.println("*******************************************************************");
		System.out.println("-----------Converter para MAIÚSCULO e minúsculo---------------------");
		
		System.out.println(" MAIÚSCULAS: " +texto.toUpperCase());
		System.out.println(" MAIÚSCULAS: " +texto.toLowerCase());

		
		//4. Substituir uma parte da String
		System.out.println("*******************************************************************");
		System.out.println("-----------Substituir uma parte da String-----------");
		
		String novoTexto = texto.replace("java", "Viteoria");
		System.out.println("Texto Após substituição: " +novoTexto);
		
		//5. Buscar por uma substring:
		System.out.println("*******************************************************************");
		System.out.println("-----------Buscar por uma substring:-----------");
		int posicao = texto.indexOf("curso");
		System.out.println("Posição da palavra 'curso': "+posicao);
		
		//6. Verificar se uma string começa ou termina com 1 substring
		System.out.println("*******************************************************************");
		System.out.println("-----------Verificar se uma string começa ou termina com 1 substring_-----------");
		
		System.out.println("Começa com 'Bem': " +texto.startsWith("Bem"));
		System.out.println("Termina com 'java': " +texto.endsWith("java"));
		
		//7.Dividir String
		System.out.println("*******************************************************************");
		System.out.println("-----------Dividir String-----------");
		
		String [] palavras = textoCompleto.split(" ");
		
		System.out.println("Palavras no texto completo");
		for ( String palavra: palavras ) {
			System.out.println(palavra);
		}
		
		//8. Remover espaços em brancos
		System.out.println("*******************************************************************");
		System.out.println("-----------Remover espaços em brancos-----------");
		
		String textoComEspacos = "          texto com espaços                ";
		System.out.println("Texto sem espaços: '"+ textoComEspacos.trim() + "'");
		
	}

}
