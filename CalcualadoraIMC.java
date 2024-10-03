package javaCurso;

import java.util.Scanner;

public class CalcualadoraIMC {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Digite seu nome: ");
		String nome = scanner.nextLine();
		
		System.out.println("Nome digitado: " + nome);
		
		System.out.println("Digite o seu peso (kg): ");
		double peso = scanner.nextDouble();
		
		System.out.println("Digite o sua altura (m): ");
		double altura = scanner.nextDouble();
		
		double imc = calcularIMC(peso, altura);
		
		System.out.printf("Seu IMC é: %2f\n", imc);
		
		
		classificarIMC(imc);
		
		scanner.close();

	}
	
	public static double calcularIMC(double peso, double altura) {
		return peso/(altura * altura);
	}
	
	public static void classificarIMC(double imc) {
		if (imc < 18.5) {
			System.out.println("classificação: Abaixo do peso");
		}else if(imc >= 18.5 && imc <24.9) {
			System.out.println("Classificação: Peso normal");
		}else if (imc >= 25.0 && imc < 29.9) {
			System.out.println("classificação sobrepeso");
		}else if (imc >= 30.0 && imc < 34.9) {
			System.out.println("classificação: obesidade grau 1");
		}else if (imc >= 35.0 && imc < 39.9) {
			System.out.println("classificação: obesidade grau 1");
	}else {
		System.out.println("classificação: Obesidade grau 3 (Obesidade Mórbida");
	}
}
}
