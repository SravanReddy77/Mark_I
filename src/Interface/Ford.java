package Interface;

public class Ford implements Vehicle{
    @Override
    public void start(){
        System.out.println("The Car is Starting");
    }
    @Override
    public void stop() {
        System.out.println("The Car is Stopping");
    }
    @Override
    public void cruise(){
        System.out.println("The Car is Cruising");
    }
    public static void main(String args[]){
        Ford f150 = new Ford();
        f150.start();
        f150.stop();
        f150.cruise();
    }
}

