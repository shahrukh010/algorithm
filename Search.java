package com.code.main;
import java.util.function.BiPredicate;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.Arrays;

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

    public BiFunction<int[],Integer,Integer> searchFromRotated = (input,target)->{

        int low = 0;
        int high = input.length-1;

        while(low<=high){

            int mid = ((low + high)/2);
            if(input[mid] == target)return mid;

            if(input[low]<input[mid]){

                if(target>=input[low] && target < input[mid])
                    high = mid -1;
                else low = mid+1;
            }
            else{

                if(target>input[mid] && target <= input[high]) low = mid+1;
                else high =mid-1;
            }
        }
        return -1;
    };

    public BiPredicate<int[],Integer>pairExist = (input,target)->{

        int left = 0;
        int right= input.length-1;

        while(left<right){

            if(input[left] + input[right] == target)return true;

            if(input[left] + input[right] < target)left++;
            else right--;
        }
        return false;
    };

    public BiPredicate<int[],Integer>triplet = (input,target)->{

        for(int i = 0; i < input.length-2;i++){

            for(int j = i+1; j < input.length-1; j++){

                for(int k = j+1; k < input.length; k++){

                    if(input[i] + input[j] + input[k] == target)return true;
                }
            }
        }
        return false;
        
    };

    public BiPredicate<int[],Integer> isTriplet = (input,target)->{

        for(int index = 0; index < input.length; index++){

            int left = index+1;
            int right=input.length-1;
            int ntf = target - input[index];

            while(left < right){

                int sum = input[left] + input[right];
                if(sum == ntf)return true;

                if(sum > ntf)right--;
                else left++;
            }
        }
        return false;
    };

    public BiFunction<int[],int[],Integer>median = (arr1,arr2)->{

        int[] array = new int[arr1.length + arr2.length];
        int k = 0;

        for(int index =0; index <arr1.length;index++)
            array[k++] = arr1[index];

        for(int index =0; index<arr2.length;index++)
            array[k++] = arr2[index];

        Arrays.sort(array);

        int n = array.length;
        int mid = 0;
        if(n%2==0){

            int index = (n/2);
            mid = ((array[index] + array[index-1])/2);
            return mid;//it is returning sum/2 result of two data  not index of data
        }
        else{
            return array[n/2];//if odd then return index of data;
        }
    };
}
