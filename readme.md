# ☕ Desafios Java — Santander + DIO

Repositório desenvolvido durante o **Bootcamp Santander 2025 - Java com IA**, em parceria com a **DIO (Digital Innovation One)**.

Este projeto reúne dois desafios práticos voltados ao desenvolvimento de soluções em **Java**, explorando conceitos fundamentais da linguagem e sua aplicação em cenários de sistemas bancários digitais.

---

## 📚 Sobre o projeto

Os desafios simulam funcionalidades de um banco digital, permitindo praticar desde estruturas condicionais e regras de negócio até conceitos de **Programação Orientada a Objetos (POO)**.

### Desafios desenvolvidos

| Desafio | Tema                   | Principais conceitos                                 |
| ------- | ---------------------- | ---------------------------------------------------- |
| 01      | Verificador de saldo   | Entrada de dados, condições e regras de negócio      |
| 02      | Gerenciamento de conta | POO, encapsulamento, métodos e manipulação de estado |

---

## 🎯 Objetivos

* Praticar a sintaxe e os fundamentos da linguagem Java;
* Trabalhar com entrada e saída de dados;
* Implementar estruturas condicionais;
* Aplicar regras de negócio em situações práticas;
* Desenvolver classes e métodos;
* Compreender e aplicar o conceito de **encapsulamento**;
* Praticar a manipulação e atualização do estado de um objeto;
* Desenvolver soluções seguindo os requisitos apresentados nos desafios.

---

# 💰 Desafio 01 — Verificador de Saldo

### 📌 Descrição

O primeiro desafio consiste em desenvolver um sistema simples para verificar se uma determinada transação pode ser realizada com base no saldo disponível de uma conta.

O programa recebe dois valores:

* Saldo disponível;
* Valor da transação desejada.

A partir desses valores, o sistema verifica se o saldo é suficiente para realizar a operação.

### 🔎 Regra de negócio

Se:

```text
saldo >= valor da transação
```

a transação é aprovada.

Caso contrário, o sistema informa que o saldo é insuficiente.

### 💻 Exemplos

**Entrada:**

```text
100 50
```

**Saída:**

```text
Transacao aprovada
```

---

**Entrada:**

```text
30 40
```

**Saída:**

```text
Saldo insuficiente
```

### 🧠 Conceitos praticados

* Variáveis;
* Tipos primitivos;
* Entrada de dados;
* Operadores relacionais;
* Estruturas condicionais (`if/else`);
* Implementação de regras de negócio;
* Saída de dados no console.

---

# 🏦 Desafio 02 — Gerenciamento de Conta

### 📌 Descrição

O segundo desafio apresenta um cenário mais próximo de uma aplicação bancária real.

Foi implementada uma classe `Conta`, responsável por armazenar e controlar o saldo de um cliente.

A conta permite realizar duas operações principais:

* **Depositar** valores;
* **Sacar** valores.

Além disso, o sistema deve garantir que o saldo nunca fique negativo.

### 🔐 Encapsulamento

Um dos principais objetivos desse desafio é aplicar o conceito de **encapsulamento**.

O atributo responsável pelo saldo deve permanecer protegido dentro da classe `Conta`, sendo manipulado somente através dos métodos disponibilizados pela própria classe.

Dessa forma, a classe controla como o saldo pode ser alterado e evita modificações indevidas diretamente no atributo.

### 💵 Regras de negócio

#### Depósito

Ao realizar um depósito, o valor informado é adicionado ao saldo atual.

```text
saldo = saldo + valor
```

#### Saque

O saque somente deve ser realizado quando houver saldo suficiente.

Caso o valor solicitado seja maior que o saldo disponível, a operação é ignorada.

Exemplo:

```text
Saldo: 50
Saque: 70

Resultado: operação ignorada
Saldo final: 50
```

### 💻 Exemplo

**Entrada:**

```text
100
depositar 50
sacar 30
fim
```

**Saída:**

```text
120
```

Outro exemplo:

**Entrada:**

```text
50
sacar 20
sacar 40
fim
```

**Saída:**

```text
30
```

O segundo saque não é realizado porque o saldo disponível naquele momento é insuficiente.

### 🧠 Conceitos praticados

* Programação Orientada a Objetos;
* Criação de classes;
* Atributos;
* Métodos;
* Encapsulamento;
* Modificadores de acesso;
* Manipulação do estado de objetos;
* Estruturas condicionais;
* Entrada e processamento de comandos;
* Regras de negócio.

---

# 🛠️ Tecnologias utilizadas

* **Java**
* **JDK**
* **Git**
* **GitHub**
* IDE de desenvolvimento Java

O projeto utiliza apenas recursos padrão da linguagem, sem dependências ou bibliotecas externas.

---

# 📂 Estrutura do projeto

A organização pode ser visualizada da seguinte forma:

```
.
├── exercise1/
│   └── ...
│
├── exercise/
│   └── ...
│
└── README.md
```

> A estrutura acima pode ser ajustada de acordo com a organização atual dos arquivos no repositório.

---

# 🚀 Como executar

### 1. Clone o repositório

```bash
git clone URL_DO_SEU_REPOSITORIO
```

### 2. Acesse a pasta do projeto

```bash
cd nome-do-repositorio
```

### 3. Execute o desafio desejado

Caso esteja utilizando uma IDE como IntelliJ IDEA, Eclipse ou VS Code, basta abrir o projeto e executar a classe que contém o método:

```java
public static void main(String[] args)
```

Também é possível executar os arquivos diretamente através do terminal utilizando o JDK instalado na máquina.

---

# 📖 Aprendizados

Os desafios representam uma pequena evolução dentro dos fundamentos de desenvolvimento em Java.

No primeiro desafio, o foco está na construção de uma solução simples baseada em **condições e regras de negócio**.

Já no segundo, o problema é modelado utilizando **Programação Orientada a Objetos**, permitindo trabalhar com uma entidade `Conta` e controlar seu estado através de métodos.

Essa evolução ajuda a compreender como problemas simples podem ser transformados gradualmente em estruturas mais organizadas e próximas de aplicações reais.

---

# 🔮 Possíveis melhorias

Como exercício de aprendizado, o projeto pode evoluir futuramente com funcionalidades como:

* Validação de valores de depósito e saque;
* Histórico de transações;
* Transferência entre contas;
* Identificação de clientes;
* Diferentes tipos de conta;
* Tratamento de exceções;
* Testes unitários;
* Persistência de dados;
* Interface gráfica ou API REST.

Essas funcionalidades permitiriam transformar o exercício inicial em uma aplicação bancária mais completa.

---

# 🎓 Formação

Projeto desenvolvido como parte dos desafios práticos do **Bootcamp Santander + DIO — Java com IA**.

A proposta dos desafios é colocar em prática os conhecimentos adquiridos durante a formação, utilizando problemas contextualizados para desenvolver habilidades de programação e Programação Orientada a Objetos.

---

## 👨‍💻 Autor

**Nathan Santos**

Estudante de desenvolvimento de software, atualmente aprofundando conhecimentos em **Java, Programação Orientada a Objetos e Inteligência Artificial** através da formação Santander + DIO.

📌 **GitHub:** devnathansantos

---

⭐ Se este projeto foi útil ou interessante para você, considere deixar uma estrela no repositório!
