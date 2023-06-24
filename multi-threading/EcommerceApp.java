package com.code.main;
import java.util.Queue;
import java.util.LinkedList;


public class EcommerceApp {

    private Queue<String> orders = new LinkedList();
    private static final int MAX_ORDERS = 5;


    public void orderPlace(String order){

        synchronized(orders){

            while(orders.size() == MAX_ORDERS){

                try{

                orders.wait();//release the lock and wait for notification

                }

                catch(InterruptedException ex){

                    ex.printStackTrace();
                }
            }
            orders.offer(order);
            System.out.println("Order palce"+order);
            orders.notify();//notify the consumer thread

        }
    }

    public void processOrder(){

        synchronized(orders){

            while(orders.isEmpty()){

                try{

                    orders.wait();//Release lock and waitfor notification
                }
                catch(InterruptedException ex){

                    ex.printStackTrace();
                }
            }
            String order = orders.poll();
            System.out.println("Order process"+order);
           orders.notify();//notify the producer thread 
        }

    }
}



    
