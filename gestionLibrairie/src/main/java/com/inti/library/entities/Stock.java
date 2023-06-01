package com.inti.library.entities;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="STOCK", schema="gestion_librairie_db")
public class Stock implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idStock;
	private int quantiteStock;
	
	@OneToOne
	@JoinColumn(name="livre_id")
	private Livre livre;

	public Stock() {
		super();
	}

	public Stock(int quantiteStock, Livre livre) {
		super();
		this.quantiteStock = quantiteStock;
		this.livre = livre;
	}

	public Long getIdStock() {
		return idStock;
	}

	public void setIdStock(Long idStock) {
		this.idStock = idStock;
	}

	public int getQuantiteStock() {
		return quantiteStock;
	}

	public void setQuantiteStock(int quantiteStock) {
		this.quantiteStock = quantiteStock;
	}

	public Livre getLivre() {
		return livre;
	}

	public void setLivre(Livre livre) {
		this.livre = livre;
	}

	@Override
	public String toString() {
		return "Stock [idStock=" + idStock + ", quantiteStock=" + quantiteStock + ", livre=" + livre + "]";
	}
	
	

}
