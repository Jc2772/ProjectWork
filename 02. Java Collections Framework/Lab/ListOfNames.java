package Lab;

import java.util.LinkedList;

public class ListOfNames {
    LinkedList<String> list;

    public ListOfNames(LinkedList<String> list){
        setList(list);
    }

    public LinkedList<String> getList() {
        return list;
    }

    public void setList(LinkedList<String> list) {
        this.list = list;
    }
    public void addItem(String item){
        list.add(item);
    }
    public void addAt(String item,int Place){
        list.add(Place,item);
    }
    public void removeItem(String item){
        list.remove(item);
    }
}
