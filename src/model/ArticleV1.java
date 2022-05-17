package model;

public class ArticleV1 implements Article {
	private int idArticle;
	private String categorie;
	private String description;
	private int prix;

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	public int getIdArticle() {
		return idArticle;
	}

	public void setIdArticle(int idArticle) {
		this.idArticle = idArticle;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrix() {
		return prix;
	}

	@Override
	public String toString() {
		return "ImplementArticle [ categorie=" + categorie + ", description=" + description + ", idArticle=" + idArticle
				+ ", prix=" + prix + "]";
	}

}
