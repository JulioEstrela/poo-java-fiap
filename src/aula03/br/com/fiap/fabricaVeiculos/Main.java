package aula03.br.com.fiap.fabricaVeiculos;

import java.util.Date;

import aula03.br.com.fiap.fabricaVeiculos.model.Caminhao;
import aula03.br.com.fiap.fabricaVeiculos.model.Carro;
import aula03.br.com.fiap.fabricaVeiculos.model.Veiculo;

public class Main {

	public static void main(String[] args) {
		Carro carro = new Carro("Marca", "modelo", "cor", new Date(2010, 1, 1), new Date(2012, 1, 1), "renavam", "motor", "tipoCambio", 30, 200, "nome condutor");
		
		Caminhao caminhao = new Caminhao();
		caminhao.setMarca("marca");
		caminhao.setModelo("modelo");
		caminhao.setCor("cor");
		caminhao.setAnoFabricacao(new Date(2010, 1, 1));
		caminhao.setAnoModelo(new Date(2012, 1, 1));
		caminhao.setRenavam("renavam");
		caminhao.setMotor("motor");
		caminhao.setTipoCambio("tipoCambio");
		caminhao.setAroRodas(50);
		caminhao.setLimiteVelocidade(200);
		caminhao.setNomeCondutor("nome condutor");
		caminhao.setQuantidadeCargaSuportada(1000);
		caminhao.setTipoCargaAbastecida("tipo carga");
		
		carro.ligar();
		carro.acelerar(10);
		carro.desligar();
		carro.frear(20);
		carro.desligar();
		
	}

}
