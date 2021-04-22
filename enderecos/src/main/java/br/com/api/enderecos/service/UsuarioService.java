 package br.com.api.enderecos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.api.enderecos.mapper.UsuarioMapper;
import br.com.api.enderecos.model.UsuarioDto;
import br.com.api.enderecos.repositories.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	public void cadastroUsuario(UsuarioDto usuario) {
		usuarioRepository.save(UsuarioMapper.converteParaUsuarioEntity(usuario));		
	}
	public UsuarioDto getUsuario(Long id) {
		return UsuarioMapper.converteParaUsuarioDto(usuarioRepository.getOne(id));
	}
		
}
