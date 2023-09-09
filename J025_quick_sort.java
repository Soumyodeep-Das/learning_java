import java.util.Scanner;

public class J025_quick_sort {
    public static int partition(int[] array, int low, int high){
        int pivot = array[high];
        int i=low-1;
        for(int j=low; j<high; j++){
            if(array[j]<pivot){
                i++;
                swap(array, i, j);
            }
        }
        i++;
        swap(array, i, high);
        return i;
    }
    public static void swap(int[] array, int a, int b){
        int temp = array[a];
        array[a] = array[b];
        array[b]= temp;
    }
    public static void quickSort(int[] array, int low, int high){
        if(low<high){
            int pivotIndex = partition(array, low, high);
            quickSort(array, low, pivotIndex-1);
            quickSort(array, pivotIndex+1, high);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter size of array : ");
        int arraySize = sc.nextInt();
        System.out.println("\nEnter numbers to sort : ");
        int[] array = new int[arraySize];
        for(int i=0; i<arraySize; i++){
            array[i]=sc.nextInt();
        }
        quickSort(array, 0, arraySize-1);
        System.out.println("\nSorted array : \n");
        for(int i=0; i<arraySize; i++){
            System.out.print(array[i]+"\t");
        }
        sc.close();
    }
}
