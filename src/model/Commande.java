package model;

public interface Commande {

	public int getIdClient();

	public int getPrixTotal();

	/*
	 * Renvoie une chaine de caractères représentant la liste de articles et la
	 * quantité correspondante. La chaine ressemble à
	 * [quantite1-idarticle1;quantite2-idarticle2;...]
	 */
	public String getInfo();

	public int getIdCommande();

	public void setIdCommande(int idCommande);

	public void setIdClient(int idClient);

	public int getTotal();

	public void setTotal(int total);

	public void setInfo(String info);

	public void setPanier(Panier panier);

	public String toString();
}
