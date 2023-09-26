package com.example.erick.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.erick.entities.Cliente;

public interface Repository extends JpaRepository<Cliente, Long>{
}


