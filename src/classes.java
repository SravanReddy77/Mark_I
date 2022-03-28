public class classes {
    public static void main(String[] args) {
        //Class is a specification or a blueprint(set of instructions) of how to provide some
        dogName("Max");
        bark();
        eat();
        sleep();
        play();
    }
    public static void dogName(String name){
        System.out.println(String.format("Name of the dog: %s", name));
    }
    public static void bark(){
        System.out.println("I am barking");
    }
    public static void eat(){
        System.out.println("I am eating");
    }
    public static void sleep(){
        System.out.println("I am sleeping");
    }
    public static void play(){
        System.out.println("I am playing");
    }
}
