package com.inti.library.entities;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ROLES", schema="gestion_librairie_db")
public class Role implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idRole;
	private String Libelle;
	
	@ManyToOne
	@JoinColumn(name="utilisateur")
	private Utilisateur utilisateur;

	public Role() {
		super();
	}

	public Role(String libelle, Utilisateur utilisateur) {
		super();
		Libelle = libelle;
		this.utilisateur = utilisateur;
	}

	public Long getIdRole() {
		return idRole;
	}

	public void setIdRole(Long idRole) {
		this.idRole = idRole;
	}

	public String getLibelle() {
		return Libelle;
	}

	public void setLibelle(String libelle) {
		Libelle = libelle;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	@Override
	public String toString() {
		return "Roles [idRole=" + idRole + ", Libelle=" + Libelle + ", utilisateur=" + utilisateur + "]";
	}
	
	

}
