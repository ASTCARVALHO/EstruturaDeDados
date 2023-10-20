package Exercicio;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class OrdenaStrings {
    public static void main(String[] args) {
        int qntPalavras = Integer.parseInt(JOptionPane.showInputDialog("Quantas palavras deseja ordenar?"));
        ArrayList<String> palavras = new ArrayList<>();
        for (int i = 0; i < qntPalavras; i++) {
            String palavra = JOptionPane.showInputDialog("Digite a" + i +"a" + " palavra");
            palavras.add(palavra);
        }
        insertionSortArrayList(palavras);
        System.out.println(imprimir(palavras));
    }
    public static void insertionSortArrayList(ArrayList<String> lista) {
        int size = lista.size();
        for (int i = 1; i < size; i++) {
            String pivot = lista.get(i);
            int j = i - 1;

            while (j >= 0 && pivot.length() > lista.get(j).length()) {
                lista.set(j + 1, lista.get(j));
                j--;
            }

            lista.set(j + 1, pivot);
        }
    }

    public static String imprimir(ArrayList<String> palavras){
        String frase = "";
        for (String p: palavras) {
             frase += p + " ";
        }
        return frase;
    }
}

