import java.util.*;

public class switch_case_06 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter your grade : ");
        char grade = sc.next().charAt(0);
        switch(grade){
            case 'F':  System.out.println("Fail below 30");
                            break;
            case 'D':  System.out.println("Pass with 40");
                            break;
            case 'C':  System.out.println("Pass below 60");
                            break;
            case 'B':  System.out.println("Pass below 80");
                            break;
            case 'A':  System.out.println("Pass below 100");
                            break;
            default : System.out.println("Invalid input");
        }
        sc.close();
    }
}
