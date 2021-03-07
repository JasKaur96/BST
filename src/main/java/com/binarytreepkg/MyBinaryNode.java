package com.binarytreepkg;

public class MyBinaryNode<E extends Comparable<E>> {
    E key;
    public MyBinaryNode leftNode;
    public MyBinaryNode rightNode;
    public MyBinaryNode(E key) {
        this.key = key;
        this.leftNode = null;
        this.rightNode = null;
    }
}
