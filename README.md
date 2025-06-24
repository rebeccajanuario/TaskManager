# 📝 ToDo List - Aplicação Web com Spring Boot

Este é um projeto de uma **lista de tarefas** (ToDo List) desenvolvido com **Java + Spring Boot + Thymeleaf**, que permite aos usuários **criar, visualizar, editar e excluir tarefas**. Ideal para fins didáticos, estudos de arquitetura MVC e persistência com banco de dados usando Spring Data JPA.

## 🚀 Funcionalidades

- ✅ Listar todas as tarefas
- ➕ Criar nova tarefa
- ✏️ Editar tarefa existente
- 🗑️ Excluir tarefa
- 📋 Marcar tarefas como concluídas
- Interface simples e responsiva com HTML + CSS

## 🛠️ Tecnologias Utilizadas

- Java 17+
- Spring Boot
- Spring MVC
- Spring Data JPA
- Thymeleaf
- H2 Database (ou outro banco relacional)
- Maven

## 📂 Estrutura de Pastas

src/ </br>
├── main/</br>
│ ├── java/</br>
│ │ └── com.exemplo.todolist/</br>
│ │ ├── controller/ # Lógica de controle das rotas</br>
│ │ ├── model/ # Entidade Task</br>
│ │ ├── repository/ # Interface JPA</br>
│ │ └── service/ # Lógica de negócio</br>
│ └── resources/</br>
│ ├── static/css/ # Arquivos de estilo (style.css)</br>
│ └── templates/ # Páginas Thymeleaf (.html)</br>



## 🔧 Como executar o projeto

1. **Clone este repositório:**

```bash
git clone (https://github.com/rebeccajanuario/ListadeTarefas/)
cd nome-do-repositorio

./mvnw spring-boot:run

```

🗃️ Banco de dados

O projeto pode usar H2 (memória) ou outro banco configurado no application.properties. O padrão é H2, facilitando testes:

spring.datasource.url=jdbc:h2:mem:todolist
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.h2.console.enabled=true

Acesse o console em: http://localhost:8080/h2-console


✨ Layout Simples e Limpo

As páginas HTML utilizam o mecanismo de template Thymeleaf com estilo CSS responsivo localizado em /static/css/style.css.
🙋‍♀️ Contribuição

Sinta-se à vontade para abrir issues, enviar pull requests ou sugerir melhorias!
📄 Licença

Este projeto está licenciado sob a MIT License.

Feito com ❤️ por Rebecca e Yeda
