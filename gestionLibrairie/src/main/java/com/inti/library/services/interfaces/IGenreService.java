package com.inti.library.services.interfaces;

import java.util.List;

import com.inti.library.entities.Genre;

public interface IGenreService {
	List<Genre> findAll();
	Genre findOne(Long id);
	Genre save(Genre genre);
	void delete(Long id);
}
