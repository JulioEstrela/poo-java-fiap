package aula02.br.com.fiap.banco.model;

public class Lci implements Produto {

	@Override
	public double retornarValorInvestimento(double valor) {
		return valor * (1.008);
	}
	
}
