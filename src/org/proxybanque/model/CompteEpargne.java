package org.proxybanque.model;

public class CompteEpargne extends Compte {

	double tauxDeRemuneration;

	// Constructeur

	public CompteEpargne(int numero, String dateOuverture, double solde) {
		super(numero, dateOuverture, solde);
		// TODO Auto-generated constructor stub
	}

	// Getter and Setter
	public double getTauxDeRemuneration() {
		return tauxDeRemuneration;
	}

	public void setTauxDeRemuneration(double tauxDeRemuneration) {
		this.tauxDeRemuneration = tauxDeRemuneration;
	}

}
