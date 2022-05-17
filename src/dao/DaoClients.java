package dao;

import java.sql.SQLException;

import model.Client;

public interface DaoClients extends Dao<Client> {
	public void create(Client cl) throws ClassNotFoundException, SQLException;
}
