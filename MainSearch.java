import com.code.main.Search;

public class MainSearch {


    public static void main(String[]args){

        Search search = new Search();

//        int[] nums = {10,20,30,40,50,60};
//        int[] nums = {10,15};
//        int result = search.binarySearch.apply(nums,15);
//        int[] nums = {1,10,10,10,20,20,40};
//        int result = search.firstIndex.apply(nums,-1);
//        int result = search.lastIndex.apply(nums,-1);

//        int[] nums = {10,20,20,20,30,30};
//        int[] nums = {10,10,10,10,10,10};
//        int[] nums = {5,8,10};
//        int result = search.countOccur.apply(nums,30);

//        int[] nums = {0,0,1,1,1,1};
//        int[] nums = {1,1,1,1,1,1};
//        int[] nums = {0,0,0,0,0,0};
//        int result = search.count1sSortedBinaryArray.apply(nums);

//        int result = search.sqroot.apply(25);
//        int result = search.sqrt.apply(10);
//        int[]nums = {1,10,15,20,40,80,90,100,120,140};
//        int result = search.searchFromInfinit.apply(nums,90);
//        int[] nums = {10,20,40,60,5,8};
//        int result = search.searchFromRotated.apply(nums,8);
//        int[] nums = {2,4,8,9,11,12,20,30};
//        int[] nums = {2,5,8,12,30};
//        boolean result = search.pairExist.test(nums,17);
//        int[] nums = {2,3,4,8,9,20,40};
//        int[] nums = {1,2,5,6};
//        boolean result = search.isTriplet.test(nums,32);

//        int[] arr1 = {10,20,30,40,50};
//        int[] arr2 = {5,15,25,35,45};
//        int[] arr1 = {1,2,3,4,5,6};
//        int[] arr2 = {10,20,30,40,50};
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {10,20,30,40,50,60};
        int result = search.median.apply(arr1,arr2);
        System.out.println(result);
    }
}
