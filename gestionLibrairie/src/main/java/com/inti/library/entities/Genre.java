package com.inti.library.entities;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="GENRES", schema="gestion_librairie_db")
public class Genre extends Livre implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String type;

	
	public Genre() {
		super();
	}

	public Genre(Long iban, String nomLivre, float prix, String type) {
	    super(iban, nomLivre, prix);
	    this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Genre [type=" + type + "]";
	}
	
	
}
