package srv;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.DaoClients;
import dao.DaoClientsMySql;
import model.Client;
import model.ClientV1;

/**
 * Servlet implementation class LoginValidator
 */
@WebServlet("/login/validate")
public class LoginValidator extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginValidator() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	// @SuppressWarnings("unused")
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String destination = "/login";
		HttpSession session = request.getSession();
		/* Reinitialiser l'utilisateur actuel */
		Client utilisateur_actuel = new ClientV1();

		/*
		 * Recuperer les parametres du formulaire de login et actualiser
		 * l'utilisateur avec ces infos
		 */
		int clientid_param = -1;
		if (request.getParameter("clientid") != null) {
			clientid_param = Integer.parseInt(request.getParameter("clientid"));
		}
		utilisateur_actuel.setIdClient(clientid_param);
		utilisateur_actuel.setPassword(request.getParameter("clientpass"));
		/*
		 * Recupere l'utilisateur dans la BDD avec le meme identifiant que
		 * l'utilisateur actuel
		 */
		DaoClients daocli = new DaoClientsMySql();
		Client utilisateur_bdd = null;
		try {
			if (utilisateur_actuel.getIdClient() >= 1) {
				utilisateur_bdd = daocli.findById(utilisateur_actuel);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		/*
		 * Si l'utilisateur actuel a un mot de passe, le comparer avec
		 * l'utilisateur extrait de la BDD
		 */
		if (utilisateur_actuel.getPassword() != null && utilisateur_actuel.equals(utilisateur_bdd)) {
			utilisateur_actuel = utilisateur_bdd;
			session.setAttribute("errorLogin", false);
			session.setAttribute("loggedIn", true);
			System.out.println("Un utilisateur s'est connecte : " + utilisateur_actuel);
		} else {
			session.setAttribute("errorLogin", true);
			session.setAttribute("loggedIn", false);
		}
		session.setAttribute("client", utilisateur_actuel);

		RequestDispatcher rd = request.getRequestDispatcher(destination);
		rd.forward(request, response);
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
