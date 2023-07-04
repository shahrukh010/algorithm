package com.code.main;

class Node<T>{

    protected T data;
    protected Node next;

    public Node(T data){

        this.data = data;
    }

    public T getData(){

        return this.data;
    }

    public Node getNode(){

        return this.next;
    }
    
}
public class LinkedList<T> {


    private Node first;
    private Node last;

    public void add(T data){

        Node<T> newNode = new Node(data);
        if(this.first == null){

            this.first = newNode;
            this.last = newNode;
        }
        else{

            this.last.next = newNode;
            this.last = newNode;
        }
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


    public String toString(){

        StringBuffer sb = new StringBuffer();
        sb.append("[");

        boolean flag = true;

        Node<T> current = this.first;

        while(current !=null){

            if(!flag){

                sb.append(",");
            }
            else
                flag = false;

            sb.append(current.data);
            current = current.next;
        }

        sb.append("]");

        return sb.toString();
    }
}
