package org.proxybanque.model;

public class Compte {

	int numero;
	String dateOuverture;
	double solde;

	// constructeur

	public Compte(int numero, String dateOuverture, double solde) {
		super();
		this.numero = numero;
		this.dateOuverture = dateOuverture;
		this.solde = solde;
	}

	// Getter and setters

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getDateOuverture() {
		return dateOuverture;
	}

	public void setDateOuverture(String dateOuverture) {
		this.dateOuverture = dateOuverture;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

}
