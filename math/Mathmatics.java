package com.code.math;
import java.util.function.Function;

public class Mathmatics {



    public Function<Integer,Integer> countDigit = (n)->{

        int res = 0;

        while(n !=0){

            n = n / 10;
            res++;
        }
        return res;
    };
}
