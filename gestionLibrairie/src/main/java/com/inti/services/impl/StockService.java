package com.inti.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.library.entities.Stock;
import com.inti.library.repositories.StockRepository;
import com.inti.library.services.interfaces.IStockService;

@Service
public class StockService implements IStockService{
	
	@Autowired
	StockRepository stockRepository;

	@Override
	public List<Stock> findAll() {
		// TODO Auto-generated method stub
		return stockRepository.findAll();
		
	}

	@Override
	public Stock findOne(Long idStock) {
		// TODO Auto-generated method stub
		return stockRepository.findById(idStock).get();
	}

	@Override
	public Stock save(Stock stock) {
		// TODO Auto-generated method stub
		return stockRepository.save(stock);
	}

	@Override
	public void delete(Long idStock) {
		stockRepository.deleteById(idStock);
		
	}

	@Override
	public void update(Stock stock) {
		
	}
	
	
	

}
