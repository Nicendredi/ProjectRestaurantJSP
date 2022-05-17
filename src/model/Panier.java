package model;

import java.util.HashMap;
import java.util.Set;

public class Panier {
	private HashMap<Article, Integer> liste_article;

	public void ajouterArticle(Article article, int quantite) {
		int nouvelle_quantite = quantite;
		if (liste_article.containsKey(article)) {
			nouvelle_quantite += liste_article.get(article);
		}
		liste_article.put(article, nouvelle_quantite);
	}

	public Set<Article> getArticles() {
		return liste_article.keySet();
	}

	public int getQuantite(Article article) {
		return liste_article.get(article);
	}
	
	public int getPrixTotal() {
		int total = 0;
		Set<Article> clefs = liste_article.keySet();
		for (Article article : clefs) {
			total += article.getPrix() * liste_article.get(article);
		}
		return total;
	}
	
	public String toString() {
		boolean isFirst = true;
		Set<Article> clefs = liste_article.keySet();
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		for (Article article : clefs) {
			if (!isFirst) {
				builder.append(";");
			}
			builder.append(liste_article.get(article) + "-"+article.getIdArticle());
		}
		builder.append("]");
		return builder.toString();
	}
}
