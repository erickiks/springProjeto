package com.example.erick.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.erick.entities.Cliente;
import com.example.erick.servicies.service;

@RestController
@RequestMapping ("/Cliente")
public class ClienteController {
	private final service service;
	
	
	@Autowired
	public ClienteController (service service) {
		this.service = service;
	}
	@PostMapping
	public Cliente createCliente(@RequestBody Cliente cliente) {
		return service.saveCliente(cliente);
	}
	@GetMapping ("/(Id)")
	public Cliente getCliente (@PathVariable Long idcCliente) {
		return service.getClienteById(idcCliente);
	}
	@GetMapping
	public List<Cliente> getAllCliente() {
		return service.getAllCliente();
	}
	@DeleteMapping ("/(Id)")
	public void deleteCliente (@PathVariable Long idcCliente) {
		service.deleteCliente(idcCliente);
	}
	
}
