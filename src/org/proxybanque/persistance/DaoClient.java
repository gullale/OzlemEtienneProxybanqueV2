package org.proxybanque.persistance;

import org.proxybanque.model.Client;

public interface DaoClient {

	public String getClientInfos(int clientId);

	public void insertClient(Client clientAInserer);

	public void updateClient(Client clientAUpdater);

	public void deleteClient(int id);

}
