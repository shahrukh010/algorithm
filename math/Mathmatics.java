package com.code.math;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.BiFunction;

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
}

