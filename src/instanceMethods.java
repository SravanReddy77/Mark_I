class Student {
    public void name_of_the_stuent(String name){
        System.out.println(String.format("My name is: %s ", name));
    }
    public void grade (double grade){
        System.out.println(String.format("My grade is: %.1f", grade));
    }
    // static method
    public static void className(String name){
        System.out.println(String.format("The Object name is: %s", name));
    }
}

 public class instanceMethods {
    public static void main( String args[]){
        // Methods that are called after instantiation of class or object creation
        // Commonly used method types
        Student student1 = new Student();
        student1.name_of_the_stuent("Micheal");
        student1.grade(12.04);
        Student.className("student1");

        System.out.println("\n");
        Student student2 = new Student();
        student2.name_of_the_stuent("Jack");
        student2.grade(4.03);
        Student.className("student2");

    }
}
