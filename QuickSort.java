
public class QuickSort{


    private int hoarsPartition(int[]input,int low,int high){

        int left = low-1;
        int right = high+1;
        int pivot = low;

        while(true){

            do{

                left++;
            }while(input[left]<input[pivot]);
            do{
                right--;
            }while(input[right]>input[pivot]);

            if(left>=right)return right;

            swap(input,left,right);
        }
    }

    private void swap(int[]input,int low,int right){

        int tmp = input[low];
        input[low] = input[right];
        input[right] = tmp;
    }

    public void quickSort(int[]input,int low,int high){

        if(low < high){

            int pivot = hoarsPartition(input,low,high);
            quickSort(input,low,pivot);
            quickSort(input,pivot+1,high);
        }
    }

    public static void main(String...strings){

        QuickSort sort = new QuickSort();
        int[] nums = {5,3,1,3,4,7,8,10,9,2};
        sort.quickSort(nums,0,nums.length-1);
        System.out.println(java.util.Arrays.toString(nums));
    }
}
