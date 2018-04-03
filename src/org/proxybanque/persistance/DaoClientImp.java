package org.proxybanque.persistance;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.proxybanque.model.Client;
import org.proxybanque.model.Conseiller;

public class DaoClientImp extends Jdbc implements DaoClient {

	// M�thode Get Client
	@Override
	public String getClientInfos(int clientId) {

		Connection cnx = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String result = null;

		try {
			// Ouvrir la connexion
			cnx = openConnection();

			// Cr�ation de la requ�te
			String sql = "SELECT nom FROM conseiller where clientId=?";

			// Compilation du preparedStatement
			pstmt = cnx.prepareStatement(sql);

			// Completion de la requ�te
			pstmt.setInt(1, clientId);

			// Ex�cuter et r�cup�rer le r�sultat de la requ�te

			rs = pstmt.executeQuery();
			while (rs.next()) {
				result = rs.getString(1);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection(cnx, pstmt, rs);

			System.out.println("--> Disconnection... <--");
		}

		return result;
	}

	// M�thode Insert Client

	@Override
	public void insertClient(Client clientAInserer) {
		
		Connection cnx = null;
		PreparedStatement pstmt = null;
		ResultSet rs=null;
		

		try {
			// Ouvrir la connexion
			cnx = openConnection();

			// Cr�ation de la requ�te
			String sql = "insert into client(clientId, nom, prenom, login, password, adresse, codePostal, ville, telephone, email, conseillerId)"
			+ " values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

			// Compilation du preparedStatement
			pstmt = cnx.prepareStatement(sql);

			// Completion de la requ�te
			pstmt.setInt(1, clientAInserer.getId());
			pstmt.setString(2, clientAInserer.getNom());
			pstmt.setString(3, clientAInserer.getPrenom());
			pstmt.setString(4, clientAInserer.getLogin());
			pstmt.setString(5, clientAInserer.getPassword());
			pstmt.setString(6, clientAInserer.getAdresse());
			pstmt.setString(7, clientAInserer.getCodePostal());
			pstmt.setString(8, clientAInserer.getVille());
			pstmt.setString(9, clientAInserer.getTelephone());
			pstmt.setString(10, clientAInserer.getEmail());
			
			// TO DO : m�thode get conseiller dans services.
			pstmt.setInt(11, 1);

			// Ex�cuter et r�cup�rer le r�sultat de la requ�te

			int i = pstmt.executeUpdate();
			
			System.out.println( i + "client(s) ont �t� ajout� � la base de donn�es bddozlemetienneproxibanquemysql");
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection(cnx, pstmt, rs);

			System.out.println("--> Disconnection... <--");
		}



	}

	@Override
	public void updateClient(Client clientAUpdater) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteClient(int id) {
		// TODO Auto-generated method stub

	}

	// @Override
	// public String getClientInfos(int clientId) {
	// // TODO Auto-generated method stub
	// return null;
	// }
	//
	// @Override
	// public void insertClient(Client clientAInserer) {
	// // TODO Auto-generated method stub
	// Conseiller cons = clientAInserer.getConseiller();
	// try {
	// // Ouvrir la connexion
	// cnx = openConnection();
	//
	// // Cr�ation de la requ�te
	// String sql = "SELECT prenom FROM conseiller where conseillerId=?";
	//
	// // Compilation du preparedStatement
	// pstmt = cnx.prepareStatement(sql);
	//
	// // Completion de la requ�te
	// pstmt.setInt(1, clientAInserer.g);
	//
	// // Ex�cuter et r�cup�rer le r�sultat de la requ�te
	//
	// rs = pstmt.executeQuery();
	// while (rs.next()) {
	// result = rs.getString(1);
	// }
	// } catch (ClassNotFoundException | SQLException e) {
	// e.printStackTrace();
	// } finally {
	// closeConnection(cnx, pstmt, rs);
	//
	// System.out.println("--> Disconnection... <--");
	// }
	//
	// return result;
	// }
	//
	//
	// }
	//
	// @Override
	// public void updateClient(Client clientAUpdater) {
	// // TODO Auto-generated method stub
	//
	// }
	//
	// @Override
	// public void deleteClient(int id) {
	// // TODO Auto-generated method stub
	//
	// }

}
