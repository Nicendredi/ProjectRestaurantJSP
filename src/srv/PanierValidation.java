package srv;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DaoCommandes;
import dao.DaoCommandesMySql;
import model.Client;
import model.Commande;
import model.CommandeV1;
import model.Panier;

/**
 * Servlet implementation class PanierVue
 */
@WebServlet("/paniervalidation")
public class PanierValidation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PanierValidation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Panier p = (Panier) request.getSession().getAttribute("Panier");
		Client c = (Client) request.getSession().getAttribute("client");
		int idClient = c.getIdClient();
		
		DaoCommandes daocommande = new DaoCommandesMySql();
		Commande commande = new CommandeV1();
		commande.setPanier(p);
		commande.setIdClient(idClient);
		try {
			daocommande.create(commande);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		request.getRequestDispatcher("menu").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
