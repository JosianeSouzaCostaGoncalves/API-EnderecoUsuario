package br.com.api.enderecos.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.enderecos.model.UsuarioDto;
import br.com.api.enderecos.service.UsuarioService;

@RestController
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;

	@PostMapping("/usuario")
	@ResponseStatus(HttpStatus.CREATED)
	public HttpStatus cadastroUsuario(@RequestBody @Valid UsuarioDto usuario) {

		usuarioService.cadastroUsuario(usuario);
		return HttpStatus.CREATED;
	}

	@GetMapping("/usuario")
	public UsuarioDto getUsuario(@RequestParam Long id) {
		return usuarioService.getUsuario(id);

	}

}
