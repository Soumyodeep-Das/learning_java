import java.util.*;

public class J009_oneD_array {
    public static void linearSearch(int[] array, int element, int size){
        int i;
        for(i=0; i<size; i++){
            if(array[i]==element){
                System.out.println("\nThe index is : " + i);
                break;
            }
        }
        if(i>=size){
                System.out.println("\nElement not found !");
            }        
    }

    public static void sumOfArrays(int[] array, int size){
        int sum=0;
        for(int i=0; i<size; i++)
            sum+=array[i];
        System.out.println("\nSum of all array elements is : " + sum);
    }
    public static void main(String args[]){
        // Liner search, Sum of all elements
        Scanner sc = new Scanner(System.in);
        // Declare 1D Array
        System.out.print("\nEnter size of array : ");
        int size = sc.nextInt();

        int[] arrayNums = new int[size];

        System.out.print("\nEnter numbers : \n");
        // Initializing Array
        for(int i=0; i<size; i++){
            arrayNums[i]=sc.nextInt();
        }

        // Printing entered array elements 
        for(int i=0; i<size; i++){
            System.out.print(arrayNums[i] + "\t");
        }

        // Searching for an element in the array
        System.out.print("\nEnter which number to search : ");
        int searchingElement = sc.nextInt();

        linearSearch(arrayNums, searchingElement, size);

        // Sum of all array elements
        sumOfArrays(arrayNums, size);
        sc.close();
    }
}
