package br.com.api.enderecos.mapper;

import org.mapstruct.factory.Mappers;

import br.com.api.enderecos.entities.EnderecoEntity;
import br.com.api.enderecos.model.EnderecoDto;

public interface EnderecoMapper {
	
	EnderecoMapper INSTANCE = Mappers.getMapper(EnderecoMapper.class);

	EnderecoEntity converteParaEnderecoDto (EnderecoDto enderecoDto);
	EnderecoDto converteParaEnderecoEntity (EnderecoDto endereco);
}
