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

	/*
	 * Cherche dans la liste des articles de la commande et rajoute la quantité
	 * indiquée. Si l'article n'éxiste pas, il le créé
	 */
	public void ajouterArticle(Article a, int quantite);

	/*
	 * [V1.5] Supprime la quantité demandée de l'article
	 */
	public void supprimerArticle(Article a, int quantite);

	/*
	 * [V1.5] Supprime l'article de la commande
	 */
	public void supprimerArticle(Article a);

	public int getIdCommande();

	public void setIdCommande(int idCommande);

	public void setIdClient(int idClient);

	public int getTotal();

	public void setTotal(int total);

	public void setInfo(String info);

	public String toString();
}
