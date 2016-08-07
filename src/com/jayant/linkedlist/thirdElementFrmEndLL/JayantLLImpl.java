package com.jayant.linkedlist.thirdElementFrmEndLL;

public class JayantLLImpl {

    public static void main(String[] args) {

        SinglyLL ll = new SinglyLL();
        ll.append("1");
        ll.append("2");
        ll.append("3");
        ll.append("4");

        System.out.println("Singly LinkedList : " + ll);
        System.out.println("Is LinkedList empty : " + ll.isEmpty());
        System.out.println("get second last node : " + ll.getLastNode(2));
    }

}


class SinglyLL {

    private Node head;

    public void append(String data) {
        if (head == null) {
            head = new Node(data);
            return;
        }

        tail().next = new Node(data);
    }

    private Node tail() {
        Node tail = head;

        while (tail.next != null) {
            tail = tail.next;
        }

        return tail;
    }

    public String getLastNode(int n) {
        Node fast = head;
        Node slow = head;
        int start = 0;

        while (fast.next != null) {
            fast = fast.next;
            start++;

            if (start >= n) {
                slow = slow.next;
            }

        }
        return slow.data;
    }

    public int length() {
        int length = 0;
        Node current = head;

        while (current != null) {
            length++;
            current = current.next;
        }
        return length;
    }

    public boolean isEmpty() {
        return length() == 0;
    }

    @Override
    public String toString() {
        Node current = head;
        StringBuilder string = new StringBuilder();
        while (current != null) {
            string.append(current.data).append(" ");
            current = current.next;
        }
        return string.toString();
    }

    static class Node {
        private Node next;
        private String data;

        Node(String data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return this.data;
        }
    }
}
