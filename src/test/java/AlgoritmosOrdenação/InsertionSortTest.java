package AlgoritmosOrdenação;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

class InsertionSortTest {
    int[] numeros;

    InsertionSortTest(){
        numeros = new int[10];
    }

    @Test
    void testeOrdenacao(){
        Random random = new Random();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100);
        }
        System.out.println("Desordenado: ");
        System.out.println(Arrays.toString(numeros));

        InsertionSort.insertionSort(numeros);

        System.out.println("Ordenado");
        System.out.println(Arrays.toString(numeros));
    }
}