package com.example.demospringdatarest.resources;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "alumnes")
public class Alumne {

	@Id
	@Column( name = "idAlumne")
	private int idAlumne;
	
	@Column( name = "nom")
	private String nom;
	
	@Column( name = "edat")
	private int edat;
	
	@Column( name = "ciutat")
	private String ciutat;
	
	@OneToMany(mappedBy = "alumne" )
	private Set<Nota> nota = new HashSet<>();
	
	public int getIdAlumne() {
		return idAlumne;
	}

	public void setIdAlumne(int idAlumne) {
		this.idAlumne = idAlumne;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getEdat() {
		return edat;
	}

	public void setEdat(int edat) {
		this.edat = edat;
	}

	public String getCiutat() {
		return ciutat;
	}

	public void setCiutat(String ciutat) {
		this.ciutat = ciutat;
	}
	
	
}
