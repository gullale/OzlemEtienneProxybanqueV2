package org.proxybanque.services;

import org.proxybanque.persistance.DaoConseillerImp;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DaoConseillerImp test = new DaoConseillerImp();
				
		System.out.println(test.getConseillerLogin("titi"));
		
		
		OperationConseiller Octest = new OperationConseiller();
		
		System.out.println(Octest.verificationLoginPassword("titi", "titi"));
		
		
	}

}
