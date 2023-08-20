package com.code.ht;
import java.util.ArrayList;
import java.util.LinkedList;

public class HashTable {


    private static final int bucket = 7;

    private ArrayList<LinkedList<Integer>> hash;

    public HashTable(){

        hash = new ArrayList<LinkedList<Integer>>();

        for(int index = 0; index < bucket; index++){

            hash.add(new LinkedList<>());
        }
    }

    private int hashFun(int data){

        return data % bucket;
    }

    public void add(int data){

        int index = hashFun(data);

        hash.get(index).add(data);
    }

    public void remove(int data){

        int index = hashFun(data);

        hash.get(index).remove((Integer)data);
    }

    public boolean search(int data){

        int index = hashFun(data);

        return hash.get(index).contains(data);

    }

    @Override
    public String toString(){


        StringBuffer sb = new StringBuffer();

        for(int index = 0; index < bucket; index++){

            sb.append("Bucket").append(index).append(" :");

            LinkedList<Integer> bucket = hash.get(index);

            if(!bucket.isEmpty()){
                sb.append(bucket);
            }
            else{

                sb.append("Empty");
            }
            sb.append("\n");
        }
        return sb.toString();
    }




}
