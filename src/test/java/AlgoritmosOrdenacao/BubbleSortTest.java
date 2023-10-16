package AlgoritmosOrdenacao;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Random;

class BubbleSortTest {
    int[] numeros;

    BubbleSortTest() {
        numeros = new int[10];
    }
    @Test
    void testaOrdenacao(){
        Random random = new Random();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100);
        }
        System.out.println("Desordenado: ");
        System.out.println(Arrays.toString(numeros));

        BubbleSort.bubbleSort(numeros);

        System.out.println("Ordenado :");
        System.out.println(Arrays.toString(numeros));
    }
}