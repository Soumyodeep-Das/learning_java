import java.util.*;

public class J005_loops {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter number of rows : ");
        int rows=sc.nextInt();
        System.out.println("Using for loop");
        for(int i=0; i<rows; i++){
            for(int j=0; j<=i; j++){
                System.out.print(j);
            }
            System.out.print("\n");
        }

        System.out.println("Using while loop");
        int i=0, j=0;
        while(i<rows){
            j=0;
            while(j<=i){
                System.out.print(j);
                j++;
            }
            System.out.print("\n");
            i++;
        }

        System.out.println("Using do-while loop");
        i=j=0;
        do{
            j=0;
            do{
                System.out.print(j);
                j++;
            }while(j<=i);
            System.out.print("\n");
            i++;
        }while(i<rows);

        sc.close();
    }
}
