package org.example;

import java.lang.reflect.Type;

class Node<Type>{
    private Type element;
    private Node next;
    public Node(){
        this(null, null); // when we don't have any data we can still initialize a node;
    }

    public Node(Type element, Node next) {
        this.element = element;
        this.next = next;
    }

    public void setElement(Type element) {
        this.element = element;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Object getElement() {
        return element;
    }

    public Node getNext() {
        return next;
    }
}
public class LinkedListADT<Type>{
    private Node head;
    private int size;

    public LinkedListADT() {
        this.size = 0;
        this.head = null;

    }

    public boolean isLinkEmpty(){
        return this.head == null;
    }
    public void insetFirstElement(Type value){
        Node<Type> newNode = new Node(value, this.head);
        head = newNode;
    }
}
