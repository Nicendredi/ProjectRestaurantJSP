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
<%
	List<Article> articles = (List<Article>) request.getAttribute("ListArticle");
	out.print(articles);
%>

	<%
		String temp = "<p>VIVE JAVASCRIPT !!!</p>";
		out.print(temp);
	%>



</body>
</html>