package br.com.maratonajava.aula.XColections.exercises.test;

import br.com.maratonajava.aula.XColections.exercises.domain.BinaryTree;

public class BinaryTreeTest01 {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        int binaryNodes = 10_000;
        System.out.println("Montando árvore...");
        for (int i = 0; i < binaryNodes ;i++){
            binaryTree.insert(i);
        }
        System.out.println("Árvore montada! com "+binaryNodes+" nós");

        System.out.println(binaryTree.search(100));

        binaryTree.remove(99999);

        System.out.println(binaryTree.search(100));
    }
}
