package com.code.main;
import java.util.function.BiPredicate;
import java.util.function.BiFunction;
import java.util.function.Function;

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


    public BiFunction<int[],Integer,Integer> countOccur = (input,target)->{


        int last = lastIndex.apply(input,target);
        int first = firstIndex.apply(input,target);

        return  last==-1 && first == -1 ? 0: last - first+1;
    };

    public Function<int[],Integer>count1sSortedBinaryArray = (input)->{


        int first = firstIndex.apply(input,1);

        return first == -1 ? 0 : input.length - first;
    };


    public Function<Integer,Integer>sqroot = (input)->{

        int x = 1;
        while(x*x<=input)x++;

        return x-1;
    };

    public Function<Integer,Integer>sqrt = (input)->{

        int low =1;
        int high = input;
        int ans = -1;


        while(low <=high){

            int mid = ((low + high)/2);

            int msq = mid*mid;

            if(msq == input)return mid;

            if(msq > input)high = mid-1;
            else{
                ans = mid;
                low = mid+1;
            }
        }
        return ans;
    };

    private int binary(int[]input,int low,int high,int target){

        while(low<=high){

            int mid = ((low + high)/2);

            if(input[mid] == target)return input[mid];

            if(input[mid] < target)low = mid+1;
            else high = mid-1;
        }
        return -1;
    }


    public BiFunction<int[],Integer,Integer> searchFromInfinit=(input,target)->{

        int x = 1;

        while(input[x]<=target){

            if(input[x]==target)return input[x];
            x = x * 2;
        }
        int result = binary(input,((x/2)+1),x,target);
        return result;
    };
}
