package org.example;

public class QueueADT<Type>{

    int front, back, size;
    Type[] elements;

    public QueueADT(int size) {
        this.size = size;
        this.elements = (Type[]) new Object[size];
        this.front = 0;
        this.back = 0;
    }

    public void enqueue(Type elementToEnqueue){
        if(!isFull()){
            elements[back] = elementToEnqueue;
            back++;
        }
    }
    public Type dequeue() {
        if (!isEmpty()) {
            Type elementRetrieve = elements[front];
            front = (front + 1) % size;
            System.out.println(elementRetrieve + " is retrieved ");
            return elementRetrieve;
        } else {
            System.out.println("Queue is empty");
            return null;
        }
    }
    public boolean isEmpty(){
        return front == back;
    }
    public boolean isFull(){
        return back - front == size;
    }

    public void display(){
        System.out.print("Elements ");
        for(int i = front; i < back; i++){
            System.out.print(elements[i] + " ");
        }
    }
    public void shiftQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty, nothing to shift");
            return;
        }

        int count = (back - front + size) % size;
        int mid = count / 2;
        for (int i = 0; i < mid; i++) {
            Type temp = dequeue();
            enqueue(temp);
        }
    }

    public static void main(String[] args) {
        QueueADT<String> strings = new QueueADT<>(3);

        strings.enqueue("Josue");
        strings.enqueue("Jo");
        strings.enqueue("sue");
        strings.display();

        System.out.println();
        System.out.println();
      strings.dequeue();
        System.out.println();
        strings.display();

    }
}
