package org.lessons.java.shop;

public class Smartphone extends Prodotto{
		private int memoria;
		private int iMeI;
		public Smartphone (String nome, String descrizione, float prezzo, int iva, int memoria , int iMeI) {
			super(nome, descrizione , prezzo, iva);
			this.memoria = memoria;
			this.iMeI = iMeI;
		}
		
		public int getMemoria() {
			return memoria;
		}
		
		public void setMemoria(int memoria) {
			this.memoria = memoria;
		}

		public void setiMeI(int iMeI) {
			this.iMeI = iMeI;
		}

		public int getiMeI() {
			return iMeI;
		}
	}


