package com.binarytreepkg;

public class BinaryTree <E extends Comparable<E>>{
    private BinaryNode<E> root;

    public BinaryTree(){
        this.root = null;
    }
    //Add root
    public void add(E data) {
        this.root = this.addNode(root, data);
    }
    private BinaryNode<E> addNode(BinaryNode<E> current, E data) {
        // When the node is null create new node
        if(current == null) {
            return new BinaryNode<E>(data);
        }
        // if data is less than current node key add to left
        else if(current.key.compareTo(data)>0) {
            current.leftNode = addNode(current.leftNode, data);
        }
        // if data is more than current node key add to right
        else {
            current.rightNode = addNode(current.rightNode, data);
        }
        return current;
    }

    public int size() {
        return this.getSize(root);
    }
    // if no root return 0 else return root count->1 + size of left subtree + size of right subtree
    public int getSize(BinaryNode<E> current) {
        return current == null ? 0 : 1 + this.getSize(current.leftNode) + this.getSize(current.rightNode);
    }

    public static void main(String[] args) {

    }

}
