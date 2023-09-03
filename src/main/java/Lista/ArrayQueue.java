package Lista;

public class ArrayQueue <E> implements Queue<E> {
    private int head = 0;
    private int tail = 0;
    private int capacity;
    private static final int INITCAPACITY = 10;
    private E[] array;
    public ArrayQueue(int cap){
        capacity = cap;
        array = (E[]) new Object[capacity];
    }
    public ArrayQueue(){
        capacity = INITCAPACITY;
        array = (E[]) new Object[capacity];
    }
    // retorna a quantidade de elementos
    public int size() {
        return (capacity - head + tail) % capacity;
    }
    //verifica se o head e tail são iguais o que indica que a fila esta vazia
    public boolean isEmpty() {
        return head == tail;
    }
    // todo
    public boolean isFull() {
        return size() == array.length;
    }
    //Mostra o primeiro elemento da fila
    public E front() throws EmptyQueueException {
        if (isEmpty()) throw new EmptyQueueException("Empty queue");
        return array[head];
    }
    /*
    * recebe um ‘item’ qualquer a ser adicionado na fila
    * verifica se a quantidade de elementos é igual à capacidade do array
    * caso seja igual, chama o método resize para redimensionar a fila
    * armazena o ‘item’ na posição tail do array
    * e incremeta o tail
    * */
    public void enqueue(E e) {
        if(size() == capacity-1) resize(capacity * 2);
        array[tail] = e;
       tail = (tail+1) % capacity;
    }
    public E dequeue() throws EmptyQueueException {
        if (isEmpty()) throw new EmptyQueueException("Empty queue");
        E e = array[head];
        head = (head +1) % size();
        if(size() > 0 && size() == (capacity-1)/4) resize(capacity /2);
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
