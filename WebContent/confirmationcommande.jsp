<%@page import="model.Client"%>
<%@page import="java.util.Set"%>
<%@page import="model.Panier"%>
<%@page import="java.util.List"%>
<%@page import="model.Article"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@include file="../includes/head.jsp" %>
<body>
	<%@include file="includes/header.jsp" %>
	<% List<Article> articles = (List<Article>) session.getAttribute("ListArticle"); %>
	<% Client client = (Client) session.getAttribute("client"); %>
	<% Panier p = (Panier) session.getAttribute("Panier"); 
	
	Set<Article> listeArticles = p.getArticles(); 
	
	int totalPrice = 0;
	for (Article a : listeArticles) {
		totalPrice +=(a.getPrix()*(p.getQuantite(a)));
	}
	%>
	<div class="confirmationcommande">
		<p>Félicitation<%=client.getfName() + " " + client.getName()%></p>
		<p>Votre commande est validée</p>
		<p>Le montant total est de <%=totalPrice %></p>
	</div>

	<%@include file="includes/footer.jsp" %>
</body>
</html>