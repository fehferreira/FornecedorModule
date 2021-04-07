package br.com.personal.microservice.fornecedor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FornecedorModuleApplication {

	public static void main(String[] args) {
		System.setProperty("spring.cloud.bootstrap.enabled","true");
		SpringApplication.run(FornecedorModuleApplication.class, args);
	}

}