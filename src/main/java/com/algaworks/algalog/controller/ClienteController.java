package com.algaworks.algalog.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.algalog.model.Cliente;

@RestController
public class ClienteController {
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		
		var cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setName("Joao");
		cliente1.setEmail("joaodasneves@algaworks.com");
		cliente1.setTelefone("34 99999-1111");
		
		var cliente2 = new Cliente();
		cliente2.setId(1L);
		cliente2.setName("Maria");
		cliente2.setEmail("maria@algaworks.com");
		cliente2.setTelefone("34 99999-1111");
		
		return Arrays.asList(cliente1, cliente2);
	}

}
