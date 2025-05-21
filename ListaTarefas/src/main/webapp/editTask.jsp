<!DOCTYPE html>

<%@ page import="dao.TaskDAO" %>
<%@ page import="dto.TaskDTO" %>

<%


    int id = Integer.parseInt(request.getParameter("id"));
    TaskDTO task = new TaskDAO().getTaskById(id);
%>
<html>
<head>
    <title>Editar Tarefa</title>
</head>
<body>
    <h2>Editar Tarefa</h2>
    <form action="TaskController" method="post">
        <input type="hidden" name="action" value="update">
        <input type="hidden" name="id" value="<%= task.getId() %>">
        Título: <input type="text" name="titulo" value="<%= task.getTitulo() %>"><br><br>
        Descrição:<br>
        <textarea name="descricao" rows="5" cols="40"><%= task.getDescricao() %></textarea><br><br>
        <input type="submit" value="Atualizar">
    </form>
    <br>
    <a href="listTasks.jsp">Voltar</a>
</body>
</html>
