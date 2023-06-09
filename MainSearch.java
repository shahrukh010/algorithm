import com.code.main.Search;

public class MainSearch {


    public static void main(String[]args){

        Search search = new Search();

//        int[] nums = {10,20,30,40,50,60};
//        int[] nums = {10,15};
//        int result = search.binarySearch.apply(nums,15);
        int[] nums = {1,10,10,10,20,20,40};
        int result = search.firstIndex.apply(nums,-1);
        System.out.println(result);
    }
}
