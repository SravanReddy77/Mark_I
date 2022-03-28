package AccessModifiers.PrivateAccessModifiers;
//Private Variables and methods are Only accessible within the class

public class Customer {
    private int age = 40; //private variable
    public void msg(String name){ //private method, changed to public in order to remove the error
        System.out.println(String.format("The name is %s", name));
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
class PrivateExample {
    public static void main(String[] args){
        Customer customer1 = new Customer();
        System.out.println(customer1.getAge());
        customer1.msg("mall");
    }
}

