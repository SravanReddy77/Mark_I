package Inheritance;

public class InheritanceExample {
    public static void main(String args[]){
    //call Box
        Box computer = new Box(25,24,23);
        computer.displayBoxName();
        computer.volume();
        //call smallBox
        smallBox mouse = new smallBox(10, 9, 8);
        mouse.displayBoxName();
        mouse.volume();

        //call bigBox
        bigBox tv = new bigBox(6,6,6);
        tv.displayBoxName();
        tv.volume();
    }
}
