
package com.code.stack;
import java.util.List;
import java.util.ArrayList;
class Node<T> {

    protected Node next;
    protected T data;

    public Node(T data){
        this.data = data;
        this.next = next;
    }
}

public class Stack<T> {

    private Node<T> head;
    private int size = 0;

    public synchronized void push(T data){

        Node<T>newNode = new Node(data);
        if(head == null){

            this.head = newNode;
            size++;
        }
        else{

            newNode.next = this.head;
            this.head = newNode;
            size++;
        }
    }

    public synchronized T pop(){

        if(head == null)return null;

        T value = this.head.data;

        this.head = this.head.next;
        size--;
        return value;
    }

    public int getSize(){

        return this.size;
    }
        

    public String toString(){

        List<T> result = new ArrayList<>();
        Node<T> current = this.head;
        while(current !=null){

            result.add(current.data);
            current = current.next;
        }
        return result.toString();
    }
}


