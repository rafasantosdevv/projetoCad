# 📋 ProjetoCad

API REST para cadastro e gerenciamento de usuários, desenvolvida com Java e Spring Boot.

---

## 🚀 Tecnologias

- **Java 17+**
- **Spring Boot**
- **Spring Data JPA**
- **Banco de dados H2** (em memória)
- **Maven**

---

## 📁 Estrutura do Projeto

```
projetoCad/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/exemplo/projetocad/
│   │   │       ├── controller/
│   │   │       ├── model/
│   │   │       ├── repository/
│   │   │       └── service/
│   │   └── resources/
│   │       └── application.properties
│   └── test/
└── pom.xml
```

> Adapte os pacotes conforme a estrutura real do seu projeto.

---

## ⚙️ Como executar

### Pré-requisitos

- Java 17 ou superior
- Maven 3.8+

### Passos

```bash
# 1. Clone o repositório
git clone https://github.com/rafasantosdevv/projetoCad.git

# 2. Acesse o diretório
cd projetoCad

# 3. Execute o projeto
./mvnw spring-boot:run
```

A aplicação estará disponível em: `http://localhost:8080`

---

## 🗄️ Banco de Dados

O projeto utiliza o **H2**, um banco de dados em memória. Os dados são resetados a cada reinicialização da aplicação.

Para acessar o console do H2:

```
URL:      http://localhost:8080/h2-console
JDBC URL: jdbc:h2:mem:testdb
Usuário:  sa
Senha:    (deixe em branco)
```

> Verifique as configurações no arquivo `src/main/resources/application.properties`.

---

## 📡 Endpoints

### Usuários

| Método | Endpoint         | Descrição                     |
|--------|------------------|-------------------------------|
| GET    | `/usuarios`      | Lista todos os usuários       |
| GET    | `/usuarios/{id}` | Busca um usuário por ID       |
| POST   | `/usuarios`      | Cadastra um novo usuário      |
| PUT    | `/usuarios/{id}` | Atualiza os dados de um usuário |
| DELETE | `/usuarios/{id}` | Remove um usuário             |

> Adapte os endpoints conforme as rotas reais do seu projeto.

### Exemplo de requisição (POST)

```json
POST /usuarios
Content-Type: application/json

{
  "nome": "Rafael Santos",
  "email": "rafael@email.com",
  "cpf": "000.000.000-00"
}
```

---

## 🧪 Testes

```bash
./mvnw test
```

---

## 📄 Licença

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

---

## 👨‍💻 Autor

Feito por [Rafael Santos](https://github.com/rafasantosdevv)
