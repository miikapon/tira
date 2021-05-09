/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackiterator;

/**
 *
 * @author kamaj
 */
public class Stack {

    ListItem top; // top näkyy oletuspakkaukseen
    private int size;
    private ListItem[] stackArray = new ListItem[10];

    public Stack() {
        top = null;
        size = 0;
    }
    
    //  palautetaan pino-iteraattori
    public StackIterator iterator() {
        return new StackIterator(this);
    }

    // muodostetaan uusi alkio ja viedään se huipulle
    public void push(String aData) {
        top = new ListItem();
        top.setData(aData);
        stackArray[size] = top;
        size++;

    }
    
    // poistetaan alkio pinon huipulta, jos pinossa ei alkioita palautetaan null
    public ListItem pop() {
        top = new ListItem();
        if (size > 0) {
            stackArray[size] = null;
            size--;
            top = stackArray[size];
            return top;
        }
        return null;
    }

    // palautetaan pinottujen alkioiden lukumäärä
    public int getSize() {
        return size;
    }
    
    // listataan sisältö
    public void printItems() {
        int i = size - 1;
        while (i >= 0) {
            System.out.print(stackArray[i].getData() + ", ");
            i--;
        }
    }

    public ListItem getListItem(int i) {
        return stackArray[i];
    }
}
