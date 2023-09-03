package Pilha;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.security.PublicKey;

import static org.junit.jupiter.api.Assertions.*;

class ArrayStackTest {
    ArrayStack array;
    @BeforeEach
    void setup(){
        array = new ArrayStack<>(2);
    }
    @Test
    void pushAndPop(){
        assertEquals(2,array.showCapacity());
        assertTrue(array.isEmpty());
        array.push(5);
        assertFalse(array.isEmpty());
        assertTrue(array.top().equals(5));
        array.push(8);
        assertTrue(array.size() == 2);
        assertEquals(8,array.pop());
        array.pop();
        assertTrue(array.isEmpty());
    }
    @Test
    public void resize(){
        assertEquals(2, array.showCapacity());
        array.push(1);
        array.push(2);
        array.push(3);
        array.push(4);
        assertEquals(4,array.showCapacity());
        array.pop();
        array.pop();
        array.pop();
        assertEquals(2,array.showCapacity());
    }

}