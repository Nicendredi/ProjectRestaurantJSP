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
import model.Adresse;
import model.Client;
import model.ClientV1;
import model.Instructions;
import model.Telephone;

/**
 * Servlet implementation class SignupValidator
 */
@WebServlet({ "/signup/validate", "/register/validate" })
public class SignupValidator extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SignupValidator() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String destination = "/signup";
		HttpSession session = request.getSession();
		/* Reinitialiser l'utilisateur actuel */
		Client utilisateur_actuel = new ClientV1();

		/*
		 * Recuperer les parametres du formulaire de signup et actualiser
		 * l'utilisateur avec ces infos
		 */
		int clientid_param = -1;
		if (request.getParameter("clientid") != null) {
			clientid_param = Integer.parseInt(request.getParameter("clientid"));
		}
		utilisateur_actuel.setIdClient(clientid_param);
		utilisateur_actuel.setPassword(request.getParameter("clientpass"));
		utilisateur_actuel.setfName(request.getParameter("clientfname"));
		utilisateur_actuel.setName(request.getParameter("clientlname"));
		utilisateur_actuel.setTelephone(new Telephone(request.getParameter("clientphone")));
		utilisateur_actuel.setAdresse(new Adresse(request.getParameter("clientadress")));
		utilisateur_actuel.setInstructions(new Instructions(request.getParameter("clientinstruct")));
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
		 * Si l'utilisateur n'est pas dans la BDD et l'idClient est correct, le
		 * rajouter a la BDD
		 */
		if (utilisateur_actuel.getIdClient() >= 1 && utilisateur_bdd == null) {
			try {
				daocli.create(utilisateur_actuel);
				session.setAttribute("errorSignup", false);
				session.setAttribute("loggedIn", true);
				System.out.println("Un utilisateur a ete cree : " + utilisateur_actuel);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			session.setAttribute("errorSignup", true);
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
