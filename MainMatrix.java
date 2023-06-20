import com.code.main.Matrix;

public class MainMatrix{


    public static void main(String...strings){

        Matrix matrix = new Matrix();

        int[][] mt = {{1,3,5,7},{10,11,16,20},{23,30,34,50}};

        boolean result = matrix.searchFromMatrix(mt,1);
        System.out.println(result);
        
    }
}
