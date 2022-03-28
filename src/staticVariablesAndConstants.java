
class staticVariables {
    public static String name; // static variable name
    public static int age; // static variable age
}

 class Constants {
    public static String name;
    public static final double PI = 3.14;
}

public class staticVariablesAndConstants {
    public static void main(String args[]){
        // Class variables or static variables are declared with the static keyword in a class, but outside a method, constructor or block.
        staticVariables.name = "Stark";
        staticVariables.age = 24;
        System.out.println("Name: " + staticVariables.name);
        System.out.println("Age : " + staticVariables.age);

        // constants are always written in uppercase
        //Always denoted by final return type

        Constants.name = "Dan";
        System.out.println("Name: " + Constants.name);
        System.out.println("PI  : " + Constants.PI);
    }
}
