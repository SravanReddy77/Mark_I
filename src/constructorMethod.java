public class constructorMethod {

    // Constructor Method
//    public constructorMethod(){
//        System.out.println("This is a constructor method");
//    }
    //Constructor method with parameters
    String make;
    String model;
    int year;
    public constructorMethod(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        System.out.println(String.format("This is a constructor method with params: %s, %s, %d", this.make, this.model, this.year));
    }
    //Instance method
    public void instanceMethod(){
        System.out.println("This is an instance method");
    }



    public static void main(String args[]){
        // Default method of the class that will be run at the time when the object is created or instantiated
        // used to declare default behavior for all the object
        // name must be same as class name
        // no explicit return
        // Two type of constructors
        // 1. Default constructor 2. Parameterized constructor
        constructorMethod instance = new constructorMethod("ford", "xyz", 1996);
        instance.instanceMethod();

        constructorMethod instance1 = new constructorMethod("ferrari", "243", 1997);
        instance1.instanceMethod();
    }
}
