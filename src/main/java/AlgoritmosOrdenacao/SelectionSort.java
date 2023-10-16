package AlgoritmosOrdenacao;

public class SelectionSort {
    public static void selectionSort(int[] lista){
        for (int i = 0; i < lista.length; i++) {
            int min = i;
            for (int j = i+1; j < lista.length; j++) {
               if(lista[j] < lista[min]) min = j;
            }
            if (lista[i] != lista[min]){
               int aux = lista[i];
               lista[i] = lista[min];
               lista[min] =  aux;
            }
        }
    }

}
