package com.code.math;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class Mathmatics {



    public Function<Integer,Integer> countDigit = (n)->{

        int res = 0;

        while(n !=0){

            n = n / 10;
            res++;
        }
        return res;
    };

    public Predicate<Integer> isPalindrome = (n)->{

        int res = 0;
        int tmp = n;

        while(tmp !=0){

            res = res * 10 + tmp % 10;
            tmp = tmp / 10;
        }
        return res == n;
    };

    public Function<Integer,Integer> factorial = (n)->{

        int res = 1;
        while(n !=1 && n !=0){

            res = res * n;
            n--;
        }
        return res;
    };


    public Function<Integer,Integer>trailingZero = (n)->{


        int currentResult = 0;
        for(int index = 5; index<=n; index = index*5){

            currentResult += n / index;
        }
        return currentResult;
    };

    public BiFunction<Integer,Integer,Integer> gcd = (a,b)->{

        int q = Math.min(a,b);

        while( (a % q !=0 || b % q !=0))q--;
        return q;
                
    };

    public BiFunction<Integer,Integer,Integer> lcm = (a,b)->{


        int res = Math.max(a,b);

        while(res % a !=0 || res % b !=0)res++;
        return res;
    };

    public Predicate<Integer> isPrime = (n)->{

        
        for(int i = 2; i*i<=n; i++){

            if( n%i ==0)return false;
        }
        return true;
    };

    public Predicate<Integer>prime =(n)->{

        if(n % 2==0 || n%3==0)return true;

        for(int index = 5; index*index <=n; index++){

            if(n % index==0)return false;
        }
        return true;
    };

    public Consumer<Integer> primeFactor = (n)->{


        for(int i = 2; i*i<=n; i++){

            if(isPrime.test(i)){

                int x = i;

                while(n%x==0){

                    System.out.print(i+",");
                    x = x*i;
                }
            }
        }
    };
    public Consumer<Integer>allDivisor = (n)->{


        int i = 1;
        for(;i*i<=n;i++){

            if(n%i==0)System.out.print(i+",");
        }

        for(;i>0;i--){
            
            if(n%i==0 && i !=1)System.out.print(n/i+",");
            else if(i==1) System.out.print(n/i);
        }
    };

    public Consumer<Integer>allPrime = (n)->{


        boolean[] flag = new boolean[n+1];

        for(int i = 2; i*i<=n; i++){

            if(isPrime.test(2)){

                int x = i;

                while( i * x <=n){
                    flag[i*x] = true;
                    x++;
                }
            }
        }

        for(int index = 2; index<flag.length;index++){

            if(!flag[index])System.out.print(index+",");
        }
    };


    public int pow(int x, int n){


        if(n==0)return 1;
        int tmp = x;
        for(int index = 1; index<n;index++){

            x = x*tmp;
        }
        return x;
    }

    
}

