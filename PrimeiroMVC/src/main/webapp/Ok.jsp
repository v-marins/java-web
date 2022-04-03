<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="Usuario" type="model.Usuario" scope="request"/>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Funcionou</title>
</head>
<body>
<h1>Bem vindo!</h1>
<hr>
<!--Usamos Expression Language para passar as informações dos objetos para a view -->
Seu Id: <strong>${Usuario.id}</strong><br>
Seu Nome: <strong>${Usuario.fullName}</strong><br>
Seu Username: <strong>${Usuario.username}</strong><br>
Seu E-mail: <strong>${Usuario.email}</strong><br>
</body>
</html>