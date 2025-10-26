# 🛍️ Projeto Spring Boot - Cadastro de Produtos

Este é um projeto simples desenvolvido em **Spring Boot** com o objetivo de praticar e entender as principais anotações e estruturas do framework — **sem banco de dados**, utilizando uma **memória em tempo de execução**.

Ideal para iniciantes que estão começando no ecossistema Spring e desejam compreender como funcionam as camadas de **Controller**, **Service** e **Repository**.

---
<img width="1252" height="719" alt="Captura de Tela 2025-10-26 às 16 57 51" src="https://github.com/user-attachments/assets/c43d2682-0a37-4da3-abac-857f62128762" />




## 🚀 Tecnologias utilizadas

- **Java 21+**
- **Spring Boot** (versão mais recente)
- **Spring Web**
- **H2 Database** (opcional — neste projeto, os dados ficam apenas em memória)
- **Maven**
- **IntelliJ IDEA / Spring Tools**

---

## 🧠 Objetivo do projeto

O projeto simula o **cadastro de produtos** com as operações básicas de um CRUD:

| Método | Endpoint                  | Descrição                      |
|:--------|:---------------------------|:--------------------------------|
| `POST`  | `/api/products`            | Cadastrar um novo produto       |
| `GET`   | `/api/products`            | Listar todos os produtos        |
| `GET`   | `/api/products/{id}`       | Buscar produto por ID           |
| `PUT`   | `/api/products/{id}`       | Atualizar produto existente     |
| `DELETE`| `/api/products/{id}`       | Deletar produto pelo ID         |

Os produtos são armazenados em uma estrutura de **mapa na memória**, sem necessidade de banco de dados.

---

## ⚙️ Como rodar o projeto

### 1. Clonar o repositório

```bash
git clone https://github.com/arielesilvaa/cadastrar_produto.git
cd produto-api

2. Executar a aplicação

Pelo IntelliJ: execute a classe principal ProdutoApiApplication.

Pelo terminal:

mvn spring-boot:run


A aplicação iniciará em:
👉 http://localhost:8080

🧩 Testando os endpoints

Você pode testar de duas formas:

✅ 1. Usando o arquivo requests.http no IntelliJ

Crie um arquivo na raiz do projeto chamado requests.http e cole o conteúdo abaixo:

### Criar produto
POST http://localhost:8080/api/products
Content-Type: application/json

{
  "name": "Camiseta",
  "description": "Camiseta de algodão",
  "price": 29.90
}

### Listar produtos
GET http://localhost:8080/api/products

### Buscar por ID
GET http://localhost:8080/api/products/1

### Atualizar produto
PUT http://localhost:8080/api/products/1
Content-Type: application/json

{
  "name": "Camiseta Premium",
  "description": "Camiseta 100% algodão",
  "price": 49.90
}

### Deletar produto
DELETE http://localhost:8080/api/products/1

✅ 2. Usando curl no terminal
# Criar produto
curl -X POST http://localhost:8080/api/products \
  -H "Content-Type: application/json" \
  -d '{"name":"Camiseta","description":"Camiseta algodão","price":29.90}'

📁 Estrutura do projeto
src/
├─ main/
│  ├─ java/com/example/demo/
│  │  ├─ controller/
│  │  │   └─ ProductController.java
│  │  ├─ model/
│  │  │   └─ Product.java
│  │  ├─ repository/
│  │  │   └─ InMemoryProductRepository.java
│  │  ├─ service/
│  │  │   └─ ProductService.java
│  │  └─ ProdutoApiApplication.java
│  └─ resources/
│      └─ application.properties
│
└─ test/
   └─ resources/
       └─ requests.http

🧰 Conceitos estudados

Criação de API REST com Spring Boot

Estruturação de camadas: Controller → Service → Repository

Uso de anotações:

@RestController

@RequestMapping

@GetMapping, @PostMapping, @PutMapping, @DeleteMapping

@Service e @Repository

Manipulação de dados em memória com Map<Long, Product>

🧑‍💻 Autora

Ariele Silva 
Desenvolvedora FullStack 
🌐 LinkedIn
