import com.code.main.LinkedList;


public class MainList {

    public static void main(String...strings){

        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
//        System.out.println(list);
//        list.reverse();
//        System.out.println(list);
        LinkedList<String>list1 = new LinkedList<>();
        list1.add("annie");
        list1.add("hector");
        list1.add("bridget");
        list1.add("nic");
        list1.add("alex");
//        System.out.println(list1);
//        list1.reverse();
//        System.out.println(list1);

        //LinkedList<Integer> obj = list.middle(list.getHead());
        LinkedList<String> obj = list1.middle(list1.getHead());
        System.out.println(obj);
    }
}
