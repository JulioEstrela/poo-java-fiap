package aula02.br.com.fiap.banco.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {
	private String nomeCliente;
	private String cpfCliente;
	private String enderecoCliente;
	private Date dataNascimento;
	
	public Cliente(String nomeCliente, String cpfCliente, String enderecoCliente, String dataNascimento) {
		this.nomeCliente = nomeCliente;
		this.cpfCliente = cpfCliente;
		this.enderecoCliente = enderecoCliente;
		
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		
		
		
		try {
			this.dataNascimento = format.parse(dataNascimento);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getCpfCliente() {
		return cpfCliente;
	}
	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}
	public String getEnderecoCliente() {
		return enderecoCliente;
	}
	public void setEnderecoCliente(String enderecoCliente) {
		this.enderecoCliente = enderecoCliente;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	
}
