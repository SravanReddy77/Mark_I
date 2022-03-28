package integerClassMethods;

public class integerClassMethod {
    public static void main(String args[]){
        // intValue() - return integer value of integer class object
        // doubleValue() - returns double value of integer.
        // floatValue() - returns float value of integer.
        // parseInt() - returns integer value of String if applicable.
        // compare(int d) - compares 0 if integer a and integer b is equal.
        // equals(String) - checks the equality of string with object.
    Integer a = 100;
    Integer b = 34;
    Integer c = 13;
    Integer d = 100;
    int e = 500;
    System.out.println(a.intValue());
    System.out.println(b.doubleValue());
    System.out.println(c.floatValue());
    System.out.println(Integer.parseInt("12345"));
    System.out.println(Integer.compare(100,100));
    System.out.println(Integer.compare(112, 100));
    System.out.println(Integer.compare(98, 100));
    System.out.println(a.equals(d));
    System.out.println(a.equals(c));
    }
}
