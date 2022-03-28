public class instantVariables {

    // instance or public variable
    public String name; // instance or public variable that is visible for any child class
    private int age; // instance or public variable that is visible for employee class only

    // constructor method
    public instantVariables (String name){
        this.name = name;
    }

    // set age
    public void setAge(int age){
        this.age = age;
    }

    //Display Info
     public void displayInfo() {
        System.out.println("The name is " + name);
        System.out.println("The age is " + age);
     }


    // local variable
        public void getLocalVariable(){
            int age = 12; //local variable in instance method
            age = age + 12;
            System.out.println("The age is " + age);
        }
    public instantVariables(){
        int age = 12; // local variable in a constructor method
        age = age + 12;
        System.out.println("The age is " + age);
    }
    public static void instantVariables(){
        int age = 12; // local variable in a static method
        age = age + 12;
        System.out.println("The age is " + age);
    }
    public static void main(String args[]){
        // variables are the memory locations which holds the data to be used by any program
        // Types of variable
        // Local variables
        // - Variables that are declared in methods, constructors, or blocks.
        // Instance variables
        // - declared in class, but outside a method, constructor or any block.
        // Class Variables
        // Constant

        instantVariables item = new instantVariables();
        item.getLocalVariable();
        instantVariables();
        instantVariables item1 = new instantVariables("Raj");
        item1.setAge(45);
        item1.displayInfo();
    }
}
