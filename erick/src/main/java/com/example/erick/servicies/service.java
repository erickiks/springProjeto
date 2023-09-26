package com.example.erick.servicies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.erick.entities.Cliente;
import com.example.erick.repositories.Repository;

@Service
public class service {
	private final Repository Repository;
	
	@Autowired
	public service (Repository Repository) {
		this.Repository = Repository;
	}
	public Cliente saveCliente(Cliente Cliente) {
		return Repository.save(Cliente);
	}
	public Cliente getClienteById(Long Id) {
		return Repository.findById(Id).orElse(null);
	}
	public List<Cliente> getAllCliente() {
		return Repository.findAll();
	}
	public void deleteCliente (Long Id) {
		Repository.deleteById(Id);
	}
}
