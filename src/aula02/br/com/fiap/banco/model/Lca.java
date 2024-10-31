package aula02.br.com.fiap.banco.model;

public class Lca implements Produto {
	@Override
	public double retornarValorInvestimento(double valor) {
		return valor * (1.007);
	}
}
