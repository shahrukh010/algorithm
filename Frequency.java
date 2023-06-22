
import java.util.Map;
import java.util.HashMap;
import java.util.Collections;
import java.util.List;
public class Frequency {




    public static List<Integer> sortByFrequency(List<Integer> list){

        Map<Integer,Integer> map = new HashMap();

        list.forEach(value ->{

            map.put(value,map.getOrDefault(value,0)+1);
        });

        Collections.sort(list,(n1,n2)->{

            int frq1 = map.get(n1);
            int frq2 = map.get(n2);

            return frq1 !=frq2 ? frq2 - frq1 : n1 - n2;
        });
        return list;
    }

    public static void main(String[]args){


        List<Integer> input = java.util.Arrays.asList(10,7,10,11,10,7,5,6);
        List<Integer> result = Frequency.sortByFrequency(input);
        System.out.println(result);
    };

}
