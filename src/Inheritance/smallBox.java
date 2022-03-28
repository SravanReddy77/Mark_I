package Inheritance;

public class smallBox extends Box {
    private int length;
    private int breadth;
    private int height;
    public smallBox (int l, int b, int h){
        super(l,b,h);
        this.length = l;
        this.breadth = b;
        this.height = h;

    }
    public void displayBoxName(){
        System.out.println("My Name is mouse Box");
    }
    //Display area
    public void volume (){
        double volume  = length * breadth * height;
        System.out.println(" The Volume of the box is: " + volume);
    }
}
