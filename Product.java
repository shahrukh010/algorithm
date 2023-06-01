import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.UUID;

 class Products{

    private Integer id;
    private String name;
    private int amount;

    public Products(Integer id,String name,int amount){

        this.id = id;
        this.name = name;
        this.amount = amount;
    }

    public Integer getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getAmount(){
        return amount;
    }
 }

class ProductPriceComparator implements java.util.Comparator<Products>{

    @Override
    public int compare(Products p1,Products p2){

        return p1.getAmount < p2.getAmount ? -1:p1.getAmount > p2.getAmount ? 1:0;
    }
}

public class Product {


    public static void main(String[]args){

        List<Products> products = new ArrayList<>();
        products.add(new Products(UUID.randomUUID().hashCode(),"Mouse",700));
        products.add(new Products(UUID.randomUUID().hashCode(),"Keyboard",1700));
        products.add(new Products(UUID.randomUUID().hashCode(),"Monitor",4000));

        Collections.sort(products,new ProductPriceComparator());
    }
}



