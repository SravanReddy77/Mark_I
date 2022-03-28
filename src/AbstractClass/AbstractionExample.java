package AbstractClass;

public class AbstractionExample {
    public static void main(String args[]){
        Employee emp1 = new Employee();
        emp1.setName(" Sravan Reddy Annadi");
        emp1.setAddress("James Street");
        emp1.setEmpId(266);

        System.out.println(emp1.getCustomerInfo());
    }
}
