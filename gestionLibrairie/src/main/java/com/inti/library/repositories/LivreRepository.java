package com.inti.library.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.library.entities.Livre;

@Repository
public interface LivreRepository extends JpaRepository<Livre, Long>{
	Livre findById(String idLivre);
}
