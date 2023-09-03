package Lista;

public class ArrayQueue <E> implements Queue<E> {
    private int head = 0;
    private int tail = 0;
    private int capacity;
    private E[] array;
    public ArrayQueue(int cap){
        capacity = cap;
        array = (E[]) new Object[capacity];
    }
    public int size() {
        return (capacity - head + tail) % capacity;
    }

    public boolean isEmpty() {
        return head == tail;
    }
    public boolean isFull() {
        return false;
    }


    public E front() throws EmptyQueueException {
        return array[head];
    }


    public void enqueue(E e) {
        array[tail] = e;
       tail = (tail+1) % size();
       if(size() == array.length) resize(capacity * 2);

    }

    public E dequeue() throws EmptyQueueException {
        E e = array[head];
        head = (head +1) % size();
        if(size() > 0 && size() == array.length/4) resize(capacity /2);

        return e;
    }
    public void resize(int newSize){
        capacity = newSize;
        int size = size();
        E[] temp = (E[]) new Object[newSize];
        for (int i = 0; i < size() ; i++) {
            temp[i] = array[(i + head) % capacity];
        }
        array  = temp;
        head = 0;
        tail = size;
    }
}
