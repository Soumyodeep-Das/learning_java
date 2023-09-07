import java.util.*;

public class J015_selection_sort {
    public static void selectionSort(int[] array, int arraySize){
        int minimum, temp;
        for(int i=0; i<arraySize; i++){
            minimum=i;
            for(int j=i; j<arraySize; j++){
                if(array[minimum]>array[j])
                    minimum=j;
            }
            temp=array[minimum];
            array[minimum]=array[i];
            array[i]=temp;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nSelection Sort");
        System.out.print("\nEnter size of array : ");
        int arraySize=sc.nextInt();
        int[] array = new int[arraySize];
        System.out.println("\nEnter numbers to sort : ");
        for(int i=0; i<arraySize; i++){
            array[i]=sc.nextInt();
        }
        selectionSort(array, arraySize);
        System.out.println("\nThe sorted array is : \n");
        for(int i=0; i<arraySize; i++){
            System.out.print(array[i]+"\t");
        }
        sc.close();
    }
}