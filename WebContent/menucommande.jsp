<%@page import="java.util.Set"%>
<%@page import="model.Panier"%>
<%@page import="model.Article"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% List<Article> articles = (List<Article>) session.getAttribute("ListArticle"); %>
<% Panier p = (Panier) session.getAttribute("Panier"); 
	
	Set<Article> listeArticles = p.getArticles(); 
	
	int totalPrice = 0;
	for (Article a : listeArticles) {
		totalPrice +=(a.getPrix()*(p.getQuantite(a)));
	}
%>

<h1>Fais ton repas</h1>
<p>La commande de """" d'un total de <%=totalPrice%></p>

<p>Fais ton choix parmi nos plats</p>

	<form action="ajout_article_panier" method="get">
		<select name="articleChoice" id="articleChoice">
			<%
				for (Article a : articles) {
			%>
				<option value="<%=a.getIdArticle()%>"><%=a.getDescription() + " " + a.getPrix()%></option>
			<%
				}
			%>
		</select> <label for="quantity">Quantity:</label> 
		<input type="number" id="quantity" name="quantity" value="1" min="1" max="5">
		<input type="submit" value="Ajouter au panier"></input>
	</form>
	
	<ul>
			<%
				for (Article a : listeArticles) {
			%>
				<ul><%=a.getDescription()+ " " + p.getQuantite(a)+ " " +a.getPrix()*(p.getQuantite(a))+" e" %></ul>
			<%
				}
			%>
	</ul>
	
	<form action="<%=request.getContextPath()%>/panier.jsp" method="post">
		<input type="submit" value="Voir panier"></input>
	</form>

</body>
</html>