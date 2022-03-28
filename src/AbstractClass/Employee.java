package AbstractClass;

public class Employee extends Customer {
    private int empId;
    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }
    @Override
  public String getCustomerInfo(){
        return String.format("The Employee Name is: %s \n Address: %s \nempId: %s", getName(), getAddress(), getEmpId());
  }
}
