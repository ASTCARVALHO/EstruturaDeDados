package AlgoritmosOrdenacao;

public class BubbleSort {
    public static void bubbleSort(int[] lista){
        for (int i = 0; i < lista.length -1 ; i++) {
            for (int j = 0; j < lista.length -1 ; j++) {
                if(lista[j] > lista[j+1]){
                    int temp = lista[j];
                    lista[j] = lista[j+1];
                    lista[j+1] = temp;
                }
            }
        }
    }
}
