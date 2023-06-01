package com.inti.library.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.library.entities.Stock;

@Repository
public interface StockRepository extends JpaRepository<Stock, Long>{

}
