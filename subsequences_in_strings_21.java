import java.util.*;

public class subsequences_in_strings_21 {
    public static void subsequences(String str, int index, String newStr){
        if(index==str.length()){
            System.out.println(newStr);
            return;
        }
        char currentChar = str.charAt(index);

        //include
        subsequences(str, index+1, newStr+currentChar);

        //not include
        subsequences(str, index+1, newStr);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter string : ");
        String str = sc.nextLine();
        subsequences(str, 0, "");
        sc.close();
    }
}
