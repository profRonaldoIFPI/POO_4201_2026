# Programação Orientada a Objetos com Java (POO)

<div align="center">

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![VS Code](https://img.shields.io/badge/VS_Code-007ACC?style=for-the-badge&logo=visual-studio-code&logoColor=white)
![IFPI](https://img.shields.io/badge/IFPI-Campus_Floriano-green?style=for-the-badge)

**Instituto Federal de Educação, Ciência e Tecnologia do Piauí (IFPI) — Campus Floriano**  
**Curso Técnico em Informática Integrado ao Ensino Médio**  
**Disciplina:** Programação Orientada a Objetos (POO)  
**Docente:** Prof. Ronaldo Pereira Barbosa ([@profRonaldoIFPI](https://github.com/profRonaldoIFPI))  

</div>

---

## 📌 Sobre o Repositório

Este repositório centraliza os materiais pedagógicos, códigos-fonte desenvolvidos durante as aulas práticas de laboratório, listas de exercícios, atividades avaliativas e apresentações teóricas da disciplina de **Programação Orientada a Objetos com Java**, ofertada para os estudantes do **Curso Técnico em Informática Integrado ao Ensino Médio** do **IFPI Campus Floriano**.

O objetivo da disciplina é capacitar os alunos na compreensão e aplicação dos princípios fundamentais do paradigma orientado a objetos, desenvolvendo aplicações robustas, organizadas e manuteníveis na linguagem Java.

---

## 📚 Conteúdo Programático

A disciplina contempla os seguintes pilares teóricos e práticos:

1. **Introdução à Linguagem Java**:
   - Estrutura de programas Java, compilação e execução via JVM;
   - Tipos de dados primitivos, operadores lógicos e condicionais;
   - Estruturas de controle de fluxo (decisão e repetição);
   - Sub-rotinas (métodos estáticos) e manipulação de vetores (*arrays*).
2. **Fundamentos da Orientação a Objetos**:
   - O conceito de Classe, Atributo, Método e Instanciação de Objetos;
   - Métodos Construtores e inicialização de instâncias.
3. **Encapsulamento e Modificadores de Acesso**:
   - Ocultamento de informação (`private`, `public`, `protected`);
   - Métodos de acesso (*getters*) e modificadores (*setters*);
   - Validações de integridade de dados.
4. **Relacionamentos e Herança**:
   - Associação entre classes;
   - Reuso de código e hierarquias de generalização/especialização (`extends`);
   - Palavras-chave `super` e `this`.
5. **Polimorfismo e Coleções**:
   - Sobrescrita de métodos (`@Override`);
   - Chamada polimórfica e ligação tardia (*late binding*);
   - Uso de listas dinâmicas com `java.util.ArrayList`.
6. **Classes Abstratas e Interfaces**:
   - Contratos de métodos e classes incompletas (`abstract`);
   - Criação e implementação de interfaces (`interface`, `implements`).
7. **Tratamento de Exceções**:
   - Robustez de software e captura de falhas (`try`, `catch`, `finally`);
   - Lançamento de exceções e propagação (`throw`, `throws`);
   - Criação e manipulação de exceções personalizadas.

---

## 🗂️ Estrutura do Repositório

O repositório está organizado em módulos que separam as atividades práticas, os códigos das aulas expositivas de laboratório e os materiais de estudo:

```
.
├── Atividade_4/                                  # Atividade prática: Classes, Atributos e Métodos
├── Atividade_5/                                  # Atividade prática: Encapsulamento e Modelagem
├── Atividade_6/                                  # Atividade prática: Polimorfismo e Coleções (Folha de Pagamento)
├── Atividade_7/                                  # Atividade prática: Herança, Polimorfismo e Sobrescrita (Controle de Frota)
├── Aula_0605/                                    # Aula prática: Introdução a Classes e Objetos
├── Aula_1505/                                    # Aula prática: Construtores e Instâncias
├── Aula_0708_Heranca/                            # Aula prática: Herança (Sistema Bancário)
├── Aula_1208_Heranca_Polimorfismo/               # Aula prática: Polimorfismo com Formas Geométricas
├── Aula_0209_Classes Abstratas e Interfaces/     # Aula prática: Classes Abstratas e Interfaces
├── Aula_2110_Tratamento de Excecoes/             # Aula prática: Tratamento de Exceções em Java
├── Referencias/                                  # Materiais complementares e referências de estudo
├── Slides das aulas/                             # Apresentações teóricas em PDF
└── README.md                                     # Visão geral do repositório
```

### 📝 Atividades

- **[Atividade_4](./Atividade_4)**: Modelagem de classes cotidianas e métodos de negócios (`Smartphone`, `Paciente`, `Musica`, `Post`).
- **[Atividade_5](./Atividade_5)**: Prática de encapsulamento, estados privados e regras de negócio com as classes `Pessoa`, `Funcionario` e `Produto`.
- **[Atividade_6](./Atividade_6)**: Implementação de folha de pagamento aplicando generalização, polimorfismo e listas com `ArrayList`, envolvendo classes `Funcionario`, `Gerente` e `Vendedor`.
- **[Atividade_7](./Atividade_7)**: Sistema de gerenciamento e testes de frotas com `Veiculo`, `CarroDePasseio` e `Caminhao`, explorando herança e métodos estáticos.

### 💻 Aulas Práticas (Laboratório)

- **[Aula_0605](./Aula_0605)**: Primeiros passos na definição de classes e instanciação (`ExemploClasseObjeto`).
- **[Aula_1505](./Aula_1505)**: Construtores, métodos e separação de responsabilidades (`Aula1_POO`).
- **[Aula_0708_Heranca](./Aula_0708_Heranca)**: Herança com contas bancárias (`ContaBancaria` e `ContaCorrente`).
- **[Aula_1208_Heranca_Polimorfismo](./Aula_1208_Heranca_Polimorfismo)**: Polimorfismo aplicado ao cálculo de áreas de formas geométricas bidimensionais (`Circulo`, `Quadrado`, `TrianguloRetangulo`).
- **[Aula_0209_Classes Abstratas e Interfaces](./Aula_0209_Classes%20Abstratas%20e%20Interfaces)**: Definição de métodos abstratos e regras de desenho/cálculo com `Forma2d`.
- **[Aula_2110_Tratamento de Excecoes](./Aula_2110_Tratamento%20de%20Excecoes)**: Manipulação de erros em tempo de execução, captura de `IllegalArgumentException` e `ArrayIndexOutOfBoundsException`.

### 📑 Slides Teóricos

Localizados no diretório [`Slides das aulas/`](./Slides%20das%20aulas):

- `Aula 1 - Introdução à Java.pdf`
- `Aula 1.1 - Dominando_o_Tipo_Boolean.pdf`
- `Aula 2 - Java_Decision_Logic.pdf`
- `Aula 2.2 - Mastering_Java_Functions.pdf`
- `Aula 3 - Java_Loops_and_Arrays.pdf`
- `Aula 4 - Java_OOP_Fundamentals.pdf`
- `Aula 5 - Java_Classes_and_Objects.pdf`
- `Aula 5.1 - Java_Object_Creation.pdf`
- `Aula 6 - Java_Encapsulation_Architecture.pdf`
- `Aula 8 - Polimorfismo.pdf`
- `Aula 8.1 - Arrays, ArrayList e polimorfismo.pdf`
- `Aula 9 - Classes Abstratas e Interfaces.pdf`
- `Aula 10 - Tratamento_de_Exceções.pdf`

---

## 🛠️ Requisitos e Ambiente de Desenvolvimento

Para compilar e executar os projetos disponíveis neste repositório:

- **JDK (Java Development Kit)**: Versão 21 ou superior instalada.
- **IDE / Editor**: [Visual Studio Code](https://code.visualstudio.com/) com a extensão **[Extension Pack for Java](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack)** da Microsoft.
- **Git**: Para clonagem e versionamento de código.

### Como Executar uma Atividade ou Aula no VS Code

1. Clone o repositório em seu ambiente local:

   ```bash
   git clone https://github.com/profRonaldoIFPI/POO_4201_2026.git
   ```

2. Abra a pasta do repositório no VS Code:

   ```bash
   code POO_4201_2026
   ```

3. Navegue até o arquivo principal (`App.java`) do projeto desejado (ex.: `Atividade_6/src/App.java`).
4. Clique no botão **Run** acima do método `main`, ou pressione `F5` para depuração.

---

## Docente Responsável

- **Professor:** Ronaldo Pires Borges
- **Instituição:** Instituto Federal do Piauí — Campus Floriano
- **GitHub:** [@profRonaldoIFPI](https://github.com/profRonaldoIFPI)
