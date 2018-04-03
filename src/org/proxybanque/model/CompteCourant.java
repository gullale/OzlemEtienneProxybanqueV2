package org.proxybanque.model;

public class CompteCourant extends Compte {

	double decouvertAutorise;

	// Constructeur

	public CompteCourant(int numero, String dateOuverture, double solde) {
		super(numero, dateOuverture, solde);
		// TODO Auto-generated constructor stub
	}

	public double getDecouvertAutorise() {
		return decouvertAutorise;
	}

	public void setDecouvertAutorise(double decouvertAutorise) {
		this.decouvertAutorise = decouvertAutorise;
	}
	
	// Getter and Setter
		
}
