package org.proxybanque.persistance;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DaoConseillerImp extends Jdbc implements DaoConseiller {

	@Override
	public String getConseillerInfos(int conseillerId) {

		Connection cnx = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String result = null;

		try {
			// Ouvrir la connexion
			cnx = openConnection();

			// Création de la requête
			String sql = "SELECT prenom FROM conseiller where conseillerId=?";

			// Compilation du preparedStatement
			pstmt = cnx.prepareStatement(sql);

			// Completion de la requête
			pstmt.setInt(1, conseillerId);

			// Exécuter et récupérer le résultat de la requête

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
}
