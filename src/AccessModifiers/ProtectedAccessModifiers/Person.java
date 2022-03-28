package AccessModifiers.ProtectedAccessModifiers;
// protected variables and method can be accessed into other packages using inheritance
public class Person {
    protected  int age = 40;
    protected void greet(String name){
        System.out.println(String.format("Hello %s", name));
    }
}
