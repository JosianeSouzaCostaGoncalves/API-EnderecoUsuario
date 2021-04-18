package br.com.api.enderecos.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import br.com.api.enderecos.entities.UsuarioEntity;
import br.com.api.enderecos.model.UsuarioDto;

public interface UsuarioMapper {
	
	UsuarioMapper INSTANCE = Mappers.getMapper(UsuarioMapper.class);
	
	UsuarioEntity converteParaUsuarioEntity(UsuarioDto usuarioDto);
	UsuarioDto converteParaUsuarioDto(UsuarioEntity usuarioEntity);
}
