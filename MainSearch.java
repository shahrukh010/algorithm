import com.code.main.Search;

public class MainSearch {


    public static void main(String[]args){

        Search search = new Search();

//        int[] nums = {10,20,30,40,50,60};
        int[] nums = {10,15};
        boolean result = search.binarySearch.test(nums,15);
        System.out.println(result);
    }
}
