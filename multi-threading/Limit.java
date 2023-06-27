package com.code.main.limit;
import java.util.concurrent.atomic.AtomicInteger;

public class Limit {

    private final int capacity;
    private int rate;
    private AtomicInteger tokens;
    private long lastRefillTime;


    public Limit(int capacity,int rate){

        this.capacity = capacity;
        this.rate = rate;

        tokens = new AtomicInteger(capacity);
        lastRefillTime = System.nanoTime();
    }

    public boolean tryAcquire(){


        refill();
        int currentToken = tokens.get();

        if(currentToken >0){

            return tokens.compareAndSet(currentToken,currentToken-1);

        }
        return false;
    }

private void refill() {
    long currentTime = System.nanoTime();
    long elapsedTime = currentTime - lastRefillTime;

    int lastRefillAmount = (int)((elapsedTime * rate) / 1000000000L);
    tokens.addAndGet(Math.min(lastRefillAmount, capacity - tokens.get()));
    lastRefillTime = currentTime;
}
    
}
