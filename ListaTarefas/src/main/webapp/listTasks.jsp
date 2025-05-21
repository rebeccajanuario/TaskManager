<!DOCTYPE html>

<%@ page import="java.util.*, dto.TaskDTO" %>
<%@ page import="dao.TaskDAO" %>
<%@ page import="dto.TaskDTO" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Lista de Tarefas</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
    <h2>Lista de Tarefas</h2>
    <a href="addTask.jsp">Nova Tarefa</a>
    <br><br>

    <table border="1">
        <tr>
            <th>ID</th>
            <th>Título</th>
            <th>Descrição</th>
            <th>Ações</th>
        </tr>
        <%
        
            TaskDAO dao = new TaskDAO();
            List<TaskDTO> tarefas = dao.getAllTasks();

            for (TaskDTO task : tarefas) {
        %>
            <tr>
                <td><%= task.getId() %></td>
                <td><%= task.getTitulo() %></td>
                <td><%= task.getDescricao() %></td>
                <td>
                    <a href="editTask.jsp?id=<%= task.getId() %>">Editar</a> |
                    <a href="TaskController?action=delete&id=<%= task.getId() %>">Excluir</a>
                </td>
            </tr>
        <%
            }
        %>
    </table>
</body>
</html>