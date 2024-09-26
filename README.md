# Árvore Binária de Busca em Java

Este projeto implementa uma **Árvore Binária de Busca** em Java, sem o uso de bibliotecas externas. O projeto oferece funcionalidades básicas de inserção, busca, remoção e impressão dos nós da árvore.

## Descrição

Uma **Árvore Binária de Busca** é uma estrutura de dados que organiza os elementos de forma hierárquica, onde cada nó possui até dois filhos: um filho à esquerda e um filho à direita. Os valores à esquerda de um nó são sempre menores que o valor do nó, enquanto os valores à direita são sempre maiores ou iguais. Isso permite realizar operações como busca, inserção e remoção de forma eficiente.

### Estrutura do Projeto

O projeto possui as seguintes funcionalidades:
- **Inserção**: Insere um novo valor na árvore, garantindo a propriedade de ordem binária.
- **Busca**: Verifica se um determinado valor existe na árvore.
- **Remoção**: Remove um valor da árvore e reorganiza a estrutura, se necessário.
- **Impressão**: Exibe a árvore de forma visual, mostrando a hierarquia dos nós.

## Exemplo de Uso

### Como Usar

1. **Baixe ou clone este repositório**.
2. Compile e execute o arquivo:
   ```bash
   javac BinaryTree.java
   java BinaryTree

3. **Escolha a operação desejada**:
   - Após a execução do programa, o sistema solicitará que o usuário selecione uma operação:
     1) Inserção
     2) Busca
     3) Remoção
     4) Impressão

### Exemplo de Execução

Ao executar o programa, você poderá realizar operações de inserção, busca, remoção e visualização da árvore. Abaixo está um exemplo de como a árvore pode ser representada após inserções:

```plaintext
     20
 10      30
5   15  25   35
```

Se você remover o valor 10, a árvore será reorganizada da seguinte forma:

```plaintext
        20
    15      30
  5       25   35
```

## Requisitos

- **Java JDK**: O código foi escrito em Java e requer o JDK instalado para compilação e execução.
