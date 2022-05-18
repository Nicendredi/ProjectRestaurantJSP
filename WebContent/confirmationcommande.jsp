<%@page import="java.util.Set"%>
<%@page import="model.Panier"%>
<%@page import="java.util.List"%>
<%@page import="model.Article"%>
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
	
	<p>Félicitation "" ""</p>
	<p>Votre commande est validée</p>
	<p>Le montant total est de <%=totalPrice %></p>
</body>
</html>