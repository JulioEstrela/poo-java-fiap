package aula02.br.com.fiap.banco.model;

public class Conta {
	private String nomeCliente;
	private String cpfCliente;
	private String numeroConta;
	private double saldo;
	
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
	
	
}
