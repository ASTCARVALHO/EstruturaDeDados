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
        if(isEmpty()) throw new EmptyStackException("Empty");
        return array[top];
    }


    public void push(E e) {

    }

    public E pop() throws EmptyStackException {
        return null;
    }
}
