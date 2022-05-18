package lstnr;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import model.ClientV1;
import model.Panier;

/**
 * Application Lifecycle Listener implementation class ClientListener
 *
 */
@WebListener
public class ClientListener implements HttpSessionListener, HttpSessionAttributeListener {

	/**
	 * Default constructor.
	 */
	public ClientListener() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
	 */
	public void sessionCreated(HttpSessionEvent arg0) {
		HttpSession session = arg0.getSession();
		session.setAttribute("client", new ClientV1());
		session.setAttribute("panier", new Panier());
		session.setAttribute("loggedIn", false);
		session.setAttribute("signedUp", false);
		session.setAttribute("errorLogin", false);
		session.setAttribute("errorSignup", false);
		System.out.println("Creation d'une session " + session.getId());
	}

	/**
	 * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
	 */
	public void sessionDestroyed(HttpSessionEvent arg0) {
		HttpSession session = arg0.getSession();
		System.out.println("[Destruction session " + session.getId() + "]");
	}

	/**
	 * @see HttpSessionAttributeListener#attributeAdded(HttpSessionBindingEvent)
	 */
	public void attributeAdded(HttpSessionBindingEvent arg0) {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpSessionAttributeListener#attributeRemoved(HttpSessionBindingEvent)
	 */
	public void attributeRemoved(HttpSessionBindingEvent arg0) {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpSessionAttributeListener#attributeReplaced(HttpSessionBindingEvent)
	 */
	public void attributeReplaced(HttpSessionBindingEvent arg0) {
		// TODO Auto-generated method stub
	}

}
