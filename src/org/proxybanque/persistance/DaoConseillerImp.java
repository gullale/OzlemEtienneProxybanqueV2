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

			// Cr�ation de la requ�te
			String sql = "SELECT prenom FROM conseiller where conseillerId=?";

			// Compilation du preparedStatement
			pstmt = cnx.prepareStatement(sql);

			// Completion de la requ�te
			pstmt.setInt(1, conseillerId);

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
}
