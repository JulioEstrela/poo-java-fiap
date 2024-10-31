package aula02.br.com.fiap.banco.model;

public class ContaCorrente extends Conta {
	
	private double saldoInvestimento;

	public ContaCorrente(long numeroConta, Cliente cliente) {
		super(numeroConta, cliente);
	}
	
	public void investir(Produto produto, double valor) {
		if (this.sacar(valor)) {
			this.saldoInvestimento += produto.retornarValorInvestimento(valor);
			System.out.println("Investimento realizado com sucesso!");
		}
	}
	
}
