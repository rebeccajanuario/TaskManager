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

✨ Contribuição

YEDA ENDRIGO RABELO DE CARVALHO
REBECCA JANUARIO
Pull requests são bem-vindos! Se quiser contribuir, abra uma issue ou envie uma PR com melhorias ou correções.
