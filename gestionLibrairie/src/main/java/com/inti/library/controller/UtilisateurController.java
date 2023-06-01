package com.inti.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.library.entities.Utilisateur;
import com.inti.library.services.interfaces.IUtilisateurService;

@RestController
public class UtilisateurController {
	@Autowired
	IUtilisateurService utilisateurService;
	
	@RequestMapping(value = "utilisateurs", method=RequestMethod.GET)
	public List<Utilisateur> findAll(){
		return utilisateurService.findAll();
	}
	
	@RequestMapping (value="utilisateurs",method=RequestMethod.GET)
	public Utilisateur findOne(Long id) {
		return utilisateurService.findOne(id);
	}
	
	@RequestMapping(value = "utilisateurs", method = RequestMethod.POST)
	public Utilisateur saveUtilisateur(@RequestBody Utilisateur utilisateur) {
		return utilisateurService.save(utilisateur);
	}

	@RequestMapping(value = "utilisateurs", method = RequestMethod.DELETE)
	public void deleteUtilisateur(Long id) {
		utilisateurService.delete(id);
	}

	@RequestMapping(value = "utilisateurs", method = RequestMethod.PUT)
	public Utilisateur updateUtilisateur( Long id, Utilisateur utilisateur) {
		Utilisateur currentUtilisateur = utilisateurService.findOne(id);
		currentUtilisateur.setNom(utilisateur.getNom());
		currentUtilisateur.setPrenom(utilisateur.getPrenom());
		currentUtilisateur.setRoles(utilisateur.getRoles());
		currentUtilisateur.setAdresse(utilisateur.getAdresse());
		currentUtilisateur.setDate(utilisateur.getDate());
		currentUtilisateur.setAge(utilisateur.getAge());
		return utilisateurService.save(currentUtilisateur);

	}
}
