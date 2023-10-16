package AlgoritmosOrdenacao;

public class QuickSort {
    public static void quickSort(int[] vet, int inicio, int fim) {
        int i = inicio;
        int j = fim;
        int pivotIndice = (inicio + fim) / 2;
        int pivot = vet[pivotIndice];

        while (i <= j) {
            while (vet[i] < pivot) i++;
            while (vet[j] > pivot) j--;

            if (i <= j) {
                int temp = vet[i];
                vet[i] = vet[j];
                vet[j] = temp;
                i++;
                j--;
            }
        }

        if (j > inicio) quickSort(vet, inicio, j);
        if (i < fim) quickSort(vet, i, fim);
    }

}
