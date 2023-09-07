import java.util.*;

public class J017_importantSorts {
    public static void bubbleSort(int[] array, int arraySize){
        int temp;
        for(int i=0; i<arraySize-1; i++){
            for(int j=0; j<arraySize-i-1; j++){
                if(array[j]>array[j+1]){
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
    }
    public static void selectionSort(int[] array, int arraySize){
        int minimum, temp, j;
        for(int i=0; i<arraySize-1; i++){
            minimum=i;
            for(j=i; j<arraySize; j++){
                if(array[minimum]>array[j])
                    minimum=j;
            }
            temp=array[minimum];
            array[minimum]=array[i];
            array[i]=temp;
        }
    }
    public static void insertionSort(int[] array, int arraySize){
        int current, j;
        for(int i=1; i<arraySize; i++){
            current = array[i];
            for(j=i-1; j>=0 && current<array[j]; j--)
                array[j+1]=array[j];
            array[j+1]=current;
        }
    }
    public static void printArray(int[] array, int arraySize){
        for(int i=0; i<arraySize; i++){
            System.out.print(array[i]+"\t");
        }System.out.println();
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter array size : ");
        int arraySize = sc.nextInt();
        int[] array = new int[arraySize];
        System.out.println("\nEnter numbers : ");
        for(int i=0; i<arraySize; i++){
            array[i]=sc.nextInt();
        }
        bubbleSort(array, arraySize);
        System.out.println("Bubble Sort :");
        printArray(array, arraySize);

        selectionSort(array, arraySize);
        System.out.println("Selection Sort :");
        printArray(array, arraySize);

        insertionSort(array, arraySize);
        System.out.println("Insertion Sort :");
        printArray(array, arraySize);

        sc.close();
    }
}
