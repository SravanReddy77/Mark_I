public class constructorMethod_Part1 {
    //constructor method
    public constructorMethod_Part1(){
        System.out.println("This is a constructor Method");
    }
    //constructor method
    public constructorMethod_Part1(String param){
        System.out.println("This is a constructor Method with param");
    }
    // Instance Method
    public void InstanceMethod(){
        System.out.println("This is an Instance method");
    }
}
class constructorMethodExample {
    public static void main(String args[]){
        // create object instance with default constructor
        constructorMethod_Part1 instance = new constructorMethod_Part1();
        instance.InstanceMethod();

        // create object instance with constructor having param
        constructorMethod_Part1 instance1 = new constructorMethod_Part1("constructor with param");
        instance1.InstanceMethod();
    }
}