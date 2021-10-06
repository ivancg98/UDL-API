package com.example.demospringdatarest.resources;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "assignatures")
public class Assignatura {
	
	@Id
	@Column( name = "idAssignatura")
	private int idAssignatura;
	
	@Column( name = "nom")
	private String nom;
	
	@Column( name = "numAlumnes")
	private int numAlumnes;
	
	@OneToMany(mappedBy = "assignatura", cascade = CascadeType.ALL)
	private Set<Nota> nota = new HashSet<>();

	public Assignatura() {
		
	}
	public Assignatura(int idAssignatura, String nom, int numAlumnes) {
		super();
		this.idAssignatura = idAssignatura;
		this.nom = nom;
		this.numAlumnes = numAlumnes;
	}

	public int getIdassignatura() {
		return idAssignatura;
	}

	public void setIdassignatura(int idAssignatura) {
		this.idAssignatura = idAssignatura;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNumAlumnes() {
		return numAlumnes;
	}

	public void setNumAlumnes(int numAlumnes) {
		this.numAlumnes = numAlumnes;
	}


}
