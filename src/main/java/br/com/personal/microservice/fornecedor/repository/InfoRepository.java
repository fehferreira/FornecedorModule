package br.com.personal.microservice.fornecedor.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.personal.microservice.fornecedor.model.InfoFornecedor;

public interface InfoRepository extends CrudRepository<InfoFornecedor, Long>{

	InfoFornecedor findByEstado(String estado);
	
}
