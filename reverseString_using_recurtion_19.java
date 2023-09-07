import java.util.*;

class reverseString_using_recurtion_19{
    public static void reverseString(String str, int index){
        if(index==0){
            System.out.print(str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index));
        reverseString(str, index-1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter string to reverse : ");
        String str = sc.nextLine();
        System.out.println("\nReversed String is : ");
        reverseString(str, str.length()-1);        
        sc.close();
    }
}