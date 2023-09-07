import java.util.*;

public class J007_switch_case_in_loop {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //Calculator
        char op;
        System.out.println("Welcome to my basic calculator");
        do{
            //code
            System.out.print("\nEnter A : ");
            float a = sc.nextFloat();
            System.out.print("\nEnter B : ");
            float b = sc.nextFloat();
            System.out.print("\nEnter Operation : ");
            op = sc.next().charAt(0);
            switch(op){
                case '+' :  System.out.print("\nAddition Operation");
                            System.out.print("\nA + B = " + (a+b) + "\n");
                            break;
                case '-' :  System.out.print("\nSubtraction Operation");
                            System.out.print("\nA - B = " + (a-b) + "\n");
                            break;
                case '*' :  System.out.print("\nMultiplication Operation");
                            System.out.print("\nA * B = " + (a*b) + "\n");
                            break;
                case '/' :  System.out.print("\nDivision Operation");
                            System.out.print("\nA / B = " + (a/b) + "\n");
                            break;
                case '.' :  System.out.println("\nTerminating Calculator");
                            break;
                default :   System.out.print("\nInvalid Key Pressed\nTry again\n");

            }
        }while(op!='.');       // to stop the calculator , press . in the Operation prompt 
        sc.close();
    }
}
