<%@page import="java.awt.Component"%>
<%@page import="java.util.List"%>
<%@page import="model.Article"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@include file="../includes/head.jsp" %>
<body>
	<%@include file="../includes/header.jsp" %>
	<% List<Article> articles = (List<Article>) request.getAttribute("ListArticle"); %>
	
	<h2 class="menu_h2">Entrées</h2>
	<div class="menu menu__entree">
	<%
		if (!articles.isEmpty())
 			for (Article a : articles) {
 				if(a.getCategorie().equalsIgnoreCase("entrée")){
 					%>
 					
 					<div class="card" style="width: 18rem;">
 						<img class="card-img-top" src="<%=a.getImage()%>" alt="Card image cap">
 						<div class="card-body">
 							<h5 class="card-title"><%=a.getDescription()%></h5>
 							<p class="card-text"><%=a.getPrix()%> Euros</p>
 						</div>
 					</div>
 					<%	
 				}
			}
	%>
	</div>
		<h2 class="menu_h2">Plats</h2>
		<div class="menu menu__entree">
	<%
		if (!articles.isEmpty())
 			for (Article a : articles) {
 				if(a.getCategorie().equalsIgnoreCase("plat")){
 					%>
 					<div class="card" style="width: 18rem;">
 						<img class="card-img-top" src="<%=a.getImage()%>" alt="Card image cap">
 						<div class="card-body">
 							<h5 class="card-title"><%=a.getDescription()%></h5>
 							<p class="card-text"><%=a.getPrix()%> Euros</p>
 						</div>
 					</div>
 					<%	
 				}
			}
	%>
	</div>
	<h2 class="menu_h2">Desserts</h2>
	<div class="menu menu__entree">
	<%
		if (!articles.isEmpty())
 			for (Article a : articles) {
 				if(a.getCategorie().equalsIgnoreCase("dessert")){
 					%>
 					<div class="card" style="width: 18rem;">
 						<img class="card-img-top" src="<%=a.getImage()%>" alt="Card image cap">
 						<div class="card-body">
 							<h5 class="card-title"><%=a.getDescription()%></h5>
 							<p class="card-text"><%=a.getPrix()%> Euros</p>
 						</div>
 					</div>
 					<%	
 				}
			}
	%>
	</div>
	<h2 class="menu_h2">Boissons</h2>
	<div class="menu menu__entree">
	<%
		if (!articles.isEmpty())
 			for (Article a : articles) {
 				if(a.getCategorie().equalsIgnoreCase("boisson")){
 					%>
 					<div class="card" style="width: 18rem;">
 						<img class="card-img-top" src="<%=a.getImage()%>" alt="Card image cap">
 						<div class="card-body">
 							<h5 class="card-title"><%=a.getDescription()%></h5>
 							<p class="card-text"><%=a.getPrix()%> Euros</p>
 						</div>
 					</div>
 					<%	
 				}
			}
	%>
	</div>

<%@include file="../includes/footer.jsp" %>
</body>
</html>