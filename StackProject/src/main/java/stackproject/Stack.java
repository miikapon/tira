/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackproject;

/**
 *
 * @author Omistaja
 */
public class Stack {
    private ListItem mTop;
    private int mSize;  // kertoo alkioiden lukumäärän
    
    
    public Stack() {
        mTop = null;
        mSize = 0;
    }
    // Muodostetaan uusi lista-alkio ja viedään se pinon huipulle
    public void push(String aData) {
        ListItem newItem = new ListItem(); //Luodaan uusi lista-alkio
        newItem.setData(aData);
        newItem.setNext(mTop); // Kytketään uusi alkio aikaisempaan huippualkioon
        mTop = newItem; // Uusi alkio pinon huippualkioksi
        mSize++;
    }
    
    // poistetaan alkio pinon huipulta, jos pino tyhjä palautetaan null
    public ListItem pop() {
        if (mSize >= 1) {
            ListItem del = mTop;
            mTop = mTop.getNext();
            mSize--;
            return del;
        } else {
        return null;
        }
    }
    
    // tulostetaan pinon sisältö muuttamatta pinoa
    public void printItems() {
        ListItem scanner = mTop;
        while (scanner != null) {
            System.out.println(scanner.getData() + ",");
            scanner = scanner.getNext();
        }

    }
    
    // palautetaan pinottujen alkioiden lukumäärä
    public int getSize() {
        return mSize;
    }
    
}
