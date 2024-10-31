package aula02.br.com.fiap.banco;

import java.util.Date;

import aula02.br.com.fiap.banco.model.Cdb;
import aula02.br.com.fiap.banco.model.Cliente;
import aula02.br.com.fiap.banco.model.Conta;
import aula02.br.com.fiap.banco.model.ContaCorrente;
import aula02.br.com.fiap.banco.model.ContaPoupanca;
import aula02.br.com.fiap.banco.model.Produto;

public class Executavel {
	public static void main(String[] args) {
		Cliente cliente = new Cliente("Nome Cliente 1", "cpf cliente", "endereco cliente", "21/07/2006");
		Cliente cliente2 = new Cliente("Nome Cliente 2", "cpf cliente", "endereco cliente", "20/05/2003");
		
		ContaCorrente conta1 = new ContaCorrente(1, cliente);
		ContaCorrente conta2 = new ContaCorrente(2, cliente);
		ContaPoupanca conta3 = new ContaPoupanca(3, cliente2);
		
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
		
		conta1.exibirInformacoesConta();
		
		conta1.investir(new Cdb(), 5);
	}
}
