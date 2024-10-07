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

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("----------------------------------------------------------------");
        ex1.addAt("Ray",3);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        ex1.removeItem("Kay");
        System.out.println("----------------------------------------------------------------");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("----------------------------------------------------------------");
        for (int i = list.size(); i > 0; i--) {
            System.out.println(list.get(i-1));
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
        for (int i = 0; i < hashSet.size(); i++) {
            System.out.println(hashSet.toArray()[i]);
        }
        System.out.println("TreeSet----------------------------------------------------------");
        for (int i = 0; i < treeSet.size(); i++) {
            System.out.println(treeSet.toArray()[i]);
        }
    }
}
