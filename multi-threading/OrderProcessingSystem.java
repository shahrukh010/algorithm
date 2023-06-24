package com.code.main;
import java.util.Queue;
import java.util.LinkedList;


class Ecommerce {

    private Queue<String> orders = new LinkedList();
    private static final int MAX_ORDERS = 5;

    public void palceOrder(String order){

        synchronized(orders){

            while(orders.size() == MAX_ORDERS){

                try{
                    orders.wait();//Release the lock and wait for notification

                }
                catch(InterruptedException ex){

                    ex.printStackTrace();
                }
            }
            orders.offer(order);
            System.out.println("palce Order "+order);
            orders.notify();//notify to the consumer
        }
    }

    public void processOrder(){


        synchronized(orders){

            while(orders.isEmpty()){

                try{
                    orders.wait();//To Release lock and wait for notification;
                                 
                }
                catch(InterruptedException ex){

                    ex.printStackTrace();
                }
            }
            String order = orders.poll();
            System.out.println("process Order"+order);
            orders.notify();//notify to the producer
        }
    }
}

class Producer implements Runnable{


    private Ecommerce app;
    private int orderCount;

    public Producer(Ecommerce app,int orderCount){

        this.app = app;
        this.orderCount = orderCount;
    }

    @Override
    public void run(){

        for(int index=1; index<=orderCount;index++){

            app.palceOrder(" order"+index);

            try{
                Thread.sleep(3000);//simulate the placeOrder time
            }
            catch(InterruptedException ex){

                ex.printStackTrace();
            }
        }
    }
}

class Consumer implements Runnable{


    private Ecommerce app;
    private int orderCount;

    public Consumer(Ecommerce app,int orderCount){

        this.app = app;
        this.orderCount = orderCount;
    }

    @Override
    public void run(){

        for(int index=1; index<=orderCount;index++){

            app.processOrder();
            try{
                Thread.sleep(3000);//simulate the process order time
            }
            catch(InterruptedException ex){
                ex.printStackTrace();
            }
        }
    }

}


public class OrderProcessingSystem {


    public static void main(String[]args){


        Ecommerce app = new Ecommerce();
        Producer producer = new Producer(app,5);
        Consumer consumer = new Consumer(app,5);

        Thread thread1 = new Thread(producer);
        Thread thread2 = new Thread(consumer);

        thread1.start();
        thread2.start();
    }

}
