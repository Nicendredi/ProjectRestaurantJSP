<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
    <%
    out.print("<p>Erreur de connexion, veuillez reesayer.</p>");
    %>
    <form action="<%=request.getContextPath()%>/signup/validate" method="post">
        <label for="clientid">Identifiant</label>
        <input type="number" name="clientid" value="">
        <label for="clientpass">Mot de passe</label>
        <input type="text" name="clientpass" value="">
        <label for="clientfname">Prenom</label>
        <input type="text" name="clientfname" value="">
        <label for="clientlname">Nom</label>
        <input type="text" name="clientlname" value="">
        <label for="clientphone">Telephone</label>
        <input type="tel" name="clientphone" value="">
        <label for="clientadress">Adresse</label>
        <input type="text" name="clientadress" value="">
        <label for="clientinstruct">Instructions de livraison</label>
        <input type="text" name="clientinstruct" value="">
        <input type="submit" value="Creer Compte">
    </form>
</body>

</html>
