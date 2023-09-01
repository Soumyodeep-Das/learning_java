import java.util.*;

public class if_else_04 {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter your age : ");
        int age = sc.nextInt();
        if(age<18){
            System.out.println("\nYou aren't an Adult");
        } else if (age>18 && age<30){
            System.out.println("\nYou are an Adult");
        } else {
            System.out.println("\nYou are an old man");
        }
        sc.close();
    }
}
