package AlgoritmosOrdenação;

import java.util.Scanner;

public class TesteOrdenação {
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
    }
}
