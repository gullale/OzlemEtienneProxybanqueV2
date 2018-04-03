package org.proxybanque.presentation;

import org.proxybanque.persistance.DaoConseiller;
import org.proxybanque.persistance.DaoConseillerImp;

public class Main {

	public static void main(String[] args) {

		DaoConseiller conseiller = new DaoConseillerImp();

		System.out.println(conseiller.getConseillerInfos(1));

	}

}
