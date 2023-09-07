import java.util.*;

class J008_functions{
    public static int fibonacciSeries(int n){
        if(n==0)
            return 0;
        else if (n==1)
            return 1;
        else
            return fibonacciSeries(n-1)+fibonacciSeries(n-2);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // Fibonacci Series
        System.out.print("\nEnter how much terms wanna print : ");
        int terms = sc.nextInt();

        for(int i=0; i<terms; i++){
            System.out.println(fibonacciSeries(i));
        }
        
        sc.close();
    }
}