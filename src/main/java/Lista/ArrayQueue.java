package Lista;

public class ArrayQueue <E> implements Queue<E> {
    private int head = 0;
    private int tail = 0;
    private int count = 0;
    private int capacity;
    private static final int INITCAPACITY = 10;
    private E[] array;
    public ArrayQueue(int cap){
        capacity = cap;
        array = (E[]) new Object[capacity];
    }
    public ArrayQueue(){
        this(INITCAPACITY);
    }

    public int size() {
        return 0;
    }


    public boolean isEmpty() {
        return count == 0;
    }


    public E front() throws EmptyQueueException {
        return null;
    }


    public void enqueue(E e) {
        array[tail] = e;
        count ++;
       tail = (tail+1) % array.length;

    }


    public E dequeue() throws EmptyQueueException {
        E e = array[head];
        head = (head +1) % array.length;

        return e;
    }
}
