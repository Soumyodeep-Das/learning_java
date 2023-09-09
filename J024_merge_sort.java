import java.util.*;

public class J024_merge_sort {
    public static void merge(int[] array, int startIndex, int midIndex, int endIndex){
        int start1 = startIndex;
        int start2 = midIndex+1;
        int i=0;
        int[] tempArray = new int[endIndex-startIndex+1];
        while(start1<=midIndex && start2<=endIndex){
            if(array[start1]>array[start2])
                tempArray[i++]=array[start2++];
            else
                tempArray[i++]=array[start1++];
        }
        while(start1<=midIndex)
            tempArray[i++]=array[start1++];

        while(start2<=endIndex)
            tempArray[i++]=array[start2++];

        for(int j=0, k=startIndex; j<i; j++, k++)
            array[k]=tempArray[j];
    }
    public static void mergeSort(int[] array, int startIndex, int endIndex){
        if(startIndex>=endIndex)
            return;

        int mid = (startIndex+endIndex)/2; // Calculating the mid point to divide into half
        mergeSort(array, startIndex, mid); // Divide the array into half
        mergeSort(array, mid+1, endIndex); // Divide the array into half

        merge(array, startIndex, mid, endIndex); // Conquer or merge the element in sorted way
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
        mergeSort(array, 0, arraySize-1);
        System.out.println("\nSorted array : \n");
        for(int i=0; i<arraySize; i++){
            System.out.print(array[i]+"\t");
        }
        sc.close();
    }
}
