package AccessModifiers.ProtectedAccessModifiers;

import AccessModifiers.PublicAccessModifiers.Person;

public class publicAccessModifierExample {
    public static void main(String[] args){
        Person p1 = new Person();
        System.out.println(p1.age);
        p1.greet("Veronica");
    }
}
