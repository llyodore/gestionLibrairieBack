package com.inti.library.services.interfaces;

import java.util.List;

import com.inti.library.entities.Livre;

public interface ILivreService {
	List<Livre> findAll();
	Livre findOne(Long id);
	Livre save(Livre livre);
	void delete(Long id);
}
