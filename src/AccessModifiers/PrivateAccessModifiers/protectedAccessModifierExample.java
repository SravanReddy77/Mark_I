package AccessModifiers.PrivateAccessModifiers;

import AccessModifiers.ProtectedAccessModifiers.Person;
//accessing protected method into another package using inheritance
public class protectedAccessModifierExample extends Person {
    public static void main(String[] main){
      protectedAccessModifierExample p1 = new protectedAccessModifierExample();
      System.out.println(p1.age);
      p1.greet("Mark");
    }

}
