package EncapsualtionExample;

public class EncapsulationMethod {
    public static void main(String args[]){
        Encapsulation emp1 = new Encapsulation();
        emp1.setName("Mark");
        emp1.setIdNum("24");
        emp1.setAge(44);
        System.out.println(emp1.getName() + "'s age is " + emp1.getAge() + " and id is " + emp1.getIdNum());
        System.out.println(String.format("The employee name is: %s with age: %d and id number: %s", emp1.getName(), emp1.getAge(), emp1.getIdNum() ));
//        System.out.println(emp1.yel);
        emp1.address = "Objedd";
        System.out.println("Address: " + emp1.address);
    }
}
