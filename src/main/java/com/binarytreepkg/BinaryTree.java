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

    public static void main(String[] args) {

    }

}
