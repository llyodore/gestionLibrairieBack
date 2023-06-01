package com.inti.library.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.library.entities.Commande;
import com.inti.library.repositories.CommandeRepository;
import com.inti.library.services.interfaces.ICommandeService;

@Service
public class CommandeService implements ICommandeService{
	
	@Autowired
	CommandeRepository commandeRepository;
	
	@Override
	public List<Commande> findAll() {
		return commandeRepository.findAll();
	}

	@Override
	public Commande findOne(Long id) {
		return commandeRepository.findById(id).get();
	}

	@Override
	public Commande save(Commande commande) {
		return commandeRepository.save(commande);
	}

	@Override
	public void delete(Long id) {
		commandeRepository.deleteById(id);
		
	}

}
