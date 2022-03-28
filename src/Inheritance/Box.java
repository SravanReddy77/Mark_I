package Inheritance;

public class Box {
    // variables
    private int length;
    private int breadth;
    private int height;

    // constructor
    public Box(int l, int b, int h){
        this.length = l;
        this.breadth = b;
        this.height = h;
    }
    public void displayBoxName(){
        System.out.println("My Name is Computer Box");
    }
    public void volume(){
        double volume = length * breadth * height;
        System.out.println("The volume of the Computer Box is: " + volume);
    }
}
