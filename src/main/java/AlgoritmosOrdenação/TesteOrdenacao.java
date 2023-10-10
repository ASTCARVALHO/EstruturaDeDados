package AlgoritmosOrdenação;

import java.util.Scanner;


public class TesteOrdenacao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Tamanho da lista");
        int tamLista = input.nextInt();
        int[] lista = new int[tamLista];
        for (int i = 0; i < tamLista; i++) {
            System.out.println("Numero:");
            int numero = input.nextInt();
            lista[i] = numero;
        }
        InsertionSort.insertionSort(lista);
        for (int i: lista) {
            System.out.println(i);
        }
    }
}
