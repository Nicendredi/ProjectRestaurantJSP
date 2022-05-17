package srv;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DaoArticles;
import dao.DaoArticlesMySql;
import model.Article;
import model.ArticleV1;
import model.Panier;

/**
 * Servlet implementation class Panier
 */
@WebServlet("/ajout_article_panier")
public class PanierServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PanierServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int quantity = Integer.parseInt(request.getParameter("quantity"));
		int articleId = Integer.parseInt(request.getParameter("articleChoice"));
		
		DaoArticles daoArticle = new DaoArticlesMySql();
		Article articleTemp = new ArticleV1();
		articleTemp.setIdArticle(articleId);
		try {
			articleTemp = daoArticle.findById(articleTemp);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Panier p = (Panier) request.getSession().getAttribute("Panier");
		
		if(p != null)
			p.ajouterArticle(articleTemp, quantity);
		
		request.getRequestDispatcher("/menucommande").forward(request, response);
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
