# 💬 WebSocket Chat com Spring Boot + STOMP

Este projeto é um **chat em tempo real** desenvolvido com **Spring Boot**, utilizando **WebSocket** e o protocolo **STOMP** para comunicação bidirecional entre clientes e servidor.

## 🚀 Funcionalidades

- Entrada de usuário com nome
- Envio e recebimento de mensagens em tempo real
- Exibição de usuários entrando no chat
- Interface simples e moderna com HTML/CSS/JS puro
- Comunicação via WebSocket utilizando SockJS + STOMP

## 📸 Demonstração

**___ESPAÇO PRA GIF FUTURO AQUI___**

A interface está localizada em `src/main/resources/static/index.html` e `***/static/chat.html`.

## 🧰 Tecnologias Utilizadas

- Java 17+
- Spring Boot
- Spring WebSocket
- STOMP
- SockJS
- HTML5 / CSS3 / JavaScript

## 📂 Estrutura do Projeto

```
src/
├── main/
│   ├── java/com/example/chat/
│   │   ├── controllers/
│   │   ├── models/
│   │   ├── config/
│   │   └── ChatApplication.java
│   └── resources/
│       └── static/
│           ├── index.html
│           └── chat.html
```
## ⚙️ Como Executar

### 1. Clone o repositório
```bash
git clone https://github.com/seu-usuario/websocket-chat-stomp-spring.git
cd websocket-chat-stomp-spring
```
### 2. Execute a aplicação
```bash
./mvnw spring-boot:run
```
### 3. Acesse no navegador
```bash
http://localhost:8080
```
## ✏️ Como funciona?
O frontend se conecta ao endpoint WebSocket /ws-chat

As mensagens são enviadas para /app/chat.sendMessage

Novos usuários se registram via /app/chat.newUser

O backend envia mensagens para o tópico /topic/public, onde todos os clientes estão inscritos.

## 📚 Aprendizado
Este projeto foi criado como primeiro contato com WebSocket e STOMP no Spring Boot, com o objetivo de entender a comunicação assíncrona em tempo real e os conceitos por trás da arquitetura baseada em eventos.

## 🧠 Autor
Desenvolvido por [Rene Battaglia](https://github.com/renebttg)

Entre em contato para colaborações ou sugestões!
