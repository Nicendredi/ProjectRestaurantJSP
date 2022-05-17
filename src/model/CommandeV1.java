package model;

public class CommandeV1 implements Commande {

	private int idCommande;
	private int idClient;
	private int total;
	private String info;

	public CommandeV1(int idCommande, int idClient, int total, String info) {
		this.idCommande = idCommande;
		this.idClient = idClient;
		this.total = total;
		this.info = info;
	}

	public CommandeV1() {
	}

	@Override
	public int getIdClient() {
		return idClient;

	}

	@Override
	public void ajouterArticle(Article a, int quantite) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getPrixTotal() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void supprimerArticle(Article a, int quantite) {
		// TODO Auto-generated method stub

	}

	@Override
	public void supprimerArticle(Article a) {
		// TODO Auto-generated method stub

	}

	public int getIdCommande() {
		return idCommande;
	}

	public void setIdCommande(int idCommande) {
		this.idCommande = idCommande;
	}

	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	@Override
	public String toString() {
		return "ImplementCommande [idClient=" + idClient + ", idCommande=" + idCommande + ", info=" + info + ", total="
				+ total + "]";
	}

}
