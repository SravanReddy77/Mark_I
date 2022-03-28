public class methods_part1 {
    public static void main(String args[]){
        emptyValue("John");
        emptyValue("Mark");
        emptyValue1("Sravan");
//        String message = emptyValue1("Annadi");
        System.out.println("The message is " + emptyValue1("Annadi"));
    }
    // method that return empty value
    public static void emptyValue(String name){
        System.out.println(String.format("Hello, %s", name));
    }
    // method that return String value
    public static String emptyValue1(String name){
        return String.format("Hello, %s, Welcome to java class", name);
    }
}
