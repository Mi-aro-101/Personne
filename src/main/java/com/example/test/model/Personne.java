/**
 * 
 */
package com.example.test.model;

import java.time.LocalDate;

import org.hibernate.annotations.GeneratorType;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * @author miaro
 *
 */
@Entity
@Table(name="personne")
public class Personne {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id_personne")
	Integer idPersonne;
	
	@Column(name="nom_personne")
	String nomPersonne;
	
	@Column(name="date_de_naissance")
	LocalDate dateDeNaissance;
	
	public Personne() {
		// TODO Auto-generated constructor stub
	}
	
	public Integer getIdPersonne() {
		return idPersonne;
	}
	
	public String getNomPersonne() {
		return nomPersonne;
	}
	
	public LocalDate getDateDeNaissance() {
		return dateDeNaissance;
	}
	
	public void setIdPersonne(Integer idPersonne) {
		this.idPersonne = idPersonne;
	}
	
	public void setNomPersonne(String nomPersonne) {
		this.nomPersonne = nomPersonne;
	}
	
	public void setDateDeNaissance(LocalDate dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}
	
}
