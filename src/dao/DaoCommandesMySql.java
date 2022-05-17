package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
		Commande cd = null;
		Connection conn = ConnectionMySql.getInstance().getConnection();
		String sql = "select * from commandes where idcommande=" + obj_id;
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sql);

		if (rs.next())

			cd = new CommandeV1(rs.getInt("idcommande"),
					rs.getInt("idclient"),
					rs.getInt("total"),
					rs.getString("info"));

		conn.close();
		return cd;
	}

	@Override
	public List<Commande> findAll() throws ClassNotFoundException, SQLException {
		List<Commande> listeCommande = new ArrayList<Commande>();
		Connection conn = ConnectionMySql.getInstance().getConnection();
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

		ArrayList<Commande> cli = new ArrayList<Commande>();
		Connection conn = ConnectionMySql.getInstance().getConnection();
		String sql = "select * from commandes where client='" + client + "'";

		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sql);

		while (rs.next()) {
			Commande icm = new CommandeV1();
			icm.setIdClient(rs.getInt("idclient"));
			icm.setIdCommande(rs.getInt("idcommande"));
			icm.setTotal(rs.getInt("total"));
			icm.setInfo(rs.getString("info"));
			cli.add(icm);
		}

		return cli;
	}

	@Override
	public void create(Commande commande) throws ClassNotFoundException, SQLException {

		Connection conn = ConnectionMySql.getInstance().getConnection();

		String sql = "insert into commandes values (?,?,?,?)";

		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, commande.getIdCommande());
		ps.setInt(2, commande.getIdClient());
		ps.setInt(3, commande.getTotal());
		ps.setString(4, commande.getInfo());
		ps.executeUpdate();

		conn.close();

	}

}
