import com.code.ht.HashTable;
public class Main {


    public static void main(String...strings){

        HashTable table = new HashTable();
        table.add(70);
        table.add(71);
        table.add(56);
        table.add(121);
        table.add(211);
        System.out.println(table);
        table.remove(56);
        table.remove(211);
        System.out.println(table);
        System.out.println(table.search(70));
    }

}
