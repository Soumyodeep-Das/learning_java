/* Polymorphism is when we create same named functions in 
a class with different usage 

It is also called Function OverLoading.
It is a compiler time polymorphism

Criteria:
    1. Return types of the function should be different.
    2. If return types are same then the arguments passing into
       the fucntion should be different.
    3. If both the return time and arguments are same then 
       an extra argument should be passed into either function
       to differentitate with each other.
*/
import java.util.*;


class Student {
    String name;
    int age;

    public void printInfo(String name){
        System.out.println("\nStudent name : "+this.name);
    }
    public void printInfo(int age){
        System.out.println("\nStudent age : "+this.age);
    }
    public void printInfo(String name, int age){
        System.out.println("\nStudent name : "+this.name);
        System.out.println("\nStudent age : "+this.age);
    }
}
public class J028_polymorphism{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();
        System.out.print("\nEnter student name : ");
        s1.name = sc.nextLine();
        System.out.print("\nEnter student age : ");
        s1.age = sc.nextInt();
        System.out.println("\n\nFetch Student name : ");
        s1.printInfo(s1.name);
        System.out.println("\n\nFetch Student age : ");
        s1.printInfo(s1.age);
        System.out.println("\n\nFetch Student full info : ");
        s1.printInfo(s1.name, s1.age);
        sc.close();
    }
}