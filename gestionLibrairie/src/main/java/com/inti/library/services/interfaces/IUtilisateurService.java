package com.inti.library.services.interfaces;

import java.util.List;

import com.inti.library.entities.Utilisateur;

public interface IUtilisateurService {
	List<Utilisateur>findAll();
	
	Utilisateur findOne(Long id);
	
	Utilisateur save (Utilisateur utilisateur);
	
	void delete (Long id);
	
	void update(Long id);

}
