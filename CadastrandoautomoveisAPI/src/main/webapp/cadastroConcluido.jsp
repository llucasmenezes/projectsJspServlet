<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="javax.servlet.http.HttpServletRequest" %>
<%@ page import="javax.servlet.http.HttpServletResponse" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Cadastro Sucesso</title>

    <link rel="stylesheet" type="text/css" href="css/style.css">

</head>
<body>
    <h1>Cadastro realizado com sucesso!</h1>
    <h2>Dados coletados:</h2>

    <p><strong>Nome:</strong> <%= request.getParameter("name") %></p>
    <p><strong>CPF:</strong> <%= request.getParameter("cpf") %></p>
    <p><strong>Modelo do Carro:</strong> <%= request.getParameter("nameCar") %></p>
    <p><strong>Marca:</strong> <%= request.getParameter("marca") %></p>
    <p><strong>Cor:</strong> <%= request.getParameter("cor") %></p>
    <p><strong>Placa:</strong> <%= request.getParameter("placa") %></p>
    <p><strong>Chassi:</strong> <%= request.getParameter("chassi") %></p>

    <a href="index.jsp">Voltar ao formulário</a>
</body>
</html>