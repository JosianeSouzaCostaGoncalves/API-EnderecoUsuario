package br.com.api.enderecos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.api.enderecos.mapper.EnderecoMapper;
import br.com.api.enderecos.model.EnderecoDto;
import br.com.api.enderecos.repositories.EnderecoRepository;

@Service
public class EnderecoService {

	@Autowired
	private EnderecoRepository enderecoRepository;

	public void cadastroEndereco(EnderecoDto endereco) {
		enderecoRepository.save(EnderecoMapper.INSTANCE.converteParaEnderecoEntity(endereco));
	}
}
