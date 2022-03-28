package AccessModifiers.PublicAccessModifiers;

// public variables and methods can be access anywhere and has the widest scope
public class Person {
    public int age = 35;
    public void greet(String name){
        System.out.println(String.format("Hello %s", name));
    }
}
