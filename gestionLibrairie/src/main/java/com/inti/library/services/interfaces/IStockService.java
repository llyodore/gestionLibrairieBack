package com.inti.library.services.interfaces;

import java.util.List;

import com.inti.library.entities.Stock;

public interface IStockService {
	List<Stock> findAll();

	Stock findOne(Long idStock);
	
	Stock save(Stock stock);
	
	void delete(Long idStock);
	
	void update(Stock stock);
}
