package model;

public class ArticleV1 implements Article {

	private int idArticle;
	private String categorie;
	private String description;
	private int prix;
	private String image;

	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("idArticle=");
		builder.append(idArticle);
		builder.append(", categorie=");
		builder.append(categorie);
		builder.append(", description=");
		builder.append(description);
		builder.append(", prix=");
		builder.append(prix);
		return builder.toString();
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
