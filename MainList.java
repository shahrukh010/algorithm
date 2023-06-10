import com.code.main.LinkedList;


public class MainList {

    public static void main(String...strings){

        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);
        LinkedList<String>list1 = new LinkedList<>();
        list1.add("annie");
        list1.add("hector");
        System.out.println(list1);
    }
}
