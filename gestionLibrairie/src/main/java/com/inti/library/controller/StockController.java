package com.inti.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.library.entities.Stock;
import com.inti.library.services.interfaces.IStockService;

@RestController
public class StockController {
	@Autowired
	IStockService stockService;
	
	@RequestMapping(value="stocks", method=RequestMethod.GET)
	public List<Stock>findAll(){
		return stockService.findAll();
	}
	
	@RequestMapping(value = "stocks", method = RequestMethod.GET)
	public Stock findOne(Long idStock) {
		return stockService.findOne(idStock);
	}
	
	@RequestMapping(value = "stocks", method = RequestMethod.POST)
	public Stock saveStock(@RequestBody Stock stock) {
		return stockService.save(stock);
	}
	
	@RequestMapping (value = "stocks", method = RequestMethod.DELETE)
	public void deleteStock(Long idStock){
		stockService.delete(idStock);
		
	}
	@RequestMapping(value = "roles", method = RequestMethod.PUT)
	public Stock updateStock(Long idStock, Stock stock) {
		Stock currentStock= stockService.findOne(idStock);
		currentStock.setIdStock(stock.getIdStock());
		//currentStock.setQuantiteStock(stock.getIdStock());
		return stockService.save(currentStock);
	}

}
