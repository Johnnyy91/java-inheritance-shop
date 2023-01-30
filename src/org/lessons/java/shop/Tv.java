package org.lessons.java.shop;

public class Tv extends Prodotto{
	double dimensione;
	boolean proprietà;
	public Tv(String nome, String descrizione, float prezzo, int iva, double dimensione, boolean proprietà) {
		super(nome, descrizione, prezzo, iva);
		
		this.dimensione = dimensione;
		this.proprietà = proprietà;
	}
	
	public double getDimensione(){
		return dimensione;
		
	}
	
	public boolean getProprietà() {
		return proprietà;
	}

}
