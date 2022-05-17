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
}
