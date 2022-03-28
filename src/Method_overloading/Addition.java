package Method_overloading;

public class Addition {
    //Addition of two numbers
    public int add(int a, int b){
        return a + b;
    }

    //Addition of three numbers
    public int add(int a, int b, int c){
        return a + b + c;
    }
    //Addition of double values
    public double add(double a, double b){
        return a + b;
    }
    public static void main(String args[]){
        Addition a = new Addition();
        System.out.println(a.add(12,24));
        System.out.println(a.add(12,24, 36));
        System.out.println(a.add(12.12,24.24));
    }
}
