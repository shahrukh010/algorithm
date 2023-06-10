



public class MergeSort{

private void merge(int[]input,int low,int mid,int high){

    int i = low;
    int j = mid+1;
    int k = low;

    int[] merge = new int[input.length];
    while(i<=mid && j <= high){

        if(input[i] < input[j])
            merge[k++] = input[i++];
        else
            merge[k++] = input[j++];
    }

    for(;i<=mid;i++)
        merge[k++] = input[i];
    for(;j<=high;j++)
        merge[k++] = input[j];


    for(int index =low;index<=high;index++){

        //till not sorted element inserted from new array to old array
        input[index] = merge[index];
    } 
}


    public void mergeSort(int[]input,int low,int high){

        if(low < high){

            int mid = ((low + high)/2);

            mergeSort(input,low,mid);
            mergeSort(input,mid+1,high);
            merge(input,low,mid,high);
        }
    }


public static void main(String...strings){


    MergeSort merge = new MergeSort();
    int[] nums = {5,3,1,2,4};
    merge.mergeSort(nums,0,nums.length-1);
    System.out.println(java.util.Arrays.toString(nums));
}
}



