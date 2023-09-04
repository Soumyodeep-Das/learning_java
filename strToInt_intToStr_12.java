import java.util.*;

public class strToInt_intToStr_12 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // Parseing
        // From str to int
        String str = "72389"; // This is a string of numbers
        int phoneNo = Integer.parseInt(str); // The string is converted into integer numbers
        System.out.println(phoneNo);

        // From int to str
        int numbers = 897803; // This is just integer numbers stored in a variable
        String numString = Integer.toString(numbers); // The number is converted into a String
        System.out.println(numString);

        sc.close();
    }
}
