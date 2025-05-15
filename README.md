# 📝 Task Manager - Projeto Java com JSP e Servlet

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
📦TaskManager</br>
┣ 📂src</br>
┃ ┣ 📂controller → Servlets</br>
┃ ┣ 📂dao → Acesso a dados (DAO)</br>
┃ ┗ 📂model → Classes DTO</br>
┣ 📂WebContent</br>
┃ ┣ 📂css → Estilos</br>
┃ ┣ 📂jsp → Páginas JSP (adicionar, editar, listar)</br>
┃ ┣ 📂WEB-INF</br>
┃ ┃ ┗ web.xml → Configuração do servlet</br>
┗ README.md</br>
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
CREATE TABLE tasks (
    id INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(100),
    descricao TEXT
);

6. Configure a conexão no arquivo DBConnection.java com os dados do seu banco.

7. Inicie o servidor Tomcat e acesse:
http://localhost:8080/TaskManager/

✅ Funcionalidades

Criar tarefas

Listar tarefas

Editar tarefas

Excluir tarefas

✨ Contribuição

Pull requests são bem-vindos! Se quiser contribuir, abra uma issue ou envie uma PR com melhorias ou correções.
