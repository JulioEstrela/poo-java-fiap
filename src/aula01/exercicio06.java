package aula01;

import java.util.Scanner;

public class exercicio06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Insira o valor total das compras:");
		double valorTotal = Double.parseDouble(scanner.nextLine());
		
		System.out.println("Insira um cupom de desconto:");
		String cupom = scanner.nextLine();
		
		double desconto = 0;
		if (valorTotal > 500 || cupom.equalsIgnoreCase("desconto10")) {
			desconto = 0.1 * valorTotal;
		}
		System.out.println("Subtotal: " + valorTotal);
		System.out.println("Desconto: " + desconto);
		System.out.println("Valor final: " + (valorTotal - desconto));
	}

}
