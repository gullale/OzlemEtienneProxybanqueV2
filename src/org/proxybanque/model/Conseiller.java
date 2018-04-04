package org.proxybanque.model;

public class Conseiller extends Personne {

	
	
	
	
	// Constructeur

	public Conseiller(String nom, String prenom, String login, String password, String adresse, String codePostal,
			String telephone, String email, String ville, int id) {
		super(nom, prenom, login, password, adresse, codePostal, telephone, email, ville, id);
		// TODO Auto-generated constructor stub
		
		}

	public Conseiller() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Conseiller(String login, String password) {
		super(login, password);
		// TODO Auto-generated constructor stub
	}
	
	
		
}

