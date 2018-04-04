package org.proxybanque.services;

import org.proxybanque.persistance.DaoConseillerImp;

public class OperationConseiller implements ServicePourConseiller {

	private DaoConseillerImp daoConseiller = new DaoConseillerImp();

	@Override
	public boolean verificationLoginPassword(String login, String password) {

		String loginDao = daoConseiller.getConseillerLogin(login);
		String passwordDao = daoConseiller.getConseillerPassword(password);

		if (loginDao != null && loginDao.equals(login) && passwordDao != null && passwordDao.equals(password)) {

			return true;
		} else {
			return false;
		}

	}
}


