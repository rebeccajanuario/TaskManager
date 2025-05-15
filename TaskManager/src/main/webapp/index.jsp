<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" %>


<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
    <h2>Task Manager</h2>
    <h5>Organize suas listas de tarefas</h5>
    <form action="TaskController" method="post">
     
        <button type="submit">Entrar</button>
    </form>

    <!-- Tabela com tarefas será gerada dinamicamente -->
</body>
</html>
