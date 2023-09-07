import java.util.*;

public class J014_bubble_sort {
    public static void bubbleSort(int[] array, int arraySize){
        for(int i=0; i<arraySize-1; i++){
            for(int j=0; j<arraySize-i-1; j++){
                if(array[j]>array[j+1]){
                    int temp = array[j+1];
                    array[j+1]=array[j];
                    array[j]=temp;
                }
            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nBubble Sort");
        System.out.print("\nEnter size of Array : ");
        int arraySize = sc.nextInt();
        int[] array = new int[arraySize];
        System.out.println("\nEnter numbers (vertically, separating them by spaces) to sort : ");
        for(int i=0; i<arraySize; i++){
            array[i]=sc.nextInt();
        }
        bubbleSort(array, arraySize);
        System.out.print("\nThe sorted Array is : \n");
        for(int i=0; i<arraySize; i++){
            System.out.print(array[i]+"\t");
        }
        sc.close();
    }
}
