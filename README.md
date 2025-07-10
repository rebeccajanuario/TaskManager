# 📋 Lista de Tarefas com Autenticação JWT

Projeto desenvolvido para a disciplina **Desenvolvimento Web** do IFSP - Câmpus Campinas.  
Esta aplicação é uma API RESTful para gerenciamento de tarefas, com autenticação e autorização baseada em **JWT (JSON Web Token)** e **Spring Security**.



---
## 🎥 Demonstração em Vídeo

[Assista à apresentação no YouTube](https://www.youtube.com/watch?v=Mh6YLHh_dws)

## 🚀 Funcionalidades

- ✅ Autenticação de usuários com **JWT**
- ✅ Perfis de acesso: `ROLE_USER` e `ROLE_ADMIN`
- ✅ Cadastro, login e emissão de token
- ✅ CRUD de tarefas
- ✅ Restrições de acesso por perfil (ex: apenas admins podem deletar)
- ✅ API RESTful com retorno em JSON
- ✅ Documentação de uso com exemplos

---

## 🛠️ Tecnologias Utilizadas

- Java 17+
- Spring Boot 3
- Spring Security
- Spring Data JPA
- JWT (jjwt)
- H2 Database (em memória)
- Maven

---

## ⚙️ Configuração do Ambiente

### Pré-requisitos:

- Java JDK 17 ou superior
- Maven 3.8+
- IDE como IntelliJ ou VS Code

### Como rodar localmente:

```bash
git clone https://github.com/seu-usuario/seu-repositorio.git
cd seu-repositorio
./mvnw spring-boot:run
