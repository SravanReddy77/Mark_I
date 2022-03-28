package Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String args[]){
        //create non-generic linkedList
        List linkedList1 = new LinkedList();
        linkedList1.add("String");
        linkedList1.add(1);
        linkedList1.add(2, 23.4);
        linkedList1.add(false);
        System.out.println(linkedList1);
        linkedList1.remove(1);
        System.out.println(linkedList1);
        linkedList1.removeAll(linkedList1);
        System.out.println(linkedList1);

        //create generic linked list

        List<String> linkedList2 = new LinkedList<>();
        linkedList2.add("String1");
        linkedList2.add("String2");
        System.out.println(linkedList2);
        linkedList2.remove(1);
        System.out.println(linkedList2);
        linkedList2.removeAll(linkedList2);
        System.out.println(linkedList2);
    }
}
