package aula03.br.com.fiap.fabricaVeiculos.model;

import java.util.Date;

public abstract class Veiculo {
	private String marca;
	private String modelo;
	private String cor;
	private Date anoFabricacao;
	private Date anoModelo;
	private String renavam;
	private String motor;
	private String tipoCambio;
	private int aroRodas;
	private double velocidade;
	private int LIMITE_VELOCIDADE;
	private String nomeCondutor;
	
	private boolean estaLigado = false;
	
	
	
	public Veiculo() {
	}

	public Veiculo(String marca, String modelo, String cor, Date anoFabricacao, Date anoModelo, String renavam,
			String motor, String tipoCambio, int aroRodas, int limiteVelocidade, String nomeCondutor) {
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.anoFabricacao = anoFabricacao;
		this.anoModelo = anoModelo;
		this.renavam = renavam;
		this.motor = motor;
		this.tipoCambio = tipoCambio;
		this.aroRodas = aroRodas;
		LIMITE_VELOCIDADE = limiteVelocidade;
		this.nomeCondutor = nomeCondutor;
	}

	public void ligar() {
		if (this.estaLigado) {
			System.out.println("Veiculo já está ligado");
		} else {
			estaLigado = true;
			System.out.println("Veiculo ligado");
		}
	}
	
	// Veiculo deve estar parado
	public void desligar() {
		if (this.velocidade > 0) {
			System.out.println("Veiculo em movimento, não é possível desligar");
			return;
		}
		
		if (this.estaLigado == false) {
			System.out.println("Veiculo já está desligado");
			return;
		}
		
		estaLigado = false;
		System.out.println("Veiculo desligado");		
	}
	
	// Veiculo deve estar ligado
	public void acelerar(double valor) {
		if (valor < 0) {
			System.out.println("Valor de aceleração negativo, não é possível acelerar");
			return;
		}
		if (this.estaLigado == false) {
			System.out.println("Veiculo desligado, não é possível acelerar");
			return;
		}
		if (this.velocidade + valor > this.LIMITE_VELOCIDADE) {
			System.out.println("Limite de velocidade ultrapassado, não é possível acelerar");
			System.out.println("Velocidade atual: " + this.velocidade);
			System.out.println("Limite de velocidade: " + this.LIMITE_VELOCIDADE);
			return;
		}
		
		this.velocidade += valor;
		System.out.println("Acelerando. Velocidade atual: " + this.velocidade);

	}
	
	public void frear(double valor) {
		if (valor < 0) {
			System.out.println("Valor de frenagem negativo, não é possível frear");
			return;
		}
		
		this.velocidade -= valor;
		if (this.velocidade < 0) {
			this.velocidade = 0;
		}
		
		System.out.println("Freando. Velocidade atual: " + this.velocidade);
	}
	
	public void exibirDados() {
		System.out.println(String.format(
				"Veiculo [marca=%s, modelo=%s, cor=%s, anoFabricacao=%s, anoModelo=%s, renavam=%s, motor=%s, tipoCambio=%s, aroRodas=%s, velocidade=%s, nomeCondutor=%s, estaLigado=%s]",
				marca, modelo, cor, anoFabricacao, anoModelo, renavam, motor, tipoCambio, aroRodas, velocidade,
				nomeCondutor, estaLigado));
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public void setAnoFabricacao(Date anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public void setAnoModelo(Date anoModelo) {
		this.anoModelo = anoModelo;
	}

	public void setRenavam(String renavam) {
		this.renavam = renavam;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public void setTipoCambio(String tipoCambio) {
		this.tipoCambio = tipoCambio;
	}

	public void setAroRodas(int aroRodas) {
		this.aroRodas = aroRodas;
	}

	public void setLimiteVelocidade(int limiteVelocidade) {
		LIMITE_VELOCIDADE = limiteVelocidade;
	}

	public void setNomeCondutor(String nomeCondutor) {
		this.nomeCondutor = nomeCondutor;
	}

}
