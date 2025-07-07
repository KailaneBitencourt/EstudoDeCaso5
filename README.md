# Estudo de Caso 5: Sistema Escolar

## 📚 Descrição
Este projeto simula um sistema simples de gerenciamento de pessoas em uma escola, utilizando os conceitos de **orientação a objetos**, como **herança**, **classe abstrata** e **polimorfismo**.

## 🧠 Cenário
Uma escola precisa gerenciar as pessoas que fazem parte de sua comunidade escolar. Todas as pessoas possuem `nome` e `cpf`, mas podem ser:

- **Professores**, que têm também a `disciplina` que lecionam.
- **Alunos**, que possuem um número de `matrícula`.

## 🧱 Estrutura do Projeto

### Classe Abstrata
- **Pessoa**
  - Atributos: `nome`, `cpf`
  - Método abstrato: `exibirDados()`

### Subclasses
- **Professor**
  - Atributo adicional: `disciplina`
  - Implementação do método `exibirDados()`
- **Aluno**
  - Atributo adicional: `matricula`
  - Implementação do método `exibirDados()`

## ✅ Funcionalidades
- Criação de uma lista mista com objetos de `Professor` e `Aluno`.
- Exibição dos dados de cada pessoa da lista utilizando **polimorfismo**, ou seja, chamando o método `exibirDados()` de forma genérica.




