package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Article;
import model.ArticleV1;

public class DaoArticlesMySql implements DaoArticles {

	@Override
	public Article findById(Article obj_id) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant-cgi", "root", "root");
		String sql = "select * from article where idarticle=" + obj_id.getIdArticle();

		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sql);
		Article a = null;
		if (rs.next()) {
			a = new ArticleV1();
			a.setIdArticle(rs.getInt("idarticle"));
			a.setDescription(rs.getString("descriptions"));
			a.setPrix(rs.getInt("prix"));
			a.setCategorie(rs.getString("categorie"));
			a.setImage(rs.getString("image"));
		}

		conn.close();
		return a;
	}

	@Override
	public List<Article> findAll() throws ClassNotFoundException, SQLException {

		Connection conn = ConnectionMySql.getInstance().getConnection();

		String sql = "select * from article";

		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sql);
		List<Article> liste = new ArrayList<Article>();
		while (rs.next()) {
			Article ia = new ArticleV1();
			ia.setIdArticle(rs.getInt("idarticle"));
			ia.setDescription(rs.getString("descriptions"));
			ia.setPrix(rs.getInt("prix"));
			ia.setCategorie(rs.getString("categorie"));
			ia.setImage(rs.getString("categorie"));
			liste.add(ia);

		}

		conn.close();
		return liste;
	}

}
