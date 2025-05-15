<!DOCTYPE html>

<%@ page import="dao.TaskDAO" %>
<%@ page import="dto.TaskDTO" %>
<html>
<head>
    <title>Adicionar Tarefa</title>
</head>
<body>
    <h2>Nova Tarefa</h2>
  <form action="TaskController" method="post">
    <input type="text" name="titulo" placeholder="Título da tarefa" required />
    <br><br>
    <textarea name="descricao" placeholder="Descrição da tarefa"></textarea>
    <br><br>
    <input type="hidden" name="action" value="add" />
    <button type="submit">Adicionar</button>
</form>

    <br>
    <a href="listTasks.jsp">Voltar</a>
</body>
</html>
