package com.code.main;
import java.util.function.BiPredicate;
import java.util.function.BiFunction;

public class Search{


    public BiPredicate<int[],Integer>binarySearch = (input,target)->{


        int low = 0;
        int high = input.length-1;

        while(low <= high){

            int mid = (low + high)/2;
            
            if(input[mid] == target)return true;

            if(input[mid] < target)low = mid+1;
            
            else high = mid-1;
        }
        return false;
    };


    public BiFunction<int[],Integer,Integer> firstIndex = (input,target)->{

        int low = 0;
        int high = input.length-1;
        while(low <= high){

            int mid = ((low + high)/2);

            if(input[mid] == target){

                if(mid ==0 || input[mid] !=input[mid-1])return mid;

                high = mid-1;
            }
            else if (input[mid] < target)low = mid+1;

            else high = mid-1;
        }
        return -1;
    };


    public BiFunction<int[],Integer,Integer>lastIndex = (input,target)->{

        int low = 0;
        int high = input.length-1;

        while(low<=high){

            int mid = ((low + high)/2);

            if(input[mid] == target){

                if(mid==input.length-1 || input[mid] !=input[mid+1])return mid;

                low = mid+1;
            }
            else if(input[mid] < target)low = mid+1;

            else high = mid-1;
        }
        return -1;
    };

}
