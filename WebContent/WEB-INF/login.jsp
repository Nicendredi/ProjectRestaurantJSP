<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@include file="../includes/head.jsp" %>
<body>
<%@include file="../includes/header.jsp" %>
	<%
	if ((boolean) request.getAttribute("errorLogin")) {
		out.print("<p>Erreur de connexion. Veuillez réessayer.</p>");
	}
	%>
	
	<div class="login">
		<form action="<%=request.getContextPath()%>/login/validate" method="post">
	    <label for="clientid">Identifiant (nombre)</label>
	    <input type="number" name="clientid" value="">
	    <label for="clientpass">Mot de passe</label>
	    <input type="text" name="clientpass" value="">
	    <input type="submit" value="Se Connecter">
		</form>
	</div>
	
	
<%@include file="../includes/footer.jsp" %>


</body>
</html>
