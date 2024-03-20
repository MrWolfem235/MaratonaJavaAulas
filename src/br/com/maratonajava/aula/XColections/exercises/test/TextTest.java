package br.com.maratonajava.aula.XColections.exercises.test;

import br.com.maratonajava.aula.XColections.exercises.domain.Text;

import java.util.Map;

public class TextTest {
    public static void main(String[] args) {
        String content = "Ótimo que você esteja estudando estruturas de dados em Java! A prática é fundamental para a consolidação do aprendizado. Aqui estão alguns exercícios que você pode usar para praticar:\n" +
                "\n" +
                "Manipulação de Listas:\n" +
                "\n" +
                "Implemente um programa que recebe uma lista de números inteiros e remove os elementos duplicados, mantendo a ordem original.\n" +
                "Crie um método para inverter a ordem dos elementos em uma lista.\n" +
                "Pilhas e Filas:\n" +
                "\n" +
                "Implemente um verificador de expressões matemáticas que valide se os parênteses estão balanceados usando uma pilha.\n" +
                "Simule a execução de uma fila de impressão, onde diferentes documentos têm prioridades diferentes.\n" +
                "Mapas (HashMap, TreeMap, etc.):\n" +
                "\n" +
                "Crie um programa que conte a frequência de palavras em um texto usando um HashMap.\n" +
                "Implemente um dicionário simples utilizando um TreeMap para manter as palavras ordenadas.\n" +
                "Árvores:\n" +
                "\n" +
                "Implemente uma árvore binária de busca (Binary Search Tree - BST) e realize operações de inserção, remoção e busca.\n" +
                "Escreva um método para percorrer uma árvore binária em ordem, pré-ordem e pós-ordem.\n" +
                "Grafos:\n" +
                "\n" +
                "Represente um grafo direcionado ou não direcionado usando uma matriz de adjacência ou lista de adjacência.\n" +
                "Implemente um algoritmo de busca em largura (BFS) ou busca em profundidade (DFS) em um grafo.\n" +
                "Ordenação e Busca:\n" +
                "\n" +
                "Implemente algoritmos de ordenação como o Bubble Sort, Selection Sort, Merge Sort ou Quick Sort.\n" +
                "Escreva um programa que realize buscas binárias em um array ordenado.\n" +
                "Hashing:\n" +
                "\n" +
                "Crie uma tabela hash simples para armazenar pares chave-valor e implemente operações de inserção, remoção e busca.\n" +
                "Implemente uma função de hash para uma estrutura de dados específica.\n" +
                "Concorrência:\n" +
                "\n" +
                "Utilize o ConcurrentHashMap para implementar um contador concorrente que pode ser acessado por várias threads simultaneamente.\n" +
                "Explore situações de concorrência e resolva problemas típicos usando estruturas de dados concorrentes.\n" +
                "Outras Estruturas:\n" +
                "\n" +
                "Implemente uma fila de prioridade usando uma heap.\n" +
                "Explore a implementação de uma estrutura de Union-Find para resolver problemas de conjunto disjunto.\n" +
                "Lembre-se de que a prática constante é fundamental para aprofundar seus conhecimentos em estruturas de dados e algoritmos. Além dos exercícios propostos, considere também participar de desafios online, onde você pode aplicar esses conceitos em problemas do mundo real. Sites como HackerRank, LeetCode e CodeSignal oferecem uma variedade de problemas para praticar. Boa sorte!\n" +
                "\n" +
                "\n" +
                "\n";
        Text text1 = new Text(content);

        for (Map.Entry<String, Integer> entry : text1.getWordBiggerThenOcurrencies(5).entrySet()){
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(String.format("[ %20s ] -> %s",key,value));
        }
    }
}
