# 🚗 Garagem de Carros

Exercícios da lista de Orientação à Objetos — UniSENAI 2026/1  

---

## 📁 Estrutura do Projeto

```
src/
└── main/java/br/com/carro/
    ├── Main.java
    ├── models/
    │   └── Carro.java
    └── services/
        └── CarroService.java
```

---

## ✅ Progresso

### 🚗 Carro — Exercícios 1 ao 9 (`carro/`)

- [x] **Exercício 1 – Classe e objeto**
    - [x] Criar a classe `Carro` com atributos `marca`, `modelo` e `ano`
    - [x] Criar dois objetos e atribuir valores diretamente
    - [x] Imprimir os dados de cada carro no console

- [x] **Exercício 2 – Método void vs método com retorno**
    - [x] Criar método `void exibir()` que imprime os dados formatados
    - [x] Criar método `int idadeDoCarro()` que retorna `2026 - ano`
    - [x] Chamar os dois métodos na Main com comentário explicativo

- [x] **Exercício 3 – ArrayList e for-each**
    - [x] Criar um `ArrayList<Carro>` na Main
    - [x] Adicionar 3 carros à lista
    - [x] Percorrer com for-each chamando `exibir()` em cada um

- [x] **Exercício 4 – Encapsulamento**
    - [x] Tornar todos os atributos `private`
    - [x] Criar getters e setters para todos os atributos
    - [x] Adicionar validação no `setAno()` (entre 1886 e 2026)
    - [x] Ajustar a Main para usar get/set em vez de acesso direto

- [x] **Exercício 5 – Construtor parametrizado**
    - [x] Criar construtor que recebe `marca`, `modelo` e `ano`
    - [x] Ajustar a Main para criar objetos via construtor

- [x] **Exercício 6 – Sobrecarga de construtor**
    - [x] Manter o construtor do exercício 5
    - [x] Criar construtor sem parâmetros com valores padrão (`"Desconhecido"`, `0`)
    - [x] Criar um carro de cada forma na Main e comentar a diferença

- [x] **Exercício 7 – `static` (atributo de classe)**
    - [x] Adicionar `static int totalCarros = 0` na classe
    - [x] Incrementar o contador nos dois construtores
    - [x] Imprimir `Carro.totalCarros` após criar 5 carros

- [x] **Exercício 8 – `static` (método de classe)**
    - [x] Criar método `static void imprimirTotal()`
    - [x] Tentar acessar `modelo` dentro do método static e observar o erro

- [x] **Exercício 9 – `final`**
    - [x] Criar constante `static final int ANO_PRIMEIRO_CARRO = 1886`
    - [x] Usar a constante na validação do `setAno()`
