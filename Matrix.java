package com.code.main;

public class Matrix{


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

}


