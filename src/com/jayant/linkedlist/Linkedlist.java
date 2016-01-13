package com.jayant.linkedlist;

/**
 * Created by jayant on 1/14/2016.
 */
public class Linkedlist {

    private Node head;

    public void insertAtHead(int data)	{
        Node newNode = new Node(data);
        newNode.setNextNode(this.head);
        this.head = newNode;
    }

    public void insertNodeInSortedOrder(int data)   {
        Node newNode = new Node(data);
        if(head == null || head.getData() >= data)    {
            newNode.setNextNode(this.head);
            this.head = newNode;
        } else {
            Node current = this.head;
            while (current.getNextNode() != null && current.getNextNode().getData() < data) {
                current = current.getNextNode();
            }
            newNode.setNextNode(current.getNextNode());
            current.setNextNode(newNode);
        }
    }

    public void deleteFromHead()  {
        this.head = this.head.getNextNode();
    }

    public int length() {
        int length = 0;
        Node current = this.head;
        while(current != null)   {
            ++length;
            current = current.getNextNode();
        }
        return length;
    }

    public Node find(int data)  {
        Node current = this.head;

        while (current != null) {
            if(current.getData() == data)   {
                return current;
            }
            current = current.getNextNode();
        }
        return null;
    }

    @Override
    public String toString()    {
        String result = "{";
        Node current = this.head;

        while (current != null) {
            result += current.toString() + ",";
            current = current.getNextNode();
        }

        result += "}";
        return result;

    }



}
