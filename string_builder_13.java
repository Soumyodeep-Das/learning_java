import java.util.*;

public class string_builder_13 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter a String : ");
        StringBuilder string = new StringBuilder(sc.nextLine());
        int choice, index;
        char ch;
        do{
            System.out.print("\nIf you want to do any following taks then select is by the numbers :\n\n");
            System.out.println("1. Alter any character in the existing String");
            System.out.println("2. Insert any character into the String");
            System.out.println("3. Append a new character at the end of the String");
            System.out.println("4. Print a character from the String");
            System.out.println("5. Delete a character from the String");
            System.out.println("6. Print length of the current String");
            System.out.println("7. Reverse the String");
            System.out.println("8. Exit the programme.");
            System.out.print("\n\nYour choice : ");
            choice = sc.nextInt(); 
            switch(choice){            
                case 1: System.out.print("\nEnter the character index to change : ");
                        index = sc.nextInt();
                        System.out.print("\nEnter the new Charater : ");
                        ch = sc.next().charAt(0);
                        string.setCharAt(index, ch);
                        System.out.println("\nNow the String is : " + string);
                        break;

                case 2: System.out.print("\nEnter the character index to insert : ");
                        index = sc.nextInt();
                        System.out.print("\nEnter the new Charater : ");
                        ch = sc.next().charAt(0);
                        string.insert(index, ch);
                        System.out.println("\nNow the String is : " + string);
                        break;

                case 3: System.out.print("\nEnter the new Charater to append : ");
                        ch = sc.next().charAt(0);
                        string.append(ch);
                        System.out.println("\nNow the String is : " + string);
                        break;

                case 4: System.out.print("\nEnter the character index to print : ");    
                        index = sc.nextInt();                
                        System.out.println("\nThe character at "+index+" index is : "+string.charAt(index));
                        break;

                case 5: System.out.print("\nEnter the character index to delete a character : ");    
                        index = sc.nextInt();                
                        System.out.println("\nThe character at "+index+" index is : "+string.charAt(index));
                        System.out.println("\nAfter deletion the current string is : "+string.deleteCharAt(index));
                        break;

                case 6: System.out.println("\nThe length of the current string is : "+string.length());
                        break;

                case 7: System.out.println("\nThe current string is : "+string);
                        System.out.println("\nReverse of the string is : "+string.reverse());
                        break;

                default: System.out.println("\nInvaild option is opted.\nTry Again\n");
            }

        }while(choice<8);       
        sc.close();
    }
}
