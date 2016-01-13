package com.jayant.linkedlist;

/**
 * Created by jayant on 1/14/2016.
 */
public class LinkedlistDemo {

    public static void main (String[] args) {
        Linkedlist list = new Linkedlist();

        list.insertAtHead(5);
        list.insertAtHead(10);
        list.insertAtHead(2);
        list.insertAtHead(20);

        System.out.println("list = " + list);
        System.out.println("length of the node : " + list.length());
        list.deleteFromHead();
        System.out.println("list = " + list);
        System.out.println("list.length() = " + list.length());
        System.out.println("element: " + list.find(10));

        Linkedlist sortedLinkedlist = new Linkedlist();
        sortedLinkedlist.insertNodeInSortedOrder(14);
        sortedLinkedlist.insertNodeInSortedOrder(43);
        sortedLinkedlist.insertNodeInSortedOrder(2);
        sortedLinkedlist.insertNodeInSortedOrder(2);
        sortedLinkedlist.insertNodeInSortedOrder(10);
        sortedLinkedlist.insertNodeInSortedOrder(89);
        System.out.println("sortedLinkedlist = " + sortedLinkedlist);
    }

}
