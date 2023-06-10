
public class MergeSort {


    private static void merge(int[]nums,int low,int mid,int high){


        int left = low;
        int right=mid+1;
        int index = low;

        int[]merge = new int[nums.length];

        while(left<=mid && right<=high){

            if(nums[left]<nums[right]){

                merge[index++] = nums[left++];
            }
            else
                merge[index++] = nums[right++];
        }

        for(;left<=mid; left++)
            merge[index++] =nums[left];

        for(;right<=high;right++)
            merge[index++] = nums[right];

        for(int i = low; i <=high;i++)
            nums[i] = merge[i];
    }

    public static void mergeSort(int[]input,int low, int high){

        if(low < high){

            int mid = ((low + high)/2);
            mergeSort(input,low,mid);
            mergeSort(input,mid+1,high);

            merge(input,low,mid,high);
        }
    }


    public static void main(String...strings){


        int[] nums = {5,6,2,3,4,5,7,8,9,1,10};
        mergeSort(nums,0,nums.length-1);
        System.out.println(java.util.Arrays.toString(nums));
    }
}
