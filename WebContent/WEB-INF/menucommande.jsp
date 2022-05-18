<%@page import="model.Client"%>
<%@page import="java.util.Set"%>
<%@page import="model.Panier"%>
<%@page import="model.Article"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@include file="../includes/head.jsp" %>
<body>
<%@include file="../includes/header.jsp" %>
<% List<Article> articles = (List<Article>) session.getAttribute("ListArticle"); %>
<% Client client = (Client) session.getAttribute("client"); %>
<% Panier p = (Panier) session.getAttribute("Panier"); 
	int totalPrice = p.getPrixTotal();
	Set<Article> listeArticles = p.getArticles(); 
%>
<div class="menucommande">
<h1>Fais ton repas</h1>
<p>La commande de <%=client.getfName() + " " + client.getName()%> d'un total de <%=totalPrice%></p>

<p>Fais ton choix parmi nos plats</p>

	<form action="<%=request.getContextPath()%>/ajout_article_panier" method="get">
		<select class="form-select" name="articleChoice" id="articleChoice">
			<%
				for (Article a : articles) {
			%>
				<option value="<%=a.getIdArticle()%>"><%=a.getDescription() + " " + a.getPrix()%></option>
			<%
				}
			%>
		</select> <label for="quantity">Quantity:</label> 
		<input type="number" id="quantity" name="quantity" value="1" min="1" max="5">
		<input type="submit" value="Ajouter au panier">
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
</div>
<%@include file="../includes/footer.jsp" %>
</body>
</html>