package com.inti.library.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.annotations.GeneratorType;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="UTILISATEUR", schema="gestion_librairie_db")

public class Utilisateur {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String prenom;
	private String age;
	private Date date;
	
	@OneToMany(mappedBy = "utilisateur", cascade=CascadeType.ALL, orphanRemoval = true)
	private List<Roles> roles = new ArrayList<>();

	public Utilisateur() {
		super();
	}

	public Utilisateur(String nom, String prenom, String age, Date date, List<Roles> roles) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.date = date;
		this.roles = roles;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public List<Roles> getRoles() {
		return roles;
	}

	public void setRoles(List<Roles> roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		return "Utilisateur [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", date=" + date
				+ "]";
	}
	
	
	
	
	
}
