package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Adresse;
import model.Client;
import model.ClientV1;
import model.Instructions;
import model.Telephone;

public class DaoClientsMySql implements DaoClients {

	@Override
	public Client findById(Client obj_id) throws ClassNotFoundException, SQLException {
		Client c = null;
		Connection conn = ConnectionMySql.getInstance().getConnection();
		String sql = "select * from client where idclient=" + obj_id.getIdClient();
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sql);
		if (rs.next()) {
			c = new ClientV1();
			c.setIdClient(rs.getInt("idclient"));
			c.setPassword(rs.getString("password"));
			c.setName(rs.getString("name"));
			c.setName(rs.getString("fname"));
			c.setTelephone(new Telephone(rs.getString("phone")));
			c.setAdresse(new Adresse(rs.getString("adress")));
			c.setInstructions(new Instructions(rs.getString("instruction")));
		}
		return c;
	}

	@Override
	public List<Client> findAll() throws ClassNotFoundException, SQLException {
		List<Client> listeClients = new ArrayList<Client>();
		Connection conn = ConnectionMySql.getInstance().getConnection();
		String sql = "select * from client";
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sql);
		while (rs.next()) {
			ClientV1 icl = new ClientV1();
			icl.setIdClient(rs.getInt("idclient"));
			icl.setPassword(rs.getString("password"));
			icl.setName(rs.getString("name"));
			icl.setName(rs.getString("fname"));
			icl.setTelephone(new Telephone(rs.getString("phone")));
			icl.setAdresse(new Adresse(rs.getString("adress")));
			icl.setInstructions(new Instructions(rs.getString("instruction")));
			listeClients.add(icl);
		}
		return listeClients;
	}

	@Override
	public void create(Client c1) throws ClassNotFoundException, SQLException {

		Connection conn = ConnectionMySql.getInstance().getConnection();
		String sql = "insert into client values (?,?,?,?,?,?,?)";

		PreparedStatement ps = conn.prepareStatement(sql);

		ps.setInt(1, c1.getIdClient());
		ps.setString(2, c1.getPassword());
		ps.setString(3, c1.getName());
		ps.setString(4, c1.getfName());
		ps.setString(5, c1.getTelephone().toString());
		ps.setString(6, (c1.getAdresse().toString()));
		ps.setString(7, (c1.getInstructions().toString()));
		ps.executeUpdate();

	}

}
