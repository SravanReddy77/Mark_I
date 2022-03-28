package Collections;
import java.util.Vector;

//Vector is a dynamic array where you cannot add or remove items into the array, but you can add or remove during runtime

public class VectorExample {
    public static void main(String args[]){
    Vector vector1 = new Vector();
    vector1.add("Strinq");
    vector1.add(2);
    vector1.add(false);
    System.out.println(vector1);
    System.out.println(vector1.size());
    vector1.remove(2);
    System.out.println(vector1);
    System.out.println(vector1.size());

        Vector vector2 = new Vector(2);
        vector2.add("Integer");
        vector2.add(3);
        vector2.add(true);
        System.out.println(vector2);
        System.out.println(vector2.size());
        vector2.remove(2);
        System.out.println(vector2);
        System.out.println(vector2.size());
        vector2.remove(1);
        System.out.println(vector2);
    }
}
