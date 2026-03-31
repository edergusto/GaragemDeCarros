# 🚗 POOsitivo

Repositório de exercícios da lista de POO — UniSENAI 2026/1  
**Prof. Diego Alves** | Preparação para Prova Bimestral

---

## 📁 Estrutura do Projeto

```
src/
└── main/java/br/com/
    ├── carro/
    │   ├── models/Carro.java
    │   ├── services/CarroService.java
    │   └── Main.java
    ├── lanchonete/
    │   └── Main.java
    ├── estacionamento/
    │   └── Main.java
    ├── academia/
    │   └── Main.java
    ├── locadora/
    │   └── Main.java
    └── delivery/
        └── Main.java
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
    - [x] Comentar a vantagem do construtor vs setters individuais

- [x] **Exercício 6 – Sobrecarga de construtor**
    - [x] Manter o construtor do exercício 5
    - [x] Criar construtor sem parâmetros com valores padrão (`"Desconhecido"`, `0`)
    - [x] Criar um carro de cada forma na Main e comentar a diferença

- [x] **Exercício 7 – `static` (atributo de classe)**
    - [x] Adicionar `static int totalCarros = 0` na classe
    - [x] Incrementar o contador nos dois construtores
    - [x] Imprimir `Carro.totalCarros` após criar 5 carros
    - [x] Comentar a diferença entre atributo `static` e de instância

- [x] **Exercício 8 – `static` (método de classe)**
    - [x] Criar método `static void imprimirTotal()`
    - [x] Tentar acessar `modelo` dentro do método static e observar o erro
    - [x] Comentar por que método static não acessa atributo de instância

- [x] **Exercício 9 – `final`**
    - [x] Criar constante `static final int ANO_PRIMEIRO_CARRO = 1886`
    - [x] Usar a constante na validação do `setAno()`
    - [x] Tentar alterar a constante na Main e comentar o que `final` faz

---

### 🍔 Lanchonete do Seu Jorge — Exercício 16 (`lanchonete/`)

- [ ] Criar classe `Lanche` com atributos `nome` e `preco` (private)
    - [ ] Validar que o preço não pode ser negativo no setter
- [ ] Criar classe `Pedido` com referência ao `Lanche` e nome do cliente
    - [ ] Adicionar `static int totalPedidos` e incrementar no construtor
- [ ] Criar menu no console com as opções:
    - [ ] Cadastrar lanche no cardápio
    - [ ] Registrar pedido de cliente
    - [ ] Exibir total de pedidos do dia
    - [ ] Sair

---

### 🅿️ Estacionamento do Carlão — Exercício 17 (`estacionamento/`)

- [ ] Criar classe `Vaga` (ou similar) com `placa` e `modelo` do carro
- [ ] Definir `static final int TOTAL_VAGAS = 20`
- [ ] Implementar lógica de entrada: adicionar carro à lista se houver vaga
- [ ] Implementar lógica de saída: remover carro da lista pela placa
- [ ] Criar menu no console com as opções:
    - [ ] Registrar entrada de carro
    - [ ] Registrar saída de carro
    - [ ] Exibir vagas ocupadas e livres
    - [ ] Sair

---

### 💪 Academia da Fernanda — Exercício 18 (`academia/`)

- [ ] Criar classe `Aluno` com atributos `nome`, `idade` e `plano` (private)
    - [ ] Validar idade mínima de 14 anos no setter
- [ ] Definir `static final int LIMITE_ALUNOS = 50`
- [ ] Adicionar `static int totalAlunos` e incrementar no construtor
- [ ] Bloquear matrícula quando `totalAlunos >= LIMITE_ALUNOS`
- [ ] Criar menu no console com as opções:
    - [ ] Matricular aluno
    - [ ] Listar todos os alunos
    - [ ] Exibir total de alunos
    - [ ] Sair

---

### 🎬 Locadora do Marcos — Exercício 19 (`locadora/`)

- [ ] Criar classe `Filme` com atributos `titulo`, `genero` e `anoLancamento` (private)
    - [ ] Validar ano entre `ANO_PRIMEIRO_FILME` (1895) e 2026 no setter
    - [ ] Definir `static final int ANO_PRIMEIRO_FILME = 1895`
- [ ] Criar método com retorno que classifica o filme como `"Clássico"` (antes de 2000) ou `"Recente"`
- [ ] Adicionar `static int totalFilmes` e incrementar no construtor
- [ ] Criar menu no console com as opções:
    - [ ] Cadastrar filme
    - [ ] Listar todos os filmes (exibindo a classificação)
    - [ ] Exibir total de filmes no acervo
    - [ ] Sair

---

### 🛵 Delivery da Camila — Exercício 20 (`delivery/`)

- [ ] Criar classe `Marmita` com atributos `descricao` e `tamanho` (P, M ou G)
    - [ ] Definir constantes `static final double PRECO_P = 18.0`, `PRECO_M = 25.0`, `PRECO_G = 32.0`
    - [ ] Criar método com retorno `double getPreco()` baseado no tamanho
- [ ] Criar classe `Pedido` com `nomeCliente` e referência à `Marmita`
    - [ ] Adicionar `static int totalPedidos` e incrementar no construtor
- [ ] Criar método `static double calcularTotalVendido()` que soma o valor de todos os pedidos
- [ ] Criar menu no console com as opções:
    - [ ] Cadastrar marmita no cardápio
    - [ ] Registrar pedido (cliente escolhe marmita)
    - [ ] Listar pedidos do dia
    - [ ] Exibir total de pedidos e valor total vendido
    - [ ] Sair

---

## 📌 Regras de entrega

- Cada exercício deve ter um **commit separado** com a mensagem `"exercicio X"`
- Explicações teóricas devem ser feitas em **comentários Java** (`//` ou `/* */`)
- Entregar o **link do repositório** via Moodle