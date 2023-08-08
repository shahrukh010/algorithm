
public class ZigZag {

    public static String zigZag(String strings,int rowNums){

       int n = strings.length();

       if(rowNums == 1)return strings;

       StringBuffer[] sb = new StringBuffer[rowNums];

       for(int index =0; index<rowNums; index++){

           sb[index] = new StringBuffer("");
       }

       boolean flag = false;
       int size = 0;

       for(int index =0; index < n; index++){

           sb[size].append(strings.charAt(index));

           if(size ==0 || size == rowNums -1){

               flag = !flag;
               //chaing direction
           }

           if(flag)size++;
           else
               size--;
       }

       StringBuffer res = new StringBuffer();

       for(int index =0; index<rowNums; index++){

           res.append(sb[index]);
       }
       return res.toString();

    }

    public static void main(String...strings){


        String string = "PAYPALISHIRING";
        String result = zigZag(string,4);
        System.out.println(result);
    }
}
