package com.inti.library.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.library.entities.Genre;
import com.inti.library.repositories.GenreRepository;
import com.inti.library.services.interfaces.IGenreService;

@Service
public class GenreService implements IGenreService{
	@Autowired 
	GenreRepository genreRepository;
	
	@Override
	public List<Genre> findAll() {
		return genreRepository.findAll();
	}

	@Override
	public Genre findOne(Long id) {
		return genreRepository.findById(id).get();
	}

	@Override
	public Genre save(Genre genre) {
		return genreRepository.save(genre);
	}

	@Override
	public void delete(Long id) {
		genreRepository.deleteById(id);
		
	}

}
