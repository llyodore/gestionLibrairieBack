package com.inti.library.services.interfaces;

import java.util.List;

import com.inti.library.entities.Commande;

public interface ICommandeService {
	List<Commande> findAll();
	Commande findOne(Long id);
	Commande save(Commande commande);
	void delete(Long id);
}
