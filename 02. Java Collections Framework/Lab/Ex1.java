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

        ListIterator<String> Itter = list.listIterator(list.size());
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
        while (Itter.hasNext()) {
            System.out.println(Itter.next());
        }
        System.out.println("HashSet---------------------------------------------------------");
        HashSet<String> hashSet = new HashSet<String>();
        TreeSet<String> treeSet = new TreeSet<String>();
        for (String string : list) {
            hashSet.add(string);
            treeSet.add(string);
        }
        for (String s : hashSet) {
            System.out.println(s);
        }
        System.out.println("TreeSet----------------------------------------------------------");
        for (String s : treeSet) {
            System.out.println(s);
        }
    }
}
