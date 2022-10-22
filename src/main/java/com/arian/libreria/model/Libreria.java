package com.arian.libreria.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="libro")
public class Libreria {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	@Column(name="titolo")
	private String titolo;
	@Column(name="genere")
	private String genere;
	@Column(name="annopubblicazione")
	private int annoPubblicazione;
	@Column(name="immagini")
	private String immagini;
	@Column(name="isbn")
	private String isbn;
	@Column(name="prezzo")
	private double prezzo;
	public Libreria() {
	}
	public Libreria(String titolo, String genere, int annoPubblicazione, String immagini, String isbn, double prezzo) {
		this.titolo = titolo;
		this.genere = genere;
		this.annoPubblicazione = annoPubblicazione;
		this.immagini = immagini;
		this.isbn = isbn;
		this.prezzo = prezzo;
	}
	public Libreria(Integer id, String titolo, String genere, int annoPubblicazione, String immagini, String isbn,
			double prezzo) {
		this.id = id;
		this.titolo = titolo;
		this.genere = genere;
		this.annoPubblicazione = annoPubblicazione;
		this.immagini = immagini;
		this.isbn = isbn;
		this.prezzo = prezzo;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getGenere() {
		return genere;
	}
	public void setGenere(String genere) {
		this.genere = genere;
	}
	public int getAnnoPubblicazione() {
		return annoPubblicazione;
	}
	public void setAnnoPubblicazione(int annoPubblicazione) {
		this.annoPubblicazione = annoPubblicazione;
	}
	public String getImmagini() {
		return immagini;
	}
	public void setImmagini(String immagini) {
		this.immagini = immagini;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	@Override
	public String toString() {
		return "Libreria [id=" + id + ", titolo=" + titolo + ", genere=" + genere + ", annoPubblicazione="
				+ annoPubblicazione + ", immagini=" + immagini + ", isbn=" + isbn + ", prezzo=" + prezzo + "]";
	}
}
