package org.proxybanque.services;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.proxybanque.model.Client;

/**
 * Servlet implementation class InsertClient
 */
@WebServlet("/InsertClient")
public class InsertClient extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertClient() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Etape 1 : recupération des paramèrtes de la requête
		
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		
		// Etape 2 : Soumission des paramètres à la couche service et
		// récupération des paramètres de la requête
		
		Client client = new Client(nom, prenom, login, password, adresse, codePostal, telephone, email, ville, id)
		
		// Etape 3 : Réponse à l'utilisateur
		
	}

}
