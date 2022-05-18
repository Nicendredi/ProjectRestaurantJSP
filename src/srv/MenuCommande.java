package srv;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DaoArticles;
import dao.DaoArticlesMySql;
import model.Article;
import model.Panier;

/**
 * Servlet implementation class Commande
 */
@WebServlet({ "/menucommande" })
public class MenuCommande extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MenuCommande() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Récupération des articles
		DaoArticles a = new DaoArticlesMySql();
		List<Article> articles = null;
		try {
			articles = a.findAll();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		if (request.getSession().getAttribute("ListArticle") == null)
			request.getSession().setAttribute("ListArticle", articles);
		if (request.getSession().getAttribute("Panier") == null)
			request.getSession().setAttribute("Panier", new Panier());
		// création du panier
		// Panier p = (Panier) request.getSession().getAttribute("Panier");
		// System.out.println(p.getArticles());

		System.out.println(request.getSession().getAttribute("loggedIn"));
		String destination = "/login";
		if ((boolean) request.getSession().getAttribute("loggedIn")) {
			destination = "WEB-INF/menucommande.jsp";
		}
		request.getRequestDispatcher(destination).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
