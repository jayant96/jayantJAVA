package com.jayant.stack;

/**
 * Created by jayant on 8/13/2016.
 */

import java.util.Scanner;

/******************************************************************************
     *  Compilation:  javac LinkedStackOfStrings.java
     *  Execution:    java LinkedStackOfStrings
     *  Data files:   http://introcs.cs.princeton.edu/43stack/tobe.txt
     *
     *  A stack of strings, implemented using a linked list.
     *
     *  % more tobe.txt
     *  to be or not to - be - - that - - - is
     *
     *  % java LinkedStackOfStrings < tobe.txt
     *  to be not that or be
     *
     ******************************************************************************/


    public class LinkedStackOfStrings {
        private int n;          // size of the stack
        private Node first;     // top of stack

        // helper Node class
        private class Node {
            private String item;
            private Node next;
        }

        // is the stack empty?
        public boolean isEmpty() {
            return first == null;
        }

        // number of elements on the stack
        public int size() {
            return n;
        }


        // add an element to the stack
        public void push(String item) {
            Node oldfirst = first;
            first = new Node();
            first.item = item;
            first.next = oldfirst;
            n++;
        }

        // delete and return the most recently added element
        public String pop() {
            if (isEmpty()) throw new RuntimeException("Stack underflow");
            String item = first.item;      // save item to return
            first = first.next;            // delete first node
            n--;
            return item;                   // return the saved item
        }


        // test client
        public static void main(String[] args) {
            LinkedStackOfStrings stack = new LinkedStackOfStrings();
            Scanner scan = new Scanner(System.in);
            while (!scan.hasNext()) {
                String item = scan.next();
                if (!item.equals("-"))     stack.push(item);
                else if (stack.isEmpty())  System.out.println("BAD INPUT");
                else                       System.out.print(stack.pop());
            }
        }


    }
