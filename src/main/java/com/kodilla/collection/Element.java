package com.kodilla.collection;

public class Element {

    private String value;
    private Element next;
    private Element prev;

    public Element(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }

    public void setNext(Element nextElement) {
        this.next = nextElement;
    }
    public void setPrev(Element prevElement) {
        this.prev = prevElement;
    }

    public Element getNext() {
        return next;
    }
    public Element getPrev() {
        return prev;
    }

}
