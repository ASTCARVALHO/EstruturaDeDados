package AlgoritmosOrdenacao;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

class QuickSortTest {
    int[] numeros;
    QuickSortTest(){
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

        QuickSort.quickSort(numeros, 0 , numeros.length -1);

        System.out.println("Ordenado");
        System.out.println(Arrays.toString(numeros));
    }

}