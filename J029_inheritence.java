/*  Inheritence: When a class inherits each properties and methods of another class it is called inheritence.
    Example: A HOI of a school has every qualities, features of a teacher but also has some addition qualities to be a HOI.

    In Java there is 4 types of inheritence i.e.
    1. Single Level Inheritence
    2. Multi Level Inheritence
    3. Hierarchical Inheritence
    4. Hybrid Inheritence
 
 */
import java.util.*;

class Shape {
    String colour; 
    String surface; // smooth or rough
}

class Triangle extends Shape {
    float sideLength;
}

class EquilateralTriangle extends Triangle {
    public void periMeterOfEquiTriangle(float sideLength){
        System.out.println("\nTriangle Perimeter : "+3*sideLength);
    }
}
// Shape -> Triangle        is an example of 'Single Level Inheritence'
// Shape -> Triangle -> EquilateralTriangle         is an example of 'Multi Level Inheritence'

class Circle extends Shape {
    float radius;
    public void areaOfCircle(float radius){
        System.out.println("\nCircle Area : "+3.14*radius*radius);
    }
}
// Shape -> Triangle
// Shape -> Cicle       is an example of 'Hierarchical Inheritence'


// Shape -> Triangle -> EquilateralTriangle
// Shape -> Circle      is an example of 'Hybrid Inheritence' as both 'Multi Level Inheritence' and 'Hierarchical Inheritence' co-exists .
public class J029_inheritence {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nInheritence in JAVA");
        EquilateralTriangle t1 = new EquilateralTriangle();
        t1.colour = "Black";
        t1.surface = "Rough";
        System.out.print("\nEnter side length of triangle : ");
        t1.sideLength = sc.nextFloat();
        t1.periMeterOfEquiTriangle(t1.sideLength);

        Circle c1 = new Circle();
        c1.colour = "White";
        c1.surface = "Smooth";
        System.out.print("\nEnter Radius of Circle : ");
        c1.radius = sc.nextFloat();
        c1.areaOfCircle(c1.radius);
        sc.close();
    }
}
