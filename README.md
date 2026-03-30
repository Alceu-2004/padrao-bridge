# 📩 Bridge Pattern - Sistema de Notificações

## 📌 Sobre o Projeto

Este projeto foi desenvolvido para demonstrar a aplicação do padrão de projeto **Bridge** utilizando a linguagem **Java**.

A aplicação simula um sistema de envio de notificações, permitindo a separação entre os tipos de notificações e os canais de envio, garantindo baixo acoplamento e maior flexibilidade.

---

## 🎯 Objetivo

Aplicar o padrão Bridge com boas práticas de desenvolvimento, incluindo:

* Separação entre abstração e implementação
* Uso de princípios SOLID (principalmente SRP)
* Código limpo e organizado
* Testes unitários
* Estrutura baseada em Maven

---

## 🧠 Padrão Bridge

O padrão Bridge tem como objetivo desacoplar uma abstração da sua implementação, permitindo que ambas evoluam de forma independente.

### ✔ Aplicação no projeto:

* **Abstração:** `Notification`
* **Implementação:** `MessageSender`
* **Refinamentos:** `SimpleNotification`, `UrgentNotification`
* **Implementações concretas:** `EmailSender`, `SMSSender`

---

## 🏗️ Estrutura do Projeto

```text
src/
├── main/
│   └── java/
│       ├── formatter/
│       ├── log/
│       ├── notification/
│       └── sender/
│
└── test/
    ├── formatter/
    ├── notification/
    └── sender/
```

---

## 📊 Diagrama UML

O diagrama UML do projeto está disponível em:

```
docs/diagram.puml
```

O diagrama representa:

* Relação entre abstração e implementação (Bridge)
* Herança entre classes
* Implementação de interfaces
* Associações entre componentes

---

## ⚙️ Tecnologias Utilizadas

* Java
* IntelliJ IDEA
* Maven
* JUnit 5
* Mockito

---

## 🚀 Como Executar o Projeto

1. Clone o repositório:

```
git clone https://github.com/seu-usuario/bridge-notifications.git
```

2. Abra o projeto no IntelliJ IDEA

3. Execute a classe:

```
Main.java
```

---

## 🧪 Testes

O projeto possui testes unitários utilizando:

* JUnit 5
* Mockito

### ✔ Cobertura dos testes:

* Envio de notificações simples e urgentes
* Integração com diferentes canais (Email e SMS)
* Formatação de mensagens
* Uso de mocks para isolamento de dependências

### ▶️ Executar testes:

* Clique com botão direito na pasta `test`
* Selecione **Run Tests**

---

## 🧩 Boas Práticas Aplicadas

* ✔ Single Responsibility Principle (SRP)
* ✔ Baixo acoplamento
* ✔ Alta coesão
* ✔ Uso de interfaces
* ✔ Polimorfismo ao invés de condicionais
* ✔ Separação clara de responsabilidades

---

## 🔥 Diferenciais do Projeto

* Implementação clara do padrão Bridge
* Estrutura organizada em pacotes
* Testes unitários com Mockito
* Diagrama UML representando a arquitetura
* Código preparado para expansão

---

## 📈 Possíveis Melhorias

* Adicionar novos canais (WhatsApp, Push Notification)
* Implementar injeção de dependência
* Criar interface gráfica
* Persistência de logs

---

## 👨‍💻 Autor

Alceu Botelho
