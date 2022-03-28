package AccessModifiers.DefaultAccessModifiers;
//Default can only be accessed in the same class or same package
public class Person {
    // default variable because it does not have public, private or default access modifiers
    int age = 40;

    void greet(String name){
        System.out.println(String.format("The name is %s", name));
    }
}
