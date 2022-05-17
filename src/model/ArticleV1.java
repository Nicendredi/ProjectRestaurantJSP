package model;

public class ArticleV1 implements Article {

	private int idArticle;
	private String categorie;
	private String description;
	private int prix;
	private String image;

	@Override
	public String toString() {
		return "ImplementArticle [ categorie=" + categorie + ", description=" + description + ", idArticle=" + idArticle
				+ ", prix=" + prix + "]";
	}

	public int getIdArticle() {
		return idArticle;
	}

	public void setIdArticle(int idArticle) {
		this.idArticle = idArticle;
	}

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
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

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

}
