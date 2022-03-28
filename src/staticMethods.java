public class staticMethods {
    public static void main(String args[]){
    // Methods that can be called and executed without creating and object or instantiation of the main class
        // keyword: static
        //calling static method
        name_of_the_dog("Max");
        bark();
//        calling non-static method getting an error
//        sleep();

    }
    //static method that provides the name of the dog
    // Keyword: Static
    public static void name_of_the_dog(String name){
        System.out.println(String.format("Name of the dog: %s", name));
    }
    //Static method
    public static void bark(){
        System.out.println(" I am Barking");
    }
    //Non-static method
    public void sleep(){
        System.out.println("I am Sleeping");
    }
}
