/*  Access Modifers are the keywords that are used to define how the data stored into a variable or the methods of a class could be accessed.
    
    In Java there is 4 types of Access Modifiers i.e.
    1. Default
        When we do not add any access modifiers before any variable or method then the 'default' access modifier is automatically applied onto it,
    2. Public
        When we use 'public' access modifier, we defines a variable or method that it could be accessed by any class inside or outside the package.
    3. Protected
        When we use 'protected' access modifier, we defines a variable or method could be only accessed by any subclass of the same package.
    4. Private
        When we use 'private' access modifier, we defines a variable or method could not be used outside its class. Though we can modifiy the variables by using 'getters' and 'setters'.
 
 */

class AccessModifiers {
    String name1 = "Virat Kohli";
    public String name2 = "Lionel Messi";
    protected String name3 ="R. Lewandoski";
    private String name4 = "Narendra D. Modi";

    // Getter
    public String getName(){
        return name4;
    }
    // Setter
    public void setName(String name){
        this.name4=name;
    }
        
}
public class J031_access_modfiers {
    public static void main(String args[]){
        AccessModifiers as = new AccessModifiers();
        System.out.println(as.name1);
        System.out.println(as.name2);
        System.out.println(as.name3);
        // System.out.println(as.name4); throws error as it is private
        System.out.println(as.getName());
    }
}
