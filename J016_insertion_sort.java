import java.util.*;

public class J016_insertion_sort {
    public static void insertionSort(int[] array, int arraySize){
        int current, j;
        for(int i=1; i<arraySize; i++){
            current=array[i];
            for(j=i-1; j>=0 && current<array[j]; j--){
                array[j+1]=array[j];
            }
            array[j+1]=current;
        } 
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nInsertion Sort");
        System.out.print("\nEnter array size : ");
        int arraySize = sc.nextInt();
        int[] array = new int[arraySize];
        System.out.println("\nEnter numbers to sort : \n");
        for(int i=0; i<arraySize; i++){
            array[i]=sc.nextInt();
        }
        insertionSort(array, arraySize);
        System.out.println("\nThe sorted array is : \n");
        for(int i=0; i<arraySize; i++){
            System.out.print(array[i]+"\t");
        }
        sc.close();
    }
}
