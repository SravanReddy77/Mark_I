package Method_overriding;

public class method_overriding {
    public static void main(String args[]){
        Animal animal1 = new Animal();// referenced to Animal class
        Animal animal2 = new Dog(); // referenced to Animal class to call Dog class with same method name
        Dog animal3 = new Dog();

        animal1.talk();
        animal2.talk();
        animal3.talk();
    }
}
