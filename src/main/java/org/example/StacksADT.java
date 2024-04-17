package org.example;

public class StacksADT<Type>{
    int size;
    int top;
    Type[] arrays;

    public StacksADT(int size) {
        this.size = size;
        this.top = -1;
        this.arrays = (Type[]) new Object[size];
    }
    public void push(Type elementToPush){
        if(top + 1 >= size){
            System.out.println("Stack is full");
        }else {
            top++;
            arrays[top] = elementToPush;
        }
    }
    public void pop(){
        if(!isEmpty()){
            Type elementRemoved = arrays[top];
            top--;
            System.out.println("Element" + elementRemoved +"has been removed !");
        }else System.out.println("Stack is empty cannot pop !");
    }
    public void display(){
        if(!isEmpty()) {
            System.out.print(" Elements are: ");
            for (int i = top; i >= 0; i--) {
                System.out.print( arrays[i] + " ");
            }
        }
    }

    public void peek(){
        System.out.println(arrays[top]);
    }
    public boolean isEmpty(){
        return this.top == -1;
    }

    public static void main(String[] args) {
        StacksADT<Integer> integerStacksADT = new StacksADT<>(5);

        integerStacksADT.push(1);
        integerStacksADT.push(2);
        integerStacksADT.push(13);
        integerStacksADT.push(23);
        integerStacksADT.display();

        System.out.println();

        integerStacksADT.pop();
        integerStacksADT.display();

    }
}
