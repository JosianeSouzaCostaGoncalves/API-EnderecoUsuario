package br.com.api.enderecos.mapper;

import br.com.api.enderecos.entities.EnderecoEntity;
import br.com.api.enderecos.model.EnderecoDto;

public interface EnderecoMapper {

	EnderecoEntity converteParaEnderecoDto (EnderecoDto enderecoDto);
	EnderecoDto converteParaEnderecoEntity (EnderecoEntity enderecoEntity);
}
