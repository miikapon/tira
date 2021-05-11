/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackproject;

import java.util.LinkedList;
import java.util.Iterator;

/**
 *
 * @author Omistaja
 */
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
