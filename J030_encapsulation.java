/*  Encapuslation is data hiding. Means protecting some data stored into a class by making its properties to private or protected, so that it can not be used by anyother class or program directly. 
 */

import java.util.*;

class Details {
    String accountName;
    private String password; // Data stored into a private variable can not be accessed outside the class's scope directly.

    // private variables can be accessed using getters and setters outside the class.
    public String getPassword(){
        return this.password;
    }
    public void setPassword(String password){
        this.password=password;
    }

    public void provideInfo(){
        System.out.print("\nAccount name : "+accountName);
        System.out.print("\nPassword : "+getPassword());
    }
}
public class J030_encapsulation {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Details d1 = new Details();
        System.out.println("\nEncapsulation");
        System.out.print("\nEnter account name : ");
        d1.accountName = sc.nextLine();
        System.out.print("\nEnter password for your account : ");
        d1.setPassword(sc.nextLine());
        // Calling method from Details
        d1.provideInfo();
        sc.close();
    }
}
