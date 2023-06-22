package com.code.main;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Collections;

public class Matrix{



    public List<Integer> sortByFrequency(List<Integer> list){

        Map<Integer,Integer> map = new HashMap();

        list.forEach(value->{

            map.put(value,map.getOrDefault(value,0)+1);
        });

        for(Map.Entry<Integer,Integer> m : map.entrySet()){

            System.out.println(m.getKey()+":"+m.getValue());
          }

        Collections.sort(list,(n1,n2)->{

            int f1 = map.get(n1);
            int f2 = map.get(n2);

            return f1 !=f2 ? f2 - f1 : n2 - n1;
        });

        return list;
    }

    public boolean searchFromMatrix(int[][]input,int target){

        int low = 0;
        int m = input[0].length;
        int n = input.length;

        int high = ((m * n)-1);

        while(low <= high){

            int mid = (low  + (high - low)/2);

            int col = mid / m;
            int row = mid % m;

            if(input[col][row] == target)return true;

            else if(input[col][row] < target) low = mid+1;

            else
                 high = mid-1;
        }
        return false;
    }


    public int[][] computeBeforeMatrix(int n, int m, int[][]after){

        int[][]before = new int[n][m];
        before[0][0] = after[0][0];

        for(int i = m -1; i >=1; i--){

            before[0][i] = after[0][i] - after[0][i-1];
        }

        for(int i = n-1; i>=1; i--){

            before[i][0] = after[i][0] - after[i-1][0];
        }


        for(int i = 1; i <n; i++){

            for(int j = 1; j < m; j++){

                int tmp = after[i-1][j] + after[i][j-1] - after[i-1][j-1];

                before[i][j] = after[i][j] - tmp;
            }

        }
        return before;
    }


    private void merge(int[]input,int low,int mid,int high){

        int i = low;
        int j = mid+1;
        int k = low;

        int[] merge = new int[input.length];

        while(i<=mid && j<=high){

            if(input[i] < input[j])merge[k++] = input[i++];
            
            else merge[k++] = input[j++];
        }

        for(;i<=mid;i++)merge[k++] = input[i];

        for(;j<=high;j++)merge[k++] = input[j];

        for(int index =low; index<=high;index++)
            input[index] = merge[index];
    }


    public void mergeSort(int[]input,int low,int high){


        if(low < high){

            int mid = ((low + high)/2);

            mergeSort(input,low,mid);
            mergeSort(input,mid+1,high);

            merge(input,low,mid,high);
        }
    }


}


