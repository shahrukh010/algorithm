
import com.code.main.LinkedList;
public class Main{


    public static void main(String...strings){

        LinkedList<Integer> list = new LinkedList();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);
        list.reverse();

        LinkedList<String> string = new LinkedList();
        string.add("annie");
        string.add("hector");
        string.add("bridget");
        System.out.println(string);
        System.out.println(list);
        string.reverse();
        System.out.println(string);
    }

}
