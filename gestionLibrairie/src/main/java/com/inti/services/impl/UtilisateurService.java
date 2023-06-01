package com.inti.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.library.entities.Utilisateur;
import com.inti.library.repositories.UtilisateurRepository;
import com.inti.library.services.interfaces.IUtilisateurService;


@Service
public class UtilisateurService implements IUtilisateurService{
	@Autowired
	UtilisateurRepository utilisateurRepository;
	
	
	@Override
	public List<Utilisateur> findAll() {

		return utilisateurRepository.findAll();
	}

	@Override
	public Utilisateur findOne(Long id) {

		return utilisateurRepository.findById(id).get();
	}

	@Override
	public Utilisateur save(Utilisateur utilisateur) {
		return utilisateurRepository.save(utilisateur);
	}

	@Override
	public void delete(Long id) {
		utilisateurRepository.deleteById(id);
		
	}

	@Override
	public void update(Long id) {
		// TODO Auto-generated method stub
		
	}

}
