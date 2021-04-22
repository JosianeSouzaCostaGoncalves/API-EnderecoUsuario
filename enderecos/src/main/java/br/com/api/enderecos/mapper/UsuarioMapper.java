package br.com.api.enderecos.mapper;

import org.mapstruct.factory.Mappers;

import br.com.api.enderecos.entities.UsuarioEntity;
import br.com.api.enderecos.model.UsuarioDto;

public class UsuarioMapper {
	
	UsuarioMapper INSTANCE = Mappers.getMapper(UsuarioMapper.class);
	
	public static UsuarioEntity converteParaUsuarioEntity(UsuarioDto usuarioDto) {
		UsuarioEntity usuario = new UsuarioEntity();
		usuario.setCpf(usuarioDto.getCpf());
		usuario.setDtNascimento(usuarioDto.getDtNascimento());
		usuario.setEmail(usuarioDto.getEmail());
//		usuario.setEnderecos(usuarioDto.getEnderecos());
		usuario.setNome(usuarioDto.getNome());
		
		return usuario;
	}
	
	public static UsuarioDto converteParaUsuarioDto(UsuarioEntity usuarioEntity) {
		UsuarioDto usuario = new UsuarioDto();
		usuario.setCpf(usuarioEntity.getCpf());
		usuario.setDtNascimento(usuarioEntity.getDtNascimento());
		usuario.setEmail(usuarioEntity.getEmail());
//		usuario.setEnderecos(usuarioDto.getEnderecos());
		usuario.setNome(usuarioEntity.getNome());
		
		return usuario;
	}
}
