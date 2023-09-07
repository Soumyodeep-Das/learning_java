import java.util.*;

class J022_check_strictly_increasing{
    public static boolean checkStrictly(int[] array, int index){
        if(index==array.length-1)
            return true;
        if(array[index]<array[index-1]){
            return false;
        }
        return checkStrictly(array, index+1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter array size : ");
        int arraySize = sc.nextInt();
        int[] array = new int[arraySize];
        System.out.println("\nEnter a sorted array of numbers : ");
        for(int i=0; i<arraySize; i++)
            array[i]=sc.nextInt();
        boolean result = checkStrictly(array, 1);
        System.out.println(result);
        sc.close();
    }
}