package com.example.demospringdatarest.resources;

import javax.persistence.*;


@Entity
@Table(name = "notes")
public class Nota {
	
	@Id
	@Column(name = "idNota")
	private int idNota;
	
	@ManyToOne
	@JoinColumn(name = "idAlumne")
	private Alumne alumne;
	
	@ManyToOne
	@JoinColumn(name = "idAssignatura")
	private Assignatura assignatura;

	@Column(name = "qualificacio")
	private int qualificacio;

	public Nota() {
		
	}
	
	public Nota(Alumne alumne, Assignatura assignatura, int qualificacio) {
		super();
		this.alumne = alumne;
		this.assignatura = assignatura;
		this.qualificacio = qualificacio;
	}

	public long getIdNota() {
		return idNota;
	}

	public void setIdNota(Integer idNota) {
		this.idNota = idNota;
	}

	public Alumne getAlumne() {
		return alumne;
	}

	public void setAlumne(Alumne alumne) {
		this.alumne = alumne;
	}

	public Assignatura getAssignatura() {
		return assignatura;
	}

	public void setAssignatura(Assignatura assignatura) {
		this.assignatura = assignatura;
	}

	public int getQualificacio() {
		return qualificacio;
	}

	public void setQualificacio(int qualificacio) {
		this.qualificacio = qualificacio;
	}
}
