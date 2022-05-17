package model;

public class LigneCommandeV1 implements LigneCommande {
	private int quantite;
	private Article article;

	public int getQuantite() {
		return quantite;
	}

	public Article getArticle() {
		return article;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LigneCommandeV1 [quantite=");
		builder.append(quantite);
		builder.append(", ");
		if (article != null) {
			builder.append("article=");
			builder.append(article);
		}
		builder.append("]");
		return builder.toString();
	}

	@Override
	public void ajouter(int quantite) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enlever(int quantite) {
		// TODO Auto-generated method stub

	}

}
