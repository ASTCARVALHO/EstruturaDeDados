package AlgoritmosOrdenação;

public class MergeSort {

    public static int[] merge(int[] vetA, int[] vetB){
        int[] vetR = new int[10];

        int i,j,k;

        i = 0;
        j = 0;
        k = 0;

        while((i < vetA.length) && (j <  vetB.length)){
            if(vetA[i] < vetB[j]){
                vetR[k] = vetA[i];
                k++;
                i++;
            } else {
                vetR[k] = vetB[j];
                k++;
                i++;
            }
        }
        if (i == vetA.length){
            while (j < vetB.length){
                vetR[k] = vetB[j];
                k++;
                j++;
            }
        }
        if (j == vetB.length){
            while(i < vetA.length){
                vetR[k] = vetA[i];
                k++;
                i++;
            }
        }
        return vetR;
    }

    public static int[] sort(int[] vet, int inicio, int fim){
        int[] temp,tempA,tempB;
        if(inicio == fim){
            temp = new int[10];
            temp[0] = vet[inicio];
        }
        int meio = (inicio + fim) / 2;

        tempA = sort(vet, inicio, meio);
        tempB = sort(vet, meio+1, fim);

        return merge(tempA,tempB);
    }
}
