package br.com.api.enderecos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.api.enderecos.entities.EnderecoEntity;

public interface EnderecoRepository extends JpaRepository<EnderecoEntity, Long>{

}
