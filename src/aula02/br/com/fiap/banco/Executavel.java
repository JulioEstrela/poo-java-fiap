package aula02.br.com.fiap.banco;

import aula02.br.com.fiap.banco.model.Conta;

public class Executavel {
	public static void main(String[] args) {
		Conta conta1 = new Conta();
		Conta conta2 = new Conta();
		Conta conta3 = new Conta();
		
		conta1.depositar(20.0);
		conta1.transferir(5, conta2);
		
		System.out.println(conta1.consultarSaldo());
		System.out.println(conta2.consultarSaldo());
		
		conta2.sacar(2.0);
		System.out.println(conta2.consultarSaldo());
		
		conta3.depositar(10.0);
		conta3.transferir(4.5, conta1);
		
		System.out.println(conta1.consultarSaldo());
		System.out.println(conta2.consultarSaldo());
		System.out.println(conta3.consultarSaldo());
	}
}
