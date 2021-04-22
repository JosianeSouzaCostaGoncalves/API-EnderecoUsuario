package br.com.api.enderecos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.enderecos.model.EnderecoDto;
import br.com.api.enderecos.service.EnderecoService;

@RestController
public class EnderecoController {

	@Autowired
	private EnderecoService enderecoService;

	@PostMapping("/endereco")
	@ResponseStatus(HttpStatus.CREATED)
	public HttpStatus cadastroEndereco(@RequestBody EnderecoDto endereco) {
		enderecoService.cadastroEndereco(endereco);
		return HttpStatus.CREATED;
	}

}
