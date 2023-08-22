package com.code.array;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.Map;

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

    public Function<int[],int[]>moveZeroEnd = (input)->{

        int i = 0;
        int j = 0;

        while(j<input.length){

            if(input[j] !=0)swap(input,i++,j);
            j++;
        }
        return Arrays.copyOfRange(input,0,input.length);

    };

    public Function<int[],int[]>leader = (input)->{

        int currentLeader = input[input.length-1];
        List<Integer> result = new ArrayList<>();
        result.add(currentLeader);

        for(int index=input.length-2; index>=0;index--){

            if(input[index] > currentLeader){
                result.add(input[index]);
                currentLeader = input[index];
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    };

    public Function<int[],Integer>maxDiff = (input)->{

        int res = input[1] - input[0];
        int min_so_far = input[0];

        for(int index = 1; index < input.length; index++){

            res = Math.max(res,input[index] - min_so_far);
            min_so_far = Math.min(input[index],min_so_far);
        }
        return res;
    };


    public Consumer<int[]> frequency = (input)->{

        java.util.Map<Integer,Integer> map = new java.util.HashMap<>();

        for(int index = 0; index < input.length; index++){

            if(map.containsKey(input[index])){

                map.put(input[index],map.getOrDefault(input[index],0)+1);
            }
            else
                map.put(input[index],1);
        }

        //Iterate using entrySet
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){

            System.out.println(entry.getKey()+"-->"+entry.getValue());
        }

        //iterate using keySet

        for(Integer key : map.keySet()){

            System.out.println(key+"-->"+map.get(key));
        }

        //Iterate using values
        for(Integer value : map.values())System.out.println(value);
    };

    public int maxProfit(int[]input){

        int profit = 0;
        for(int index = 1; index<input.length; index++){

            if(input[index] > input[index-1])
            profit +=input[index] - input[index-1];
        }
        return profit;
    }

    public int maxConsecutiveOnes(int[]input){

        int res = 0;
        int count = 0;

        for(int index = 0; index < input.length; index++){

            if(input[index] !=0){

                count++;
                res = Math.max(res,count);
            } 
            else count = 0;
        }
            return res;
    }

    public int mostWater(int[]input){

        int result = 0;

        for(int index = 1; index < input.length-1; index++){

            int leftMax = input[index];
            for(int j = index; j>=0; j--){

                leftMax = Math.max(input[j],leftMax);
            }

            int rightMax = input[index];

            for(int k = index+1; k<input.length;k++)
                rightMax = Math.max(input[k],rightMax);

            result +=((Math.min(leftMax,rightMax))-input[index]);

        }
        return result;
    }



}
