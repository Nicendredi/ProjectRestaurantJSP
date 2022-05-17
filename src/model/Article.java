package model;

public interface Article {
	public String getCategorie();

	public void setCategorie(String categorie);

	public int getIdArticle();

	public void setIdArticle(int idArticle);

	public void setPrix(int prix);

	public String getDescription();

	public void setDescription(String description);

	public int getPrix();

	public String toString();

}
