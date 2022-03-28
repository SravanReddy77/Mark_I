package Collections;
import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String args[]){
        //create a arrayList non-generic
        List arraylist1 = new ArrayList();
        arraylist1.add("Sravan");
        arraylist1.add("Reddy");
        arraylist1.add("Annadi");
        arraylist1.add(1);
        arraylist1.add(true);
        arraylist1.add(23.43);
        System.out.println(arraylist1);
        arraylist1.remove(2);
        System.out.println(arraylist1);
        arraylist1.removeAll(arraylist1);
        System.out.println(arraylist1);


        //create non-generic arrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(1);
        System.out.println(arrayList2);
        arrayList2.add("Sravan");
        System.out.println(arrayList2);
        arrayList2.add(true);
        System.out.println(arrayList2);
        arrayList2.remove(1);
        System.out.println(arrayList2);

        //create Generic arrayList
        List<String> arrayList3 = new ArrayList<String>();
        ArrayList<Integer> arrayList4 = new ArrayList<Integer>();

        arrayList3.add("ONe");
        arrayList3.add("Two");
        System.out.println(arrayList3);
        arrayList4.add(1);
        arrayList4.add(2);
        System.out.println(arrayList4);

    }
}
