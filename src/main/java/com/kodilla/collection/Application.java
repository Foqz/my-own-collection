package com.kodilla.collection;

public class Application {
    public static void main(String[] args) {
        StringCollection sc = new StringCollection();
        sc.addElement("pierwszy");
        sc.addElement("drugi");
        sc.addElement("trzeci");
        sc.addElement("czwarty");
        System.out.println(sc.getElement(0));
        sc.removeElement("pierwszy");
        System.out.println(sc.getElement(0));
    }
}
