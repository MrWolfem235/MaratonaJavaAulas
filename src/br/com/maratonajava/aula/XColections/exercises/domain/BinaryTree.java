package br.com.maratonajava.aula.XColections.exercises.domain;

import com.sun.source.tree.Tree;

class TreeNode{
        int key;
        TreeNode left, right;

        public TreeNode(int key) {
            this.key = key;
            left = right = null;
        }
    }

    public class BinaryTree {
        TreeNode root = null;

        public void insert(int key) {
            root = recursiveInsert(root, key);
        }

        public int search(int key){
            TreeNode findNode = recursiveSearch(root, key);
            if(findNode == null){
                System.out.println("Valor não encontrado!");
                return -1;
            }else{
                System.out.println("Valor encontrado!");
                return findNode.key;
            }
        }



        public int remove(int key){
            return recursiveRemove(root, key).key;
        }

        public TreeNode recursiveRemove(TreeNode root, int key) {
            if (root == null) {
                return null;
            }

            if (key < root.key) {
                root.left = recursiveRemove(root.left, key);
            } else if (key > root.key) {
                root.right = recursiveRemove(root.right, key);
            } else {
                // Node with only one child or no child
                if (root.left == null) {
                    return root.right;
                } else if (root.right == null) {
                    return root.left;
                }

                // Node with two children: Get the inorder successor (smallest in the right subtree)
                root.key = minValue(root.right);

                // Delete the inorder successor
                root.right = recursiveRemove(root.right, root.key);
            }

            return root;
        }

        private int minValue(TreeNode root) {
            int minValue = root.key;
            while (root.left != null) {
                minValue = root.left.key;
                root = root.left;
            }
            return minValue;
        }

        private TreeNode recursiveSearch(TreeNode root, int key){
            if (root == null || root.key == key){
                return root;
            }
            return key < root.key ? recursiveSearch(root.left, key) : recursiveSearch(root.right, key);
        }

        private TreeNode recursiveInsert(TreeNode root, int key){
            if (root == null){
                root = new TreeNode(key);
                return root;
            }

            if(key < root.key){
                root.left = recursiveInsert(root.left, key);
                return root;
            } else if(key > root.key){
                root.right = recursiveInsert(root.right, key);
                return root;
            }
            return root;
        }


    }
