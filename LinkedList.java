package com.code.main;
import java.util.List;
import java.util.ArrayList;

class Node<T> {

    protected T data;
    protected Node next;

    public Node(T data){

        this.data = data;
        this.next = next;
    }
}

public class LinkedList<T>{

    private Node first;
    private Node last;

    public void add(T data){

        Node<T> newNode = new Node(data);
        if(this.first == null){

            this.first = newNode;
            this.last = this.first;
        }
        else{

            this.last.next = newNode;
            this.last = newNode;
        }
    }

    public Node getHead(){

        return this.first;
    }

    public LinkedList<T> middle(Node head){

        Node<T> slow = head;
        Node<T> fast = head;
        LinkedList<T> res = new LinkedList();

        while(fast !=null && fast.next !=null){

            slow = slow.next;
            fast = fast.next.next;
        }
        while(slow !=null){
        res.add(slow.data);
        slow = slow.next;
        }
        return res;

    }


    public void reverse(){

        Node r = null;
        Node q = null;
        Node p = this.first;
        while(p !=null){

            r=q;
            q=p;
            p=p.next;
            q.next = r;
        }
        this.first = q;
    }

    @Override
    public String toString(){

        List<T> result = new ArrayList<>();
        Node<T> current = this.first;
        while(current !=null){

            result.add(current.data);
            current =current.next;
        }
        return result.toString();
    }
}



