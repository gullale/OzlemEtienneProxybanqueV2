package org.proxybanque.presentation;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.proxybanque.model.Client;

/**
 * Servlet implementation class UpdateClient
 */
@WebServlet("/UpdateClient")
public class UpdateClient extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateClient() {
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
		// Etape 1 : recupération des paramètres de la requête
		
				String nom = request.getParameter("nom");
				String prenom = request.getParameter("prenom");
				String login = request.getParameter("login");
				String password = request.getParameter("password");
				String adresse = request.getParameter("adresse");
				String codePostal = request.getParameter("codePostal");
				String ville = request.getParameter("ville");
				String telephone = request.getParameter("telephone");
				String email = request.getParameter("email");
				int idConseiller = Integer.valueOf(request.getParameter("idConseiller"));		
				
				// Etape 2 : Soumission des paramètres à la couche service et
				// récupération des paramètres de la requête
				
				Client client = new Client(nom, prenom, login, password, adresse, codePostal, ville, telephone, email, idConseiller);
				request.setAttribute("nom", nom);
				request.setAttribute("prenom", prenom);
				request.setAttribute("login", login);
				request.setAttribute("password", password);
				request.setAttribute("adresse", adresse);
				request.setAttribute("codePostal", codePostal);
				request.setAttribute("ville", ville);
				request.setAttribute("telephone", telephone);
				request.setAttribute("email", email);
				request.setAttribute("idConseiller", idConseiller);
				
				
				// Etape 3 : Réponse à l'utilisateur
				response.sendRedirect("ListeDesClientsParConseiller.jsp");
			}

}
