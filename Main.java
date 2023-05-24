
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

		int[] nums = {10,10,10,20,20,30,30,30,40,50,50,60};
		int[] result = array.removeDuplicate.apply(nums);
		System.out.println(java.util.Arrays.toString(result));
		
	}

}
