
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
		int[]nums = {10,10,10};
//		int result = array.largestElement.apply(nums);
		int result = array.secondLarge.apply(nums);
		System.out.println(result);
		
	}

}
