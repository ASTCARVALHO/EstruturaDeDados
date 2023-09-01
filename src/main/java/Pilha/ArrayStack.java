package Pilha;

import com.sun.source.tree.ArrayAccessTree;

import java.util.Arrays;

public class ArrayStack<E> implements Stack<E> {
    private int top = -1;
    private int capacity;
    private E[] array;
    private static final int CAPACITY = 1000;

    public ArrayStack(int cap){
        this.capacity = cap;
        array = (E[]) new Object[capacity];
    }
    public ArrayStack(){
     this(CAPACITY);
    }

    public int size() {
        return top++;
    }


    public boolean isEmpty() {
        return (top == -1);
    }


    public E top() throws EmptyStackException {
        if(isEmpty()) throw new EmptyStackException("Empty stack");
        return array[top];
    }


    public void push(E e) {
        if (top == capacity) resize(capacity * 2);
        top++;
        array[top] = e;
    }

    public E pop() throws EmptyStackException {
        if (isEmpty()) throw new EmptyStackException("Underflow");
        if (top > 0 && top++ == capacity/4) resize(capacity/2);
        E item = array[top];
        top--;
        return item;
    }
    public void resize(int newSize){
        E[] temp = (E[])new Object[newSize];
        for (int i = 0; i <= top; i++) {
            temp[i] = array[i];
        }
        array = temp;
    }
}
