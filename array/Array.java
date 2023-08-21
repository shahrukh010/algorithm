package com.code.array;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.Arrays;
public class Array {

    public BiPredicate<int[],Integer> binarySearch = (input,target)->{


        int low = 0;
        int high = input.length-1;

        while(low <= high){

            int mid = ((low + high)/2);

            if(input[mid] == target)
                return true;

            if(input[mid] < target){

                low = mid+1;
            }
            else
                high = mid-1;
        }
        return false;

    };

    private void swap(int[]input,int left,int right){

        int tmp = input[left];
        input[left] = input[right];
        input[right] = tmp;
    }

    public Function<int[],int[]> reverseArray = (input)->{


        int start = 0;
        int end = input.length-1;

        while(start < end){

            swap(input,start++,end--);
        }
        return input;
    };

    public void leftShift(int[]input,int d){

        for(int index = 0; index < d; index++){

            shift(input,index);
        }
        System.out.println(Arrays.toString(input));
    }

    private void shift(int[]input,int d){

        int tmp = input[0];

        for(int index = 0; index < input.length-1; index++){

            input[index] = input[index+1];
        }
        input[input.length-1] = tmp;
    }

    public int[] reArrangePostiveToNegative(int[]input){

        int start = 0;
        int end = input.length-1;

        while(start < end){

            while(input[start]>=0)start++;
            while(input[end]<0)end--;

            swap(input,start++,end--);
        }
        return input;
    }

    public int[] mergeArray(int[]a,int[]b){

        int[] merge = new int[a.length + b.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < a.length && j < b.length){

            if(a[i] < b[j])merge[k++] = a[i++];
            else merge[k++] = b[j++];
        }

        for(;i<a.length;i++)merge[k++] = a[i];
        for(;j<b.length;j++)merge[k++] = b[j];

        return merge;
    }

    public void multipleMissingElement(int[]input){

        int res = input[0];

        for(int index = 1; index < input.length; index++){

            if(res !=input[index] - index){

                while(res <input[index] - index){
                    int miss = res + index;
                    System.out.println(miss);
                    res++;
            }
        }
    }
    }


    public Function<int[],Integer> secondMax = (input)->{


        int large = 0;
        int res = -1;

        for(int index = 1; index < input.length; index++){

            if(input[index] > input[large]){

                res = large;
                large = index;
            }
            else if(input[index] !=input[large]){

                if(res == -1 || input[index] > input[res]) res = index;
            }
        }

        return res==-1 ? 1 : input[res];
    };


    public Function<int[],int[]> removeDuplicate = (input)->{


        java.util.Arrays.sort(input);

        int i = 0;
        int j = 1;

        while(j<input.length){

            if(input[j] !=input[j-1]){

                input[i+1] = input[j];
                i++;
            }
            j++;
        }

        return Arrays.copyOfRange(input,0,i+1);

    };




}
