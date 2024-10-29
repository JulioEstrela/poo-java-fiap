package aula03.br.com.fiap.fabricaVeiculos.model;

import java.util.Date;

public class Caminhao extends Veiculo {
	private int eixos;
	private double quantidadeCargaSuportada;
	private double quantidadeCargaAbastecida;
	private String tipoCargaAbastecida;
	
	
	
	public Caminhao() {
		super();
	}

	public Caminhao(String marca, String modelo, String cor, Date anoFabricacao, Date anoModelo, String renavam,
			String motor, String tipoCambio, int aroRodas, int limiteVelocidade, String nomeCondutor, int eixos,
			double quantidadeCargaSuportada, double quantidadeCargaAbastecida, String tipoCargaAbastecida) {
		super(marca, modelo, cor, anoFabricacao, anoModelo, renavam, motor, tipoCambio, aroRodas, limiteVelocidade,
				nomeCondutor);
		this.eixos = eixos;
		this.quantidadeCargaSuportada = quantidadeCargaSuportada;
		this.quantidadeCargaAbastecida = quantidadeCargaAbastecida;
		this.tipoCargaAbastecida = tipoCargaAbastecida;
	}

	public void carregar(double valor) {
		quantidadeCargaAbastecida += valor;
		if (quantidadeCargaAbastecida > quantidadeCargaSuportada) {
			quantidadeCargaAbastecida = quantidadeCargaSuportada;
		}
	}
	
	public void descarregar(double valor) {
		quantidadeCargaAbastecida -= valor;
		if (quantidadeCargaAbastecida < 0) {
			quantidadeCargaAbastecida = 0;
		}
	}

	public void setEixos(int eixos) {
		this.eixos = eixos;
	}

	public void setQuantidadeCargaSuportada(double quantidadeCargaSuportada) {
		this.quantidadeCargaSuportada = quantidadeCargaSuportada;
	}

	public void setTipoCargaAbastecida(String tipoCargaAbastecida) {
		this.tipoCargaAbastecida = tipoCargaAbastecida;
	}
	
	
}
