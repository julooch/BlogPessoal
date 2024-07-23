# BlogPessoal

Este projeto backend envolve o desenvolvimento de um blog pessoal utilizando Java e o framework Spring, com ênfase na segurança por meio do Spring Security para autenticação de usuários. A aplicação seguiu o paradigma da programação orientada a objetos, garantindo uma estrutura coesa e modular. Após o desenvolvimento, foi realizado o deploy da aplicação, proporcionando acesso remoto ao blog. A arquitetura robusta e a autenticação segura são prioridades, garantindo uma experiência confiável e protegida para os usuários do blog pessoal.

## Tecnologias Utilizadas

- Java 17
- Spring Boot 2.5.0
- Spring Security 5.5.0
- JPA (Java Persistence API)
- MySQL (como database)
- Maven
- JWT

## Funcionalidades

- Registro de novos usuários
- Autenticação de usuários existentes
- Criação, leitura, atualização e exclusão de postagens, categorias e usuários do blog
- Proteção de endpoints com base em roles
- Configuração de segurança customizada

## Estrutura do Projeto

  - `config`: Configurações de segurança
  - `controller`: Controladores REST
  - `model`: Entidades JPA
  - `repository`: Interfaces de repositórios JPA
  - `service`: Serviços de negócio

## Configuração

### 1. Clonar o repositório

```bash
git clone https://github.com/julooch/BlogPessoal.git
cd BlogPessoal

