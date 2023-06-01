package com.inti.library.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.inti.library.entities.Commande;
import com.inti.library.services.interfaces.ICommandeService;

@RestController
@CrossOrigin
public class CommandeController {
	@Autowired
	ICommandeService commandeService;
	
	@GetMapping("/commandes")
	public List<Commande> findAll() {
		return commandeService.findAll();
	}
	@GetMapping("/commandes/{idCommande}")
	public Commande findOne(@PathVariable("idCommande") Long id) {
		return commandeService.findOne(id);
	}
	@PostMapping("/commandes")
	public Commande saveCommande(@RequestBody Commande commande) {
		return commandeService.save(commande);
	}
	@DeleteMapping("/commandes/{idCommande}")
	public void deleteCommande(@PathVariable("idCommande") Long id) {
		commandeService.delete(id);
	}
	@PutMapping("/commandes/{idCommande}")
	public Commande updateCommande(@PathVariable("idCommande") Long id, @RequestBody Commande commande) {
		Commande currentCommande = commandeService.findOne(id);
		currentCommande.setDateCommande(commande.getDateCommande());
		currentCommande.setQteCommande(commande.getQteCommande());
		return commandeService.save(currentCommande);
	}
}
