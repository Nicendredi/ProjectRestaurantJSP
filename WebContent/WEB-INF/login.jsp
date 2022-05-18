<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>


	<%
	if ((boolean) request.getAttribute("errorLogin")) {
		out.print("<p>Erreur de connexion. Veuillez réessayer.</p>");
	}
	%>
	<form action="<%=request.getContextPath()%>/login/validate" method="post">
    <label for="clientid">Identifiant (nombre)</label>
    <input type="number" name="clientid" value="">
    <label for="clientpass">Mot de passe</label>
    <input type="text" name="clientpass" value="">
    <input type="submit" value="Se Connecter">
</form></body>
</html>
