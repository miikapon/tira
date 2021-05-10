/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package btree;

/**
 *
 * @author kamaj
 */
public class BinaryTree {

    private Node root;

    public BinaryTree(String rootValue) {
        root = new Node(rootValue);
    }

    public BinaryTree() {
        root = null;
    }

    /*public BinaryTree(String rootValue, BinaryTree left, BinaryTree right){
        root = new Node(rootValue, left, right);
    } */
    public void insert(String aData) {
        if (root == null) { //onko puu tyhjä?
            root = new Node(aData);
        } else if (root.getData().compareTo(aData) > 0) { //onko rootin avain > uusi avain?

            if (root.left() != null) { // yritetään mennä vasemmalle
                root.left().insert(aData);
            } else {
                root.setLeft(new BinaryTree(aData)); //paikka löytyi

            }
        } else {
            if (root.right() != null) {
                root.right().insert(aData);
            } else {
                root.setRight(new BinaryTree(aData));
            }
        }
    }

    public BinaryTree find(String value) {
        BinaryTree tree;
        if (root == null) {
            return null;
        }
        if (value.compareTo(root.getData()) == 0) {
            tree = new BinaryTree(root.getData());
            return tree;
        } else if (value.compareTo(root.getData()) < 0) {
            tree = root.left();

            if (tree != null) {
                return tree.find(value);
            } else {
                return null;
            }
        } else {
            tree = root.right();
            if (tree != null) {
                return tree.find(value);
            } else {
                return null;
            }
        }
    }

    public void preOrder() {
        if (root != null) {
            System.out.println(root.getData() + ',');
            if (root.left() != null) { // pääseeekö vasemmalle?
                root.left().preOrder();
            }
            if (root.right() != null) { // pääseekö oikealle?
                root.right().preOrder();
            }
        }

    }

    public void inOrder() {
        if (root != null) {
            if (root.left() != null) // pääseeekö vasemmalle?
            {
                root.left().inOrder();
            }
            System.out.println(root.getData() + ',');
            if (root.right() != null) // pääseekö oikealle?
            {
                root.right().inOrder();
            }
        }

    }

    public void setLeft(BinaryTree tree) {
        root.setLeft(tree);
    }

    public void setRight(BinaryTree tree) {
        root.setRight(tree);
    }
}
