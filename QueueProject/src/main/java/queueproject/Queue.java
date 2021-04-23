
package queueproject;

/**
 *
 * @author Omistaja
 */
public class Queue {

    private ListItem head;
    private ListItem tail;
    private int mSize;  // kertoo alkioiden lukumäärän

    public Queue() {
        head = null;
        mSize = 0;
    }

    // Muodostetaan uusi lista-alkio ja viedään se jonon hännille (tail
    public void push(String aData) {
        ListItem newItem = new ListItem();
        newItem.setData(aData);
        if (tail == null) {
            tail =head = newItem;
        } else {    
            tail.setNext(newItem);
            tail = newItem;
        }  
        mSize++;
    }

    // poistetaan alkio jonon päästä (head), jos jono tyhjä palautetaan null
    public ListItem pop() {
        ListItem del = null;
        if (mSize >= 1) {
            del = head;
            //ListItem del = head;
            head = head.getNext();
            mSize--;
            return del;
        } else {
            head = null;
            tail = null;
            return del;
        }
    }
    // tulostetaan jonon sisältö muuttamatta jonoa

    public void printItems() {
        ListItem scanner = head;
        while (scanner != null) {
            System.out.println(scanner.getData() + ",");
            scanner = scanner.getNext();
        }
    }

    // palautetaan alkioiden lukumäärä
    public int getSize() {
        return mSize;
    }

}
