package com.arian.libreria.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="libro")
public class Libreria {
	
	private Integer id;
	private String titolo;
	private String genere;
	private int annoPubblicazione;
	private String immagini;
	private String isbn;
	private double prezzo;
}
