package Lista;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayQueueTest {
    ArrayQueue arrayQueue;

    @Test
    void enqueueAndDequeue(){
        arrayQueue = new ArrayQueue<>();
        assertEquals(10,arrayQueue.capacity);
        assertEquals(0,arrayQueue.size());
        arrayQueue.enqueue(1);
        assertEquals(1,arrayQueue.size());
        arrayQueue.enqueue(2);
        assertEquals(2,arrayQueue.size());
        assertEquals(1,arrayQueue.dequeue() );

    }
    @Test
    void resize(){
        arrayQueue = new ArrayQueue<>(2);
        assertEquals(2,arrayQueue.capacity);
        arrayQueue.enqueue(1);
        arrayQueue.enqueue(2);
        arrayQueue.enqueue(3);
        arrayQueue.enqueue(4);
        assertEquals(8,arrayQueue.capacity);
        assertEquals(1, arrayQueue.dequeue());
        assertEquals(2,arrayQueue.dequeue());
        assertEquals(4,arrayQueue.capacity);

    }

}