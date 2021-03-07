package com.binarytreepkg;

public class BinaryTree <E extends Comparable<E>>{
    private MyBinaryNode<E> root;

    public BinaryTree(){
        this.root = null;
    }
    //Add root
    public void add(E data) {
        this.root = this.addNode(root, data);
    }

    private MyBinaryNode<E> addNode(MyBinaryNode<E> current, E data) {
        // When the node is null create new node
        if(current == null) {
            return new MyBinaryNode<E>(data);
        }
        //If element is less than current node key add to left
        else if(current.key.compareTo(data)>0) {
            current.leftNode = addNode(current.leftNode, data);
        }
        // If element is greater than current node key add to right
        else {
            current.rightNode = addNode(current.rightNode, data);
        }
        return current;
    }

    public static void main(String[] args) {

    }

}
