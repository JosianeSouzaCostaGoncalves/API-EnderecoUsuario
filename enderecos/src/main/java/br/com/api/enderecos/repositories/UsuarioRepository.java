package br.com.api.enderecos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.api.enderecos.entities.UsuarioEntity;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long>{

	
}
