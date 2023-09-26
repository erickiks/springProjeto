package com.example.erick.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "Cliente")
public class Cliente {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idcCliente;
	
	@Column(name= "nCliente")
	private String nCliente;
	
	@Column(name= "telefone")
	private String fone;
	
	public Long getId() {
		return idcCliente;
	}
	public void setId(Long id) {
		this.idcCliente = id;
	}
	
	public String getnCliente() {
		return nCliente;
	}
	
	public void setnCliente(String nCliente) {
		this.nCliente = nCliente;
	}
	
	public String getFone() {
		return fone;
	}
	
	public void setFone(String fone) {
		this.fone = fone;
	}
}

