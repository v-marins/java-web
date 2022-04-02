<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Date"%> <%--Importação feita usando scrilet de diretivas <%@ --%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<title>Hello JSP</title>
</head>
<body>
<h1>Hello JSP!!</h1>
<% out.println("Usando uma página JSP"); %>
<%--Uso do elemento expressão --%>
<p>Data: <%=new Date()%> <%--Necessário fazer importação --%>
<%!int contador = 0; %> <%-- Scriplet de declaração --%>
<p>Visitas: <%=contador++%></p>
</body>
</html>