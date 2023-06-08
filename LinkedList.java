//package com.code.main;
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

public class LinkedList<T> {

    private Node first;
    private Node last;

    public void add(T data){

        Node<T> newNode = new Node(data);

        if(this.first==null){
            this.first = newNode;
            this.last = this.first;
        }
        else{

            this.last.next = newNode;
            this.last = newNode;
        }
    }

    @Override
    public String toString(){

        List<T> result = new ArrayList<>();
        Node<T> current = this.first;
        while(current !=null){

            result.add(current.data);
            current = current.next;
        }
        return result.toString();
    }


    public static void main(String[]args){

        LinkedList<Integer> list = new LinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);

        LinkedList<String> string = new LinkedList<>();
        string.add("annie");
        string.add("hector");
        string.add("bridget");
        System.out.println(string);
    }
}
