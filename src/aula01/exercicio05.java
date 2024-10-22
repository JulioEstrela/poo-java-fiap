package aula01;

import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Insira o usuario:");
		String usuario = scanner.nextLine();
		System.out.println("Insira a senha:");
		String senha = scanner.nextLine();
		
		if (usuario.equalsIgnoreCase("administrador") && senha.equals("123")) {
			System.out.println("Usuario logado");
		}
	}

}
