import java.util.*;

public class strings_11 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // Taking string input
        System.out.print("\nEnter 1st String : ");
        String string1 = sc.nextLine();
        System.out.print("\nEnter 2nd String : ");
        String string2 = sc.nextLine();
        
        System.out.print("\nDo you want to Concatenate these Strings ?\n(Y/N)\t: ");
        char choice = sc.next().charAt(0);

        if(choice == 'Y' || choice == 'y')
            System.out.println(string1+" "+string2);

        System.out.print("\nDo you want to Compare entered Strings ?\n(Y/N)\t: ");
        choice = sc.next().charAt(0);

        if(choice == 'Y' || choice == 'y'){
            if(string1.compareTo(string2) == 0)
                System.out.println("\nBoth Strings are EQUAL");
            else if(string1.compareTo(string2)>0)
                System.out.println("\nString1 is greater than String2");
            else 
                System.out.println("\nString1 is lesser than String2");
        }

        System.out.println("\nLength of String1 is : "+ string1.length());
        System.out.println("\nLength of String2 is : "+ string2.length());

        System.out.print("\nDo you want to take Substring from String1 ?\n(Y/N)\t: ");
        choice = sc.next().charAt(0);

        if(choice == 'Y' || choice == 'y'){
            System.out.print("\nEnter staring index for Substring1 : ");
            int startIndex = sc.nextInt();
            System.out.print("\nEnter ending index for Substring1 : ");
            int endIndex = sc.nextInt();
            System.out.println(string1.substring(startIndex, endIndex) + "\n");
        }

        System.out.print("\nDo you want to take Substring from String2 ?\n(Y/N)\t: ");
        choice = sc.next().charAt(0);

        if(choice == 'Y' || choice == 'y'){
            System.out.print("\nEnter staring index for Substring2 : ");
            int startIndex = sc.nextInt();
            System.out.print("\nEnter ending index for Substring2 : ");
            int endIndex = sc.nextInt();
            System.out.println(string2.substring(startIndex, endIndex) + "\n");
        }
        sc.close();
    }
}
