package AlgoritmosOrdenação;

public class BubbleSort {
    public int[] bubbleSort(int[] lista){
        int [] listaOrdenada = new int[lista.length];
        for (int i = 0; i < lista.length ; i++) {
            for (int j = 0; j < lista.length ; j++) {
                if(lista[i] > lista[i+1]){
                    int temp = lista[i];
                    lista[i] = lista[i+1];
                    lista[i+1] = temp;
                }
            }
        }
        return listaOrdenada;
    }
}
