# 📝 Lista de Tarefas - Projeto Java com JSP e Servlet

Este projeto é uma aplicação web simples para gerenciamento de tarefas (CRUD), utilizando **JSP**, **Servlets**, **DAO** e banco de dados relacional. A aplicação permite adicionar, listar, editar e excluir tarefas.

---

## 📌 Tecnologias Utilizadas

- Java (JDK 8+)
- JSP (Java Server Pages)
- Servlets
- JSTL (Jakarta Standard Tag Library)
- Tomcat 9.x ou 10 (compatível com Jakarta EE)
- Banco de Dados (ex: MySQL ou H2)
- IDE: Eclipse ou IntelliJ IDEA

---

## 📁 Estrutura do Projeto
</br>

![image](https://github.com/user-attachments/assets/b7f354ed-2254-45ac-8c53-4352380ba65d)
</br>
---

## ⚙️ Como Executar o Projeto

1. Clone o repositório:

```bash
git clone https://github.com/seu-usuario/nome-do-repo.git

2. Importe o projeto como Dynamic Web Project em sua IDE (Eclipse ou IntelliJ).

3. Configure o Apache Tomcat 9 ou 10 como servidor.

4. Crie o banco de dados:
CREATE DATABASE taskdb;

5. Crie a tabela:
CREATE DATABASE IF NOT EXISTS taskdb;
USE taskdb;

CREATE TABLE IF NOT EXISTS tasks (
    id INT PRIMARY KEY AUTO_INCREMENT,
    titulo VARCHAR(255),
    descricao TEXT
);


GRANT ALL PRIVILEGES ON taskdb.* TO 'root'@'localhost';
FLUSH PRIVILEGES;
SHOW DATABASES LIKE 'taskdb';

USE taskdb;
SHOW TABLES;
SELECT * FROM tasks;

SHOW GRANTS FOR 'root'@'localhost';

6. Configure a conexão no arquivo DBConnection.java com os dados do seu banco.

7. Inicie o servidor Tomcat e acesse:
http://localhost:8080/TaskManager/

✅ Funcionalidades

Criar tarefas

Listar tarefas

Editar tarefas

Excluir tarefas

 Fluxo de Comunicação da Aplicação:
 Vamos traçar um exemplo: Adicionando uma Nova Tarefa

     Usuário acessa index.html: O navegador exibe a página inicial.
     Usuário clica em "Entrar":
        Uma requisição POST é enviada para /TaskController.
        Como não há action na URL ou no formulário, o TaskController redireciona para listTasks.jsp.
     listTasks.jsp é carregada:
        O código Java dentro do JSP (scriptlet) cria uma instância de TaskDAO.
        Chama dao.getAllTasks().
        getAllTasks() (em TaskDAO) chama DBConnection.getConnection() para abrir uma conexão com o banco de dados.
        DBConnection carrega o driver (se ainda não estiver carregado) e retorna a conexão.
        getAllTasks() executa a query SELECT * FROM tasks, recupera os resultados em um ResultSet, mapeia cada linha para um TaskDTO e retorna uma List<TaskDTO>.
        listTasks.jsp itera sobre essa lista e gera o HTML da tabela para exibir as tarefas.
     Usuário clica em "Nova Tarefa" (em listTasks.jsp):
        O navegador é redirecionado para addTask.jsp.
     addTask.jsp é carregada:
        O navegador exibe o formulário vazio para adicionar uma nova tarefa.
     Usuário preenche o formulário e clica em "Adicionar":
        Uma requisição POST é enviada para /TaskController.
        Os parâmetros titulo, descricao e o campo oculto action=add são enviados com a requisição.
     TaskController recebe a requisição:
        No método processRequest(), ele detecta action como "add".
        Obtém titulo e descricao da requisição.
        Cria um novo TaskDTO.
        Chama dao.addTask(newTask).
        addTask() (em TaskDAO) obtém uma conexão do DBConnection.
        Executa a query INSERT INTO tasks (titulo, descricao) VALUES (?, ?), preenchendo os ? com os dados do TaskDTO.
        A nova tarefa é inserida no banco de dados.
        addTask() fecha a conexão e retorna.
        TaskController então envia um redirecionamento (response.sendRedirect("listTasks.jsp")) para o navegador.
    Navegador redireciona para listTasks.jsp:
        O processo do passo 3 se repete. Desta vez, dao.getAllTasks() buscará a lista atualizada de tarefas, incluindo a que acabou de ser adicionada.

✨ Contribuição

YEDA ENDRIGO RABELO DE CARVALHO
REBECCA JANUARIO
Pull requests são bem-vindos! Se quiser contribuir, abra uma issue ou envie uma PR com melhorias ou correções.
