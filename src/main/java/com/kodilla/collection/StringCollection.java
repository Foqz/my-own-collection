package com.kodilla.collection;

import com.kodilla.collection.Element;

public class StringCollection {

    Element collectionHead;

    public String getElement(int n) {
        Element result = collectionHead;
        int k = 0;
        while(k < n){
            result = result.getNext();
            k++;
        }
        return result.getValue();
    }
    public void addElement(String s) {

        Element newElement = new Element(s);

        if(collectionHead == null) {
            collectionHead = newElement;
        } else {
            Element curr = collectionHead;
            while (curr.getNext() != null) {
                curr = curr.getNext();
            }
            curr.setNext(newElement);
            newElement.setPrev(curr);
        }
    }

}

