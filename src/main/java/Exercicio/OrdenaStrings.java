package Exercicio;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class OrdenaStrings {
    public static void main(String[] args) {
        String textoTemp = JOptionPane.showInputDialog("Digite a frase");
        String[] texto = textoTemp.split(" ");
        insertionSortArrayList(texto);
        System.out.println(imprimir(texto));
    }
    public static void insertionSortArrayList(String[] texto) {
        int size = texto.length;
        for (int i = 1; i < size; i++) {
            String pivot = texto[i];
            int j = i - 1;

            while (j >= 0 && pivot.length() > texto[j].length()) {
                texto[j+1] = texto[j];
                j--;
            }


            texto[j+1] = pivot;
        }
    }

    public static String imprimir(String[] texto){
        String frase = "";
        for (String t: texto) {
             frase += t + " ";
        }
        return frase;
    }
}

