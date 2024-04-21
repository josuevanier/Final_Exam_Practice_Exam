package org.example;

class Node{
    private Object element;
    private Node next;
    public Node(){
        this(null, null); // when we don't have any data we can still initialize a node;
    }

    public Node(Object element, Node next) {
        this.element = element;
        this.next = next;
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

}
