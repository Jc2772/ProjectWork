package Lab;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.*;
public class Ex1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        ListOfNames ex1 = new ListOfNames(list);
        ex1.addItem("Kay");
        ex1.addItem("Jay");
        ex1.addItem("May");
        ex1.addItem("Fay");

        ListIterator Itter = list.listIterator(list.size());
        while (Itter.hasNext()) {
            System.out.println(Itter.next());
        }
        System.out.println("----------------------------------------------------------------");
        ex1.addAt("Ray",3);
        while (Itter.hasNext()) {
            System.out.println(Itter.next());
        }
        ex1.removeItem("Kay");
        System.out.println("----------------------------------------------------------------");
        while (Itter.hasNext()) {
            System.out.println(Itter.next());
        }
        System.out.println("----------------------------------------------------------------");
        while (Itter.hasPrevious()) {
            System.out.println(Itter.previous());
        }
        ex1.addItem("Kay");
        System.out.println("----------------------------------------------------------------");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("HashSet---------------------------------------------------------");
        HashSet<String> hashSet = new HashSet<String>();
        TreeSet<String> treeSet = new TreeSet<String>();
        for (int i = 0; i < list.size(); i++) {
            hashSet.add(list.get(i));
            treeSet.add(list.get(i));
        }
        Iterator itr1 = hashSet.iterator();
        while(itr1.hasNext()) {
            System.out.println(itr1.next());
        }
        System.out.println("TreeSet----------------------------------------------------------");
        Iterator itr2 = treeSet.iterator();
        while (itr2.hasNext()){
            System.out.println(itr2.next());
        }
    }
}
