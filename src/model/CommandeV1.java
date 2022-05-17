package model;

public class CommandeV1 implements Commande {

	private int idCommande;
	private int idClient;
	private int total;
	private String info;
	private Panier panier;

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
	public int getPrixTotal() {
		if (panier == null) {
			return 0;
		}
		return panier.getPrixTotal();
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

	public void setPanier(Panier panier) {
		this.panier = panier;
		if (panier != null) {
			this.info = panier.toString();
		}
	}

	@Override
	public String toString() {
		return "ImplementCommande [idClient=" + idClient + ", idCommande=" + idCommande + ", info=" + info + ", total="
				+ total + "]";
	}

}
