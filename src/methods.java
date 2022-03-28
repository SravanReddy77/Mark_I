public class methods {
    public static void main(String[] args){
        // Methods are group of statements grouped together to perform an operation.
        int result = add(5,7);
        System.out.println("The Result of adding two numbers is: " + result);
        greet("King");
        greet("Micheal");
        System.out.println(Welcome("John"));
        String[] people = {"Mark", "Johnson", "Tim", "David", "Robert"};
        for (String person : people) {
            System.out.println(Welcome(person));
        }
        System.out.println("Your age is " + age(1972));
        System.out.println("Your age is " + age(1997));
        System.out.println("Your age is " + age(1999));
        System.out.println("The number is " + isEven(45));
        System.out.println("The number is " + isEven(44));
    }
    // methods with return types - Integers
    public static int add(int num1, int num2){
        return num1 + num2;
    }
    // method with no return type
    public static void greet (String name){
        System.out.println("Hello, " + name);
    }
    // method with return types - String
    public static String Welcome(String person){
        return "Hello " + person + ", Welcome to the new office";
    }
    // method with return type - Int
    public static int age(int year){
        return 2022 - year;
    }

    // method with return type - Boolean
    public static boolean isEven( int number){
        return number % 2 == 0;
    }
}
