package Pilha;

import com.sun.source.tree.ArrayAccessTree;

import java.util.Arrays;

public class ArrayStack<E> implements Stack<E> {
    private int top = -1;
    private int capacity;
    private E[] array;
    private static final int INITCAPACITY = 10;

    public ArrayStack(int cap){
        this.capacity = cap;
        array = (E[]) new Object[capacity];
    }
    public ArrayStack(){
     this(INITCAPACITY);
    }
    public int showCapacity(){
        return this.capacity;
    }

    public int size() {
        return top;
    }


    public boolean isEmpty() {
        return (top == -1);
    }


    public E top() throws EmptyStackException {
        if(isEmpty()) throw new EmptyStackException("Empty stack");
        return array[top];
    }


    public void push(E e) {
        if (size() == capacity) resize(capacity * 2);
        top++;
        array[top] = e;
    }

    public E pop() throws EmptyStackException {
        if (isEmpty()) throw new EmptyStackException("Underflow");
        E item = array[top];
        top--;
        if (size() > 0 && size() == capacity/4) resize(capacity/2);
        return item;
    }
    public void resize(int newSize){
        capacity = newSize;
        E[] temp = (E[])new Object[newSize];
        for (int i = 0; i <= top; i++) {
            temp[i] = array[i];
        }
        array = temp;
    }
}
