
import com.code.main.Sorting;
import com.code.main.LinkedList;
import com.code.main.Array;

public class Main{


	public static void main(String...strings){

		
		Sorting alg = new Sorting();
	//	int[]input = {5,3,1,4,2};
		int[] input = {50,70,90,40,80,10,20,30};
	//	alg.quickSort(input,0,input.length-1);
		alg.mergeSort(input,0,input.length-1);
        //	System.out.println(java.util.Arrays.toString(input));

		LinkedList list = new LinkedList();
		list.addNode(10);
		list.addNode(20);
		list.addNode(30);
		list.addNode(40);
		list.addNode(50);
//		list.printNode();



		Array array = new Array();
		//int[]nums = {5,8,20,10};
		//int[]nums = {40,8,50};
//		int[]nums = {10,10,10};
//		int[] nums = {5,20,12,20,8};
//		int result = array.largestElement.apply(nums);
		//int result = array.secondLarge.apply(nums);
//		int result = array.secondLargest.apply(nums);
		//int[] nums = {8,12,15};
		//int[] nums = {8,10,10,12};
		//int[] nums = {100};
//		int[] nums = {100,20,200};
		//boolean result = array.isSorted.test(nums);

//		int[] nums = {1,2,3,4,5};
//		int[] result = array.reverseArray.apply(nums);

		//int[] nums = {10,10,10,20,20,30,30,30,40,50,50,60};
//		int[] nums = {10,10,10};
//		int[] result = array.removeDuplicate.apply(nums);
//		int[] nums = {8,5,0,10,0,20,0,0,30};
//		int[] result = array.moveZero.apply(nums);
//		int[] nums = {1,2,3,4,5};
//		int[] result= array.rotateByD(nums,3);

//		int[] nums = {7,10,4,6,5,2};
//		int[] result = array.leader.apply(nums);
//		int[] nums = {2,3,10,6,4,8,1};
//		int[] nums = {7,9,5,6,3,2};
//		int[] nums = {10,20,30};
//		int[] nums = {30,10,8,2};
//		int result = array.maxDiff.apply(nums);
//		System.out.println(result);
//
//		int[] nums = {10,10,10,25,30,30};
//		array.frequence.accept(nums);
//		System.out.println(java.util.Arrays.toString(result));

//        int[]nums = {1,5,3,8,12};
//        int result = array.maxProfit.apply(nums);

//        int[] nums = {3,0,1,2,5};
//        int[] nums = {3,0,2,0,4};
//        int[] nums = {2,0,2};
//        int result = array.maxWater.apply(nums);
//          int[] nums = {0,1,1,0,1,0};
//          int[] nums = {1,0,1,1,1,1,0,1,1};
//          int result = array.consecutive.apply(nums);

//            int[] nums = {2,3,-8,7,-1,2,3};
//          int[] nums = {5,8,3};
//          int[] nums = {-6, -1,-8};
//           int[] nums = {1,-2,3,-1,2};
//          int result = array.maxSumSubArray.apply(nums);
//            int[] nums = {2,3,-8,7,-1,2,3};
//            int result = array.maxSubArraySum.apply(nums);
          
//        int[] nums = {10,12,14,7,8};
//        int[] nums = {7,10,13,14};
//        int[] nums = {10,12,8,4};
//        int[] nums = {5,10,20,6,3,8};

//        int result = array.maxLengthOddEven.apply(nums);
//        int[] nums = {5,-2,3,4};
//        int[] nums = {2,3,-4};
//        int[] nums = {8,-4,3,-5,4};

//        int[] nums = {3,-4,5,6,-8,7};
//       int result = array.maxCircularSubArray.apply(nums);

//        int[] nums = {8,3,4,8,8};
//        int[] nums = {3,7,4,7,7,5};
//        int[] nums  = {20,30,40,50,50,50,50};
//        int[] nums = {0,0,1,1,0,0,1,1,0,1};
//        int result = array.majorityElement.apply(nums);
 //       System.out.println(result);
//        array.flip.accept(nums);

//        int[]nums = {1,8,30,-5,20,7};
//        int[] nums = {5,-10,6,90,3};
        //int[] nums = {10,5,-2,20,1};
//        int result = array.maxKConsecutiveSum.apply(nums,3);

//        int[] nums = {1,8,30,-5,20,7};
//        int[]nums = {1,8,30,-5,20,7};
//        int result = array.maxConSum.apply(nums,3);

//        int[] nums = {1,4,20,3,10,5};
//        int[] nums = {1,4,0,0,3,10,5};
//        int[] nums = {2,4};
//        boolean result = array.isSubArraySum.test(nums,33);
//        int[] nums = {4,8,12,5};
//        int[] nums = {1,4,20,3,10,5};
//        boolean result = array.isSumExists.test(nums,33);

        //int result = array.prefixSum.apply(0,2);
        int result = array.prefixSum.apply(2,6);
        System.out.println(result);
	}
}
