package org.lessons.java.shop;

public class Cuffie extends Prodotto{
	String colore;
	boolean wireless;
	boolean cablate;
	
	public Cuffie(String nome, String descrizione, float prezzo, int iva, String colore , boolean wireless , boolean cablate) {
		super(nome, descrizione, prezzo, iva);
		this.colore = colore;
		this.wireless = wireless;
		this.cablate = cablate;
	}

	public String getColore() {
		return colore;
	}
	
	public boolean getWireless() {
		return wireless;
	}
	
	public boolean getCablate() {
		return cablate;
	}

}
