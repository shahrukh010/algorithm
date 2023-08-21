import com.code.array.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[]args){

        Array array = new Array();
//        int[] input = {4,8,10,15,18,21,27,29,33,34,39,41,43};

//       boolean result = array.binarySearch.test(input,29);

//        int[] input = {8,3,9,15,6,10,7,2,12,4};
//        int[] result = array.reverseArray.apply(input);
//        System.out.println(Arrays.toString(result));

//        int[] input = {2,3,8,10};
//        array.leftShift(input,2);

//        int[] input = {6,3,-8,10,5,-7,-9,12,-4,2};
//        int[] result = array.reArrangePostiveToNegative(input);

        int[] a = {3,8,16,20,25};
        int[] b = {4,10,12,22,23,25};
//        int[] result = array.mergeArray(a,b);

//        int[] input ={6,7,8,9,11,12,15,16,17,18,19}; 
//       array.multipleMissingElement(input);
//      System.out.println(Arrays.toString(result));

//        int[] input = {20,10,20,8,12};
        int[] input = {10,5,8,7};
        int result = array.secondMax.apply(input);
        System.out.println(result);
    }
}
