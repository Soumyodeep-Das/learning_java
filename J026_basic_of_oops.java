// Object Oriented Programming Systems
import java.util.*;

class student {
    // New Class named 'student'
    String name;
    String id;
    String phoneNo;

    // Creating a method
    public void info(){
        System.out.println(this.name);
        System.out.println(this.id);
        System.out.println(this.phoneNo);
    }
}

public class J026_basic_of_oops {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // Creating an object of 'student' class
        student s1 = new student();

        // Taking input for the object
        System.out.print("\nEnter student name : ");
        s1.name = sc.nextLine();
        System.out.print("\nEnter student id : ");
        s1.id = sc.nextLine();
        System.out.print("\nEnter student phone number : ");
        s1.phoneNo = sc.nextLine();

        // Calling a method from the class
        System.out.println("\nFetched student's details : \n");
        s1.info();
        sc.close();
    }
}

