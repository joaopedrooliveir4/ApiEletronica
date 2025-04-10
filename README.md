# 📋 API de Ordem de Serviço - Eletrônica Oliveira

Este projeto é uma API RESTful desenvolvida em Java com Spring Boot para gerenciamento de ordens de serviço de uma assistência técnica.

---

## 🛠️ Tecnologias Utilizadas

- Java 17+
- Spring Boot
- Spring Data JPA
- MySQL
- Lombok
- Maven

---

## 🚀 Funcionalidades da API

- ✅ Cadastro de nova ordem de serviço
- ✅ Listagem de todas as ordens
- ✅ Busca por ID, nome, telefone e aparelho
- ✅ Atualização de uma ordem
- ✅ Exclusão de uma ordem
- ✅ Validações com Bean Validation

---

## 📂 Endpoints

### 📌 GET `/ordens`

Lista todas as ordens de serviço cadastradas.

---

### 📌 GET `/ordens/{id}`

Retorna uma ordem de serviço específica por ID.

---

### 📌 GET `/ordens/nome?nome=Exemplo`

Busca ordens por nome.

---

### 📌 POST `/ordens`

Cria uma nova ordem de serviço.

```
{
  "nome": "João",
  "telefone": "99999-9999",
  "aparelho": "Celular",
  "defeito": "Não liga",
  "endereco": "",
  "pecas": "",
  "valorPecas": null,
  "valorFinal": null
}
```
---

### 📌 PUT /ordens/{id}
Atualiza uma ordem de serviço existente.

---

### 📌 DELETE /ordens/{id}
Remove uma ordem de serviço do sistema.

### 🖼️ Prints do Sistema
#### GET:

<sub>![image](https://github.com/user-attachments/assets/98b26f1f-d915-4354-9bc7-9b5234c67675)
</sub>

---

#### POST:

<sub>![image](https://github.com/user-attachments/assets/7137d774-ff6a-4220-933e-c2267261718f)
</sub>

---

#### PUT:

<sub>![image](https://github.com/user-attachments/assets/90465258-2b00-4af7-bf7d-0e0b6c8c0933)
</sub>

---

#### DELETE:

<sub>![image](https://github.com/user-attachments/assets/6e3c9341-2c9a-480b-83f4-39050dea45c5)
</sub>

##### AQUI NESSE DELETE EU DELETEI O USUÁRIO COM ```id = 2```

---

#### Tabela no banco de dados MySQL:

<sub>![image](https://github.com/user-attachments/assets/0b39a005-ccdb-4773-9ac0-175b9d0f6d9a)
</sub>

---

### 📌 Observações
Os campos valorPecas e valorFinal podem ser deixados como null inicialmente.

As validações são aplicadas apenas nos campos obrigatórios.

O sistema pode ser estendido com autenticação e mais filtros de busca.

---

### 👨‍💻 Autor
João Pedro
Estudante de Análise e Desenvolvimento de Sistemas
Futuro Dev Java & Engenheiro de Software
