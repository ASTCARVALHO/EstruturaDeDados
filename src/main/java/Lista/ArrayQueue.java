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
        return array.length;
    }


    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public boolean isFull() {
        return false;
    }


    public E front() throws EmptyQueueException {
        return array[head];
    }


    public void enqueue(E e) {
        count ++;
        array[tail] = e;
       tail = (tail+1) % size();
       if(count == array.length) resize(capacity * 2);

    }


    public E dequeue() throws EmptyQueueException {
        count --;
        E e = array[head];
        head = (head +1) % size();
        if(count > 0 && count == array.length/4) resize(capacity /2);

        return e;
    }
    public void resize(int newSize){
        E[] temp = (E[]) new Object[newSize];
        for (int i = 0; i < count -1; i++) {
            temp[i] = array[(i + head) % capacity];
        }
        array  = temp;
        head = 0;
        tail = 0;
    }
}
