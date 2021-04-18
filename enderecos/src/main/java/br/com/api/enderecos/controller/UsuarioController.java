package br.com.api.enderecos.controller;

import java.net.http.HttpResponse;

import org.springframework.beans.factory.annotation.Autowired;
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
	public HttpResponse<UsuarioDto> cadastroUsuario (@RequestBody UsuarioDto usuario){
		return null;
	}

}
