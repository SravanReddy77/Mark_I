package AccessModifiers.ZOverview;

public class Employee {
    //works only in same class
    private void displayEmployeeName(String name){
        System.out.println("My name is" + name);
    }
    //works only in the same package
    void displayEmployeeId(int id){
        System.out.println("My Id is" + id);
    }
    // works in different package through inheritance
    protected  void displayEmployeeSalary(double salary) {
      System.out.println("My salary is" + salary);
    }
    //works everywhere, wide scope
    public void displayEmployeeBenefits(double insurance){
        System.out.println("My insurance is" + insurance);
    }
    public static void main(String[] args){
        Employee emp1 = new Employee();
        emp1.displayEmployeeBenefits(25.00);
        emp1.displayEmployeeId(266);
        emp1.displayEmployeeSalary(230000);
        emp1.displayEmployeeName("Sravan");
    }
}
