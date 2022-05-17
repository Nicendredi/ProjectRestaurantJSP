<%@page import="model.Article"%>
<%@page import="java.util.Set"%>
<%@page import="model.Panier"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		
		<% Panier p = (Panier) session.getAttribute("Panier"); 
	
			Set<Article> listeArticles = p.getArticles(); 
			int totalPrice = 0;
			for (Article a : listeArticles) {
				totalPrice +=(a.getPrix()*(p.getQuantite(a)));
			}
		
		%>
		


	<p>La commande de """" d'un total de <%=totalPrice%></p>
		<ul>
			<%
				for (Article a : listeArticles) {
			%>
				<ul><%=a.getDescription()+ " " + p.getQuantite(a)+ " " +a.getPrix()*(p.getQuantite(a))+" e" %></ul>
			<%
				}
			%>
		</ul>
		
		
		<form action="<%=request.getContextPath()%>/paniervalidation" method="post")>
			<input type="submit" value="Validez panier"></input>
		</form>
		
		<form action="<%=request.getContextPath()%>/menucommande" method="post")>
			<input type="submit" value="Retour au panier"></input>
		</form>
</body>
</html>