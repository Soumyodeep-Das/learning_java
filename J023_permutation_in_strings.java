import java.util.*;

class J023_permutation_in_strings{
    public static void stringPermutation(String str, String permString){
        if(str.length()==0){
            System.out.println(permString);
            return;
        }

        for(int i=0; i<str.length(); i++){
            char currentCharacter = str.charAt(i); // Selecting the first letter ex: 'a' from 'abc', currentCharacter='a'
            String newStr = str.substring(0,i)+str.substring(i+1); // newStr = 'bc'

            stringPermutation(newStr, permString+currentCharacter); // Recursion, permString+currentCharacter = 'a'
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter a String : ");
        String str = sc.nextLine();
        stringPermutation(str,"");
        sc.close();
    }
}