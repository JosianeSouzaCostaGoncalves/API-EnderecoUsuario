package br.com.api.enderecos.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import br.com.api.enderecos.entities.UsuarioEntity;
import br.com.api.enderecos.model.UsuarioDto;

@Mapper
public interface UsuarioMapper {
	
	UsuarioMapper INSTANCE = Mappers.getMapper(UsuarioMapper.class);
	
	@Mapping(source = "dtNacimento", target = "dtNacimento", dateFormat = "dd/MMM/yyyy")
	UsuarioEntity converteParaUsuarioEntity(UsuarioDto usuarioDto);
	UsuarioDto converteParaUsuarioDto(UsuarioEntity usuarioEntity);
}
