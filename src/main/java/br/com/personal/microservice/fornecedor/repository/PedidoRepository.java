package br.com.personal.microservice.fornecedor.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.personal.microservice.fornecedor.model.Pedido;

public interface PedidoRepository extends CrudRepository<Pedido, Long>{

}
