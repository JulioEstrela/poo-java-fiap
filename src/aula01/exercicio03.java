package aula01;

import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
				
		double maiorMetal = 0;
		for (int i = 1; i <= 3; i++) {
			System.out.printf("Insira o valor do metal %d:\n", i);
			double metalAtual = scanner.nextDouble();
			
			if (metalAtual > maiorMetal) {
				maiorMetal = metalAtual;
			}
		}
		
		System.out.println("Maior metal: " + maiorMetal);
	}

}
