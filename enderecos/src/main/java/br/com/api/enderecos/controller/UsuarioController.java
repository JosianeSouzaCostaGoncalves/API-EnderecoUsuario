package br.com.api.enderecos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.enderecos.model.UsuarioDto;
import br.com.api.enderecos.service.UsuarioService;


@RestController
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@PostMapping("/usuario")
	public HttpStatus cadastroUsuario (@RequestBody UsuarioDto usuario){
		usuarioService.cadastroUsuario(usuario);
		return HttpStatus.CREATED;
	}

}
