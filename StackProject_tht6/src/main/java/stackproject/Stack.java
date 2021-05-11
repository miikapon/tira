package stackproject;

import java.util.LinkedList;
import java.util.Iterator;


public class Stack {

    private LinkedList<String> list;

    public Stack() {
        list = new LinkedList<String>();
    }

    public void push(String aData) {
        list.addFirst(aData);
    }

    public ListItem pop() {

        if (list.size() > 0) {
            String remove = list.removeFirst();
            ListItem item = new ListItem();
            item.setData(remove);
            return item;
        } else {
            return null;
        }
    }

    public void printItems() {

        Iterator iterator = list.descendingIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

    public int getSize() {
        return list.size();

    }

}
