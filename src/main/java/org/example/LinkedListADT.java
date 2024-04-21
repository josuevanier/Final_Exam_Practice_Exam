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

    public Type getElement() {
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
        size++;
    }
    public void insetAtLast(Type value){
        Node<Type>  n,t;
        n = new Node<>();
        n.setElement(value);
        t = head;
        if(head == null){
            head = n;
        }else {
            t = new Node<>();
            while (t.getNext() != null) {
                t = t.getNext();
            }
            t.setNext(n);
        }
        size++;
    }
    public void insertMiddleOrPosition(int index, Type value){
        if(index >= size && index < 0) System.out.println("Invalid index");
        if(index == 0) insetFirstElement(value);
        else if(index == size - 1) insetAtLast(value);
        else {
            Node<Type> n,t;
            n = new Node<>(value,null); // to hold the value, no reference yet
            t = this.head; // traversing the list

            for(int i = 0; i < index; i++){
                t = t.getNext(); // has access to the next reference, a curent pointer
            }
            n.setNext(t);
            t.setNext(n);
            size++;
        }
    }
}
