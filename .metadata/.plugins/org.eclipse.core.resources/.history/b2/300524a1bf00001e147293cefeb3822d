package com.inti.library.entities;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="LIVRES", schema="gestion_librairie_db")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Livre implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long iban;
	private String nomLivre;
	private float prix;
	@OneToMany(mappedBy="id_livre")
	private List<Commande> commandes=new ArrayList<>();
	
	@OneToOne(mappedBy="id_stock")
	private Stock stock;

	public Livre() {
		super();
	}

	public Livre(Long iban, String nomLivre, float prix) {
		this.iban = iban;
		this.nomLivre = nomLivre;
		this.prix = prix;
	}

	

	public Livre(Long iban, String nomLivre, float prix, List<Commande> commandes, Stock stock) {
		this.iban = iban;
		this.nomLivre = nomLivre;
		this.prix = prix;
		this.commandes = commandes;
		this.stock = stock;
	}

	public Long getIban() {
		return iban;
	}

	public void setIban(Long iban) {
		this.iban = iban;
	}

	public String getNomLivre() {
		return nomLivre;
	}

	public void setNomLivre(String nomLivre) {
		this.nomLivre = nomLivre;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	public Commande getCommande() {
		return commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}

	public Stock getStock() {
		return stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Livre [iban=" + iban + ", nomLivre=" + nomLivre + ", prix=" + prix + "]";
	}
	
	
	

}
