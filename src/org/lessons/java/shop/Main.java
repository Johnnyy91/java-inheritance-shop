package org.lessons.java.shop;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
				
		
		Prodotto p  = new Prodotto("Tablet","Top gamma",300, 22);
		
		
		
		System.out.println("Codice prodotto : " );
	

		System.out.println("Prezzo base del prodotto : " + p.getPrezzo());
		

		System.out.println("Prezzo + I.V.A. del prodotto : " + p.getPrezzoConIva());
		
		

	    System.out.println("Nome completo del prodotto : " + p.getNomeCompleto());
	}
}

