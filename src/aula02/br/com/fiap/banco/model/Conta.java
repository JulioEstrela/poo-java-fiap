package aula02.br.com.fiap.banco.model;

import java.util.Date;

public abstract class Conta {
	private long numeroConta;
	private Cliente cliente;
	private double saldo;
	private Date dataAbertura = new Date();
	
	
	public Conta(long numeroConta, Cliente cliente) {
		this.numeroConta = numeroConta;
		this.cliente = cliente;
	}

	public boolean sacar(double valorSaque) {
		if (valorSaque <= 0) {
			System.out.println("Valor de saque deve ser positivo!");
			return false;
		}
		
		if (this.saldo >= valorSaque) {
			this.saldo -= valorSaque;
			System.out.println("Saque efetuado com sucesso!");
			return true;
		}
		
		System.out.println("Saldo indisponível para saque!");
		return false;
	}
	
	public boolean depositar(double valorDeposito) {
		if (valorDeposito <= 0) {
			System.out.println("Valor de depósito deve ser positivo!");
			return false;
		}
		
		this.saldo += valorDeposito;
		System.out.println("Depósito efetuado com sucesso!");
		return true;
	}
	
	public boolean transferir(double valorTransferencia, Conta contaTransferencia) {
		if (valorTransferencia <= 0) {
			System.out.println("Valor de transferência deve ser positivo!");
			return false;
		}
		
		if (this.sacar(valorTransferencia)) {
			contaTransferencia.depositar(valorTransferencia);
			System.out.println("Transferência efetuada com sucesso!");
			return true;
		}
		
		return false;
	}
	
	public double consultarSaldo() {
		return this.saldo;
	}
	
	public void exibirInformacoesConta() {
		System.out.println("Data de abertura da conta: " + this.dataAbertura);
		System.out.println("Numero da conta: " + this.numeroConta);
		System.out.println("Saldo: " + this.saldo);
		System.out.println("---CLIENTE---");
		System.out.println("Nome do cliente: " + this.cliente.getNomeCliente());
		System.out.println("Data de nascimento do cliente: " + this.cliente.getDataNascimento());
	}
	
	
}
