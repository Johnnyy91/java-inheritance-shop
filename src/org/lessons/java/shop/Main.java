package org.lessons.java.shop;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
				
		
		Prodotto p  = new Prodotto("Tablet","Top gamma",300, 22);
		
		Prodotto s = new Smartphone ("Iphone","Top gamma",1000,35,128,2345896);
		
		
		System.out.println("Codice prodotto : " + p.getCodice());
	
		System.out.println("Prezzo base del prodotto : " + p.getPrezzo());
		
		System.out.println("Prezzo + I.V.A. del prodotto : " + p.getPrezzoConIva());

	    System.out.println("Nome completo del prodotto : " + p.getNomeCompleto());
	    
	    
	    
	    System.out.println("Codice prodotto : " + s.getCodice());
		
		System.out.println("Prezzo base del prodotto : " + s.getPrezzo());
		
		System.out.println("Prezzo + I.V.A. del prodotto : " + s.getPrezzoConIva());

	    System.out.println("Nome completo del prodotto : " + s.getNomeCompleto());
	    
	    
	    
	}
}

