import java.util.*;

public class J003_dataTypes {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter an integer : ");
        int intNum=sc.nextInt();
        System.out.print("\nEnter a float : ");
        float floatNum=sc.nextFloat();
        System.out.print("\nEnter a character : ");
        String charVar=sc.next();
        System.out.print("\nYour entered integer is " + intNum);
        System.out.print("\nYour entered float is " + floatNum);
        System.out.print("\nYour entered char is " + charVar + "\n");
        sc.close();
    }
}
