# CRUD de Alunos em Java

💻 Projeto desenvolvido para praticar o uso de **JDBC** e **MySQL** em uma aplicação Java.
O sistema realiza o **cadastro, listagem, atualização e exclusão de alunos** em um banco de dados, aplicando o padrão de projeto **DAO** (Data Access Object).

---

# Tecnologias utilizadas

**Java (JDK 17 ou superior)**  
**MySQL (Banco de dados relacional)**  
**JDBC (Java Database Connectivity)**  
**MySQL Connector/J (Driver de conexão com MySQL)**

---

# Conceitos praticados

- Padrão **DAO (Data Access Object)**
- Conexão com banco de dados via **JDBC**
- Operações **CRUD** (Create, Read, Update, Delete)
- Tratamento de exceções com **try-catch**
- Uso de **PreparedStatement** e **ResultSet**
- Organização do projeto em pacotes (**model**, **dao**, **util**, **main**)

---

# Funcionalidades

- Adiciona novos alunos ao banco de dados  
- Lista todos os alunos cadastrados  
- Atualiza dados de alunos existentes  
- Exclui alunos com base no ID  

---

## Estrutura da tabela no MySQL

```sql
CREATE DATABASE escola;
USE escola;

CREATE TABLE aluno (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100),
    idade INT,
    email VARCHAR(100)
);
```
---

📌 **Autor:** Paulo Henrique Borges Rosa
📌 **LinkedIn:** https://www.linkedin.com/in/henrique15
