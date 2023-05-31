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
	private int qte_commande;
	
	@ManyToOne
	@JoinColumn(name="id_livre")
	private Livre livre;

	public Commande() {
	}

	public Commande(Date dateCommande, int qte_commande, Livre livre) {
		this.dateCommande = dateCommande;
		this.qte_commande = qte_commande;
		this.livre = livre;
	}

	public Date getDateCommande() {
		return dateCommande;
	}

	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}

	public int getQte_commande() {
		return qte_commande;
	}

	public void setQte_commande(int qte_commande) {
		this.qte_commande = qte_commande;
	}

	public Livre getLivre() {
		return livre;
	}

	public void setLivre(Livre livre) {
		this.livre = livre;
	}

	@Override
	public String toString() {
		return "Commande [dateCommande=" + dateCommande + ", qte_commande=" + qte_commande + ", livre=" + livre + "]";
	}
	
	
}
