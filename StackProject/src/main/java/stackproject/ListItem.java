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
public class ListItem {
    private String mData;
    private ListItem mNext;
    
    public ListItem() {
        mNext = null; // on oletusarvo
    }

    public String getData() {
        return mData;
    }

    public void setData(String aData) {
        mData = aData;
    }

    public ListItem getNext() {
        return mNext;
    }

    public void setNext(ListItem aNext) {
        mNext = aNext;
    }
    
    
    
}
