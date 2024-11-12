
import java.io.IOException;

public class OrdenacaoApp {
    public static void main(String[] args) {
        int[] array = {7, 12, 35, 1, 29, 17, 20} ;
        QuickSort.quickSort(array);
        System.out.println("\nArray ordenado:");
            for (int num : array) {
                System.out.print(num + " ");
            }
       
    
}}

