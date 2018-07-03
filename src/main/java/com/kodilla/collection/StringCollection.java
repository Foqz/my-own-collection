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
    public boolean removeElement(String s) {
        Element current = collectionHead;
        while(!current.getValue().equals(s) && current.getNext() != null) {
            current = current.getNext();
        }
        if (!current.getValue().equals(s)) {
            return false;
        }
        if(current == collectionHead){
            collectionHead = null;
        } else if (current.getNext() == null) {
            current.setNext(null);
        } else  {
            current.getPrev().setNext(current.getNext());
            current.getNext().setPrev(current.getPrev());
        }
        return true;
    }
}

