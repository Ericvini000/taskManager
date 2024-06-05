# Aplicação CRUD em Java - GESTÃO DE TAREFAS

> "Ciência é conhecimento organizado, Sabedoria é vida organizada"
> 
> <cite> -Immanuel Kant<cite>

## Objetivo do Projeto

Um cliente requisitou o desenvolvimento de uma aplicação Java focada na gestão eficiente de tarefas. O objetivo principal é criar uma solução robusta que permita a criação, listagem, deleção e busca por tarefas. Essa especificação visa atender à demanda do cliente por um sistema que garanta a fácil identificação de tarefas a se fazer.

### A aplicação deve ser capaz de:

1. **Criação de Tarefa**: Permitir que o usuário adicione novas tarefas ao sistema, com cada tarefa tendo um identificador único, titulo, status e descrição.
2. **Listagem de Tarefas**: Facilitar a visualização de todos as tarefas disponíveis no sistema. Além disso, deve permitir que o usuário filtre tarefas pelo status dela.
3. **Busca de Tarefa por Id**: Oferecer uma funcionalidade de busca para localizar rapidamente tarefas pelo ID.
4. **Deleção de Tarefa por Id**: Oferecer uma funcionalidade de deleção de tarefa por id.

## Tecnologias

- Java 22
- Spring Boot 3.3
- Maven

## Organização de Pastas

- 📂 src
  - 📂 gestao_de_tarefas
    - 📄 GestaoDeTarefasApplication.java
    * 📂 task
      - 📂 dtos
        - 📄 TaskCreateDTO.java
      * 📄 TaskController.java
      * 📄 TaskEntity.java
      * 📄 TaskRepository.java
      * 📄 TaskService.java
    * 📂 exceptions
      - 📂 customExceptions
        - 📄 NotFoundException.java
        * 📂 dtos
          - 📄 ErrorMessageDTO.java
        - 📄 GlobalExcpetionHandler.java
    * 📂 configurations
      - 📄 GlobalConfig.java

## Rotas / Endpoints

**Rota de Criação / `POST - 201`**

    localhost:8080/api/tasks

Cria uma tarefa e a armazena no banco de dados


**Rota de Listagem / `GET - 200`**

    localhost:8080/api/tasks

Lista todas as tarefas existentes no banco de dados


**Rota de Listagem / `GET - 200`**

    localhost:8080/api/tasks/{taskId}

Mostra uma tarefa específica


**Rota de Listagem / `DELETE - 204`**

    localhost:8080/api/tasks/{taskId}

Deleta uma tarefa do banco de dados
