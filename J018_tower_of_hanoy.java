import java.util.*;

public class J018_tower_of_hanoy {
    public static void towerOfHanoy(int disk, String source, String helper, String destination){
        if(disk==1){
            System.out.println("\nTransfered DISK "+disk+" from "+source+" to "+destination );
            return;
        }            
        towerOfHanoy(disk-1, source, destination, helper);
        System.out.println("\nTransfered DISK "+disk+" from "+source+" to "+destination );
        towerOfHanoy(disk-1, helper, source, destination);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter number of DISKs : ");
        int disk = sc.nextInt();
        towerOfHanoy(disk,"Source","Helper","Destination");
        sc.close();
    }
}
