# Sistema de Login com Spring Boot e PostgreSQL

Este projeto é uma aplicação backend simples desenvolvida com **Spring Boot**, com funcionalidades de **registro de usuários** e **login**. 
A aplicação utiliza **Spring Security** para autenticação e validação de senhas, com o banco de dados **PostgreSQL** para persistir os dados dos usuários.

## Funcionalidades
  - Registro de novos usuários com validação de email único.
  - Login com autenticação utilizando email e senha.
  - Uso do **Spring Security** para proteger as rotas e realizar o controle de acesso.

## Tecnologias Utilizadas
  - **Postman** - Ferramente para testar as APIs.
  - **BCrypt** - Para criptografar as senhas dos usuários.
  - **Spring Boot** - Framework para desenvolvimento da aplicação.
  - **Spring Security** - Para implementar autenticação de usuários.
  - **PostgreSQL** - Banco de dados relacional para persistência de dados.
  - **JPA (Java Persistence API)** - Para persistir os dados dos usuários em um banco de dados relacional.
  

## Como Rodar o Projeto

  - Clone este repositório em sua máquina local
```
git clone https://github.com/GabrielSoarde/LoginService.git
cd LoginService
```

- Certifique-se de ter o PostgreSQL instalado e configurado. Em seguida, crie um banco de dados para a aplicação
```
CREATE DATABASE UserLogin;
```

## Configurando o Banco de Dados

No terminal de sua IDE digite
```
$env:BDNAME="UserLogin"
$env:USER="UsuarioPostgres"
$env:PASSWORD="SuaSenha"
```
- *UsuarioPostgres* deve ser o nome do **seu usuario no postgres**
- *SuaSenha* deve ser a **sua senha** cadastrada no postgres

# Rodando a Aplicação

No terminal de sua IDE digite
```
mvn spring-boot:run
```

Seguido os passos, agora é só testar a aplicação via Postman

## Registrando um novo usuário

- Na URL do postman coloque `http://localhost:8080/register`, e não se esqueça de colocar o método como **POST**

## Realizar Login

- Na URL do postman coloque `http://localhost:8080/login`, e não se esqueça de colocar o método como **POST**

Ao realizar o cadastro uma mensagem de **Email cadastrado com sucesso!** será retornada. 
Caso o email ja esteja cadastrado, uma mensagem de **Email ja cadastrado!** será retornada!

Na parte de login, caso as credenciais estejam corretas, uma mensagem de **Login realizado com sucesso!** será retornada. 
Caso as credenciais estejam incorretas, será retornado a mensagem **Senha ou email inválidos!**
 
  
