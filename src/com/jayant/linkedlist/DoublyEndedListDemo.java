package com.jayant.linkedlist;

/**
 * Created by jayant on 1/14/2016.
 */
public class DoublyEndedListDemo {

    public static void main(String[] args) {
        DoublyEndedList list = new DoublyEndedList();
        list.insertAtTail(19);
        list.insertAtTail(34);
        list.insertAtTail(90);
        System.out.println("list.toString() = " + list.toString());
    }
}