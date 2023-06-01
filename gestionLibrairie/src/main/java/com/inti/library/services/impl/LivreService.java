package com.inti.library.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.library.entities.Livre;
import com.inti.library.repositories.LivreRepository;
import com.inti.library.services.interfaces.ILivreService;

@Service
public class LivreService implements ILivreService{

	@Autowired
	LivreRepository livreRepository;
	
	@Override
	public List<Livre> findAll() {
		return livreRepository.findAll();
	}

	@Override
	public Livre findOne(Long id) {
		return livreRepository.findById(id).get();
	}

	@Override
	public Livre save(Livre livre) {
		return livreRepository.save(livre);
	}

	@Override
	public void delete(Long id) {
		livreRepository.deleteById(id);
		
	}

}
