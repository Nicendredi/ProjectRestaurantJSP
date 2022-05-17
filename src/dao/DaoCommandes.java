package dao;

import java.sql.SQLException;
import java.util.List;

import model.Client;
import model.Commande;

public interface DaoCommandes extends Dao<Commande> {

	public List<Commande> findByClient(Client client) throws ClassNotFoundException, SQLException;

	public void create(Commande commande) throws ClassNotFoundException, SQLException;

}
