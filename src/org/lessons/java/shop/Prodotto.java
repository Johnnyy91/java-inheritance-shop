package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

	
	private String nome;
	private String descrizione;
	private float prezzo;
	private float iva;
	private int codice;
	
	
	
	public Prodotto(String nome, String descrizione, float prezzo, int iva) {
		super();
		

		Random r = new Random();
		
		int codiceRandom = r.nextInt(100000000);
		
		this.nome = nome;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
		this.iva = iva;
		this.codice=codiceRandom;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getDescrizione() {
		return descrizione;
	}
	
	public float getIva() {
		return iva;
	}
	
	public int getCodice() {
		return codice;
	}
	
	public float getPrezzo() {
		
		return prezzo;
	}
	
	public float getPrezzoConIva() {
		return (prezzo * iva) /100;
	}

	public String getNomeCompleto() {
		return nome + codice;
	}
	
	
}
