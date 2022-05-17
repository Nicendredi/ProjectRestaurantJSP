package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Client;
import model.Commande;
import model.CommandeV1;

public class DaoCommandesMySql implements DaoCommandes {

	@Override
	public Commande findById(Commande obj_id) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Commande> findAll() throws ClassNotFoundException, SQLException {
		List<Commande> listeCommande = new ArrayList<Commande>();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant-cgi", "root", "28121987");
		String sql = "select * from commandes";

		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sql);

		while (rs.next()) {
			Commande icm = new CommandeV1();
			icm.setIdClient(rs.getInt("idclient"));
			icm.setIdCommande(rs.getInt("idcommande"));
			icm.setTotal(rs.getInt("total"));
			icm.setInfo(rs.getString("info"));

			listeCommande.add(icm);

		}

		conn.close();
		return listeCommande;
	}

	@Override
	public List<Commande> findByClient(Client client) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void create(Commande commande) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

	}

}
