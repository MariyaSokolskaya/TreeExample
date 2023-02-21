package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // TODO создать массив значений для добавления в дерево
        int b[];
        BinaryTreeExample tree = new BinaryTreeExample();
        // добавление элементов массива в дерево
        for (int i = 0; i < b.length; i++)
            tree.insertNode(tree, b[i]);
        // вывод содержимого дерева
        tree.printBinaryTree(tree, 0);
    }
}
