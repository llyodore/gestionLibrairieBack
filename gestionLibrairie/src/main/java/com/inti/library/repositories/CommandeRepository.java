package com.inti.library.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.library.entities.Commande;

@Repository
public interface CommandeRepository extends JpaRepository<Commande, Long>{
	Commande findByIdCde(String id);
}
