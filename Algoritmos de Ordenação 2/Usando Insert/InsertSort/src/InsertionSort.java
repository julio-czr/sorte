
public class InsertionSort{
    public static void insertionSort(int[] array) {
        int tamanho = array.length;
        for (int i = 1; i < tamanho; i++) {
            int key = array[i];

            int j;
            for(j=i-1; j>=0 && array[j]>key;j--){
                array[j + 1] = array[j];
            }
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }

            array[j + 1] = key;
        }
    }

}