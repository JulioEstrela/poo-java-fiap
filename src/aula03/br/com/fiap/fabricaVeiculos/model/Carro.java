package aula03.br.com.fiap.fabricaVeiculos.model;

import java.util.Date;

public class Carro extends Veiculo {

	public Carro(String marca, String modelo, String cor, Date anoFabricacao, Date anoModelo, String renavam,
			String motor, String tipoCambio, int aroRodas, int limiteVelocidade, String nomeCondutor) {
		super(marca, modelo, cor, anoFabricacao, anoModelo, renavam, motor, tipoCambio, aroRodas, limiteVelocidade,
				nomeCondutor);
	}
	
	
	
}
