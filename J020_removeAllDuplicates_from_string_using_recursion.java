import java.util.*;

public class J020_removeAllDuplicates_from_string_using_recursion {
    public static boolean[] alphabets = new boolean[26];
    public static void removeAllDuplicates(String str, int index, String newStr){
        if(index==str.length()){
            System.out.println(newStr);
            return;
        }
        if(alphabets[str.charAt(index)-'a']==true)
            removeAllDuplicates(str, index+1, newStr);
        else{
            newStr+=str.charAt(index);
            alphabets[str.charAt(index)-'a']=true;
            removeAllDuplicates(str, index+1, newStr);
        }

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter a string : ");
        String str = sc.nextLine();
        System.out.print("\nThe new string is : ");
        removeAllDuplicates(str, 0, "");
        sc.close();
    }
}
