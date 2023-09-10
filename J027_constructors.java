/* There are 3 types of java Constructor
    1. Non-Parameterized Constructor
    2. Parameterized Constructor
    3. Copy Constructor
*/
import java.util.*;


class Constructor{
    // Example of all 3 types of Constructors are shown bellow

    String objectName, className;
    // 1. Non-Parameterized Constructor
    Constructor(){
        System.out.println("Non-Parameterized Constructor is called.");
    }

    // 2. Parameterized Constructor
    Constructor(String objectName, String className){
        System.out.println("Parameterized Constructor is called.");
        System.out.println("From "+objectName+" object of "+className+" class.");
    }

    // 3. Copy Constructor
    Constructor(Constructor s){
        System.out.println("Copy Constructor is called.");
        this.objectName = s.objectName;
        this.className = s.className;
        System.out.println("From "+this.objectName+" object of "+this.className+" class.");
    }
}
public class J027_constructors {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nCalling Non-Parameterized Constructor\n");
        Constructor c1 = new Constructor();
        c1.objectName = "Constructor"; // Redundent Line, no use or effect
        System.out.println("\n\nCalling Parameterized Constructor\n");
        Constructor c2 = new Constructor("c2", "Constructor");
        System.out.println("\n\nCalling Copy Constructor\n");
        c2.className = "Constructor";
        c2.objectName = "c2";
        Constructor c3 = new Constructor(c2);
        c3.objectName = "Constructor"; // Redundent Line, no use or effect
        sc.close();
    }
}
