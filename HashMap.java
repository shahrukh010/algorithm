package com.code.main;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;

class KeyPairValue<K,V>{

    K key;
    V value;

    public KeyPairValue(K key,V value){
        this.key = key;
        this.value = value;
    }

    public K getKey(){

        return key;
    }

    public V getValue(){

        return value;
    }

    @Override
    public String toString(){

        return key+" = "+ value;
    }
}


public class HashMap<K,V>{

    private final int DEFAULT_CAPACITY=16;
    private final float DEFAULT_FLOAT_VALUE = 0.75F;

    private List<LinkedList<KeyPairValue<K,V>>> buckets;

    public HashMap(){

        this.buckets = new ArrayList<>(DEFAULT_CAPACITY);
        for(int index =1; index<=DEFAULT_CAPACITY; index++){

            buckets.add(null);
        }
    }

    public void put(K key,V value){

        if(key == null){

            throw new IllegalArgumentException("key can not be null");
        }

        int index = getIndex(key);
        LinkedList<KeyPairValue<K,V>> bucket = buckets.get(index);
        if(bucket == null){

            bucket = new LinkedList<>();
            this.buckets.set(index,bucket);
        }

        for(KeyPairValue<K,V> entry : bucket){

            if(entry.getKey().equals(key)){

                bucket.remove();
                bucket.add(new KeyPairValue(key,value));
                return;
            }
        }

        bucket.add(new KeyPairValue(key,value));
    }

    public int getIndex(K key){

        int hashCode = key.hashCode();

        return Math.abs(hashCode % buckets.size());
    }


    public V remove(K key){

        int index = getIndex(key);

        LinkedList<KeyPairValue<K,V>> bucket = buckets.get(index);
        if(bucket ==null){

            throw new IllegalArgumentException("key does not valued");
        }

        for(KeyPairValue<K,V> entry : bucket){

            if(entry.getKey().equals(key)){

                bucket.remove(entry);

                return entry.getValue();
            }
        }
        return null;
    }

    @Override
    public String toString(){

        StringBuilder sb = new StringBuilder();
        sb.append("{");
        boolean flag = true;

        for(LinkedList<KeyPairValue<K,V>> bucket : buckets){

            if(bucket !=null){

                for(KeyPairValue<K,V> entry: bucket){

                    if(!flag){
                        sb.append(",");
                    }
                    else{
                        flag = false;
                    }
                    sb.append(entry.toString());
                }
            }

        }
        sb.append("}");
        return sb.toString();
    }


    public static void main(String[]args){

        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"annie");
        map.put(2,"hector");
        map.put(3,"bridget");
        map.put(4,"nic");
        map.put(4,"Alex");

//        String value = map.remove(4);
        String value = map.remove(10);
        System.out.println(map);
        System.out.println(value);
    }
}
