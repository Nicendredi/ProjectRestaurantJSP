package test;

import java.sql.SQLException;

import dao.Dao;
import dao.DaoArticlesMySql;
import dao.DaoClientsMySql;
import dao.DaoCommandes;
import dao.DaoCommandesMySql;
import model.CommandeV1;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		System.out.println("Tout va bien !!!!!!!!!!!!!");

		// testArticle();
		// testCommande();

		testClient();
	}

	public static void testArticle() throws ClassNotFoundException, SQLException {
		DaoArticlesMySql d1 = new DaoArticlesMySql();
		testArticleMySql(d1);
	};

	static void testArticleMySql(Dao d) throws ClassNotFoundException, SQLException {

		// ArticleV1 a1 = new ArticleV1(2, "bruschetta", 5, "entrée");
		// test pour rechercher tout les articles :ok
		System.out.println(d.findAll());

		// test pour rechercher par id problme de parametre a refaire je pense
		// System.out.println(d.findById(a1));

	}

	public static void testClient() throws ClassNotFoundException, SQLException {
		DaoClientsMySql ds = new DaoClientsMySql();
		testllientMySql(ds);
	}

	static void testllientMySql(Dao dc) throws ClassNotFoundException, SQLException {

		System.out.println(dc.findAll());
		// System.out.println(dc.findById(obj_id));

	}

	static void testFindcommandeById(Dao dc) throws ClassNotFoundException, SQLException {

		// System.out.println(dc.findAll());

	}

	public static void testCommande() throws ClassNotFoundException, SQLException {
		DaoCommandesMySql ds = new DaoCommandesMySql();
		testCommandeMySql(ds);
	}

	static void testCommandeMySql(DaoCommandes dc) throws ClassNotFoundException, SQLException {
		CommandeV1 commande = new CommandeV1(13, 11, 15, "info");
		// ClientV1 c1 = new ClientV1(13, 3, 12, "oozc");
		// test pour tout selectionner ok
		System.out.println(dc.findAll());
		// test pour creer OK
		// dc.create(commande);

		// mauvais parametre je pense
		// System.out.println(dc.findById(commande));

		// test pour chercher par client mauvais parametre du commande mysql je pense
		// arefaire avec les bon parametres notamment refaire avec un client
		// System.out.println(dc.findByClient(c1));
	}

}
