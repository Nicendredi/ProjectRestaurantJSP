package model;

public interface LigneCommande {

	public void ajouter(int quantite);

	/*
	 * [V1.5] Réduit la quantité de l'article
	 */
	public void enlever(int quantite);

}
