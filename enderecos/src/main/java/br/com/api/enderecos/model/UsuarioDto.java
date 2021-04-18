package br.com.api.enderecos.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.com.api.enderecos.entities.EnderecoEntity;

public class UsuarioDto {
	
	private String nome;
	private String email;
	private Long cpf;
	private LocalDate dtNascimento;
	private List<EnderecoDto> enderecos = new ArrayList<>();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getCpf() {
		return cpf;
	}
	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}
	public LocalDate getDtNascimento() {
		return dtNascimento;
	}
	public void setDtNascimento(LocalDate dtNascimento) {
		this.dtNascimento = dtNascimento;
	}
	public List<EnderecoDto> getEnderecos() {
		return enderecos;
	}
	public void setEnderecos(List<EnderecoDto> enderecos) {
		this.enderecos = enderecos;
	}
	
	
	

}
