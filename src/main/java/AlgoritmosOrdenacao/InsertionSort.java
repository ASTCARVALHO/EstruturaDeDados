package AlgoritmosOrdenacao;

public class InsertionSort {
        public static void insertionSort(int[] lista){
            int size = lista.length;
            for (int i = 1; i < size; i++) {
                int pivot = lista[i];

                int j = i-1;

                while(j >= 0 && pivot < lista[j]){
                    lista[j+1] = lista[j];
                    j--;
                }
                lista[j+1] = pivot;
            }
        }
}
