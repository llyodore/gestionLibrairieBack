package com.inti.library.entities;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="COMMANDES", schema="gestion_librairie_db")
public class Commande implements Serializable{
	private Date dateCommande;
	private int qteCommande;
	
	@ManyToOne
	@JoinColumn(name="id_livre")
	private Livre livre;

	public Commande() {
	}

	public Commande(Date dateCommande, int qte_commande, Livre livre) {
		this.dateCommande = dateCommande;
		this.qteCommande = qte_commande;
		this.livre = livre;
	}

	public Date getDateCommande() {
		return dateCommande;
	}

	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}

	public int getQteCommande() {
		return qteCommande;
	}

	public void setQteCommande(int qte_commande) {
		this.qteCommande = qte_commande;
	}

	public Livre getLivre() {
		return livre;
	}

	public void setLivre(Livre livre) {
		this.livre = livre;
	}

	@Override
	public String toString() {
		return "Commande [dateCommande=" + dateCommande + ", qteCommande=" + qteCommande + ", livre=" + livre + "]";
	}

	
	
	
}
