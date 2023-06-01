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

import com.inti.library.entities.Livre;
import com.inti.library.services.interfaces.ILivreService;

@RestController
@CrossOrigin
public class LivreController {
	@Autowired
	ILivreService livreService;
	
	@GetMapping("/livres")
	public List<Livre> findAll() {
		return livreService.findAll();
	}
	@GetMapping("/livres/{idLivre}")
	public Livre findOne(@PathVariable("idLivre") Long id) {
		return livreService.findOne(id);
	}
	@PostMapping("/livres")
	public Livre saveLivre(@RequestBody Livre livre) {
		return livreService.save(livre);
	}
	@DeleteMapping("/livres/{idLivre}")
	public void deleteLivre(@PathVariable("idLivre") Long id) {
		livreService.delete(id);
	}
	@PutMapping("/livres/{idLivre}")
	public Livre updateLivre(@PathVariable("idLivre") Long id, @RequestBody Livre livre) {
		Livre currentLivre = livreService.findOne(id);
		currentLivre.setIban(livre.getIban());
		currentLivre.setNomLivre(livre.getNomLivre());
		currentLivre.setPrix(livre.getPrix());
		return livreService.save(currentLivre);
	}
}
