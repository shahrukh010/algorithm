import com.code.main.Matrix;
import java.util.List;
import java.util.Arrays;

public class MainMatrix{


    public static void main(String...strings){

        Matrix matrix = new Matrix();

        int[][] mt = {{1,3,5,7},{10,11,16,20},{23,30,34,50}};

        boolean result = matrix.searchFromMatrix(mt,1);
 //       System.out.println(result);
        
//        List<Integer> list = Arrays.asList(10,7,10,11,10,7,5,6);

//        matrix.sortByFrequency(list);
//        System.out.println(list);

        int[][] input = {{1,3,6},{3,7,11}};

       int[][] res =  matrix.computeBeforeMatrix(input.length,input[0].length,input);


        for(int[]print : res){

            System.out.println(java.util.Arrays.toString(print));
        }
    }
}
