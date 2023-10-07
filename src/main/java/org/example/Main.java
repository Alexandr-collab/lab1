package org.example;

import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Order order1 = new  Order(101, "K", "Al", new Date(122,0,1),new Date(123,0,2),"Avrora","Rewt23");
        Order order2 = new Order(102, "S", "LL", new Date(123,0,3),new Date(123,0,5),"Anderson","LKAS123");

        OrderDetail orderDetail1 = new OrderDetail(1, order1, 12000,15);
        OrderDetail orderDetail2 = new OrderDetail(2, order2, 25000,50);

        Product product1 = new Product(1,1 ,"Sony",15,22,23 );
        Product product2 = new Product(2, 2, "Xiaomi", 155555, 1 ,1);
        Category category1 = new Category(1,"TV","Booo");
        Category category2 = new Category(2,"Phone","ROO");

        System.out.println("Order 1: " + order1);
        System.out.println("Order 2: " + order2);
        System.out.println("OrderDetail 1: " + orderDetail1);
        System.out.println("OrderDetail 2: " + orderDetail2);
        System.out.println("Product 1: " + product1);
        System.out.println("Product 2: " + product2);
        System.out.println("Category 1: " + category1);
        System.out.println("Category 2: "+ category2);
    }
}

class Order {
    private int ID;
    private String customer;
    private String employye;
    private  Date orderdate;
    private Date shippeddate;
    private  String shipname;
    private String shipadress;

    public Order(int ID, String customer, String employye, Date orderdate, Date shippeddate, String shipname, String shipadress) {
        this.ID = ID;
        this.customer = customer;
        this.employye = employye;
        this.orderdate = orderdate;
        this.shippeddate = shippeddate;
        this.shipname = shipname;
        this.shipadress = shipadress;

    }

    @Override
    public String toString() {
        return new Object() {
            @Override
            public String toString() {
                return "Order[ID=" + ID + ", Customer=" + customer + ", Employye=" + employye + ", OrderDate=" + orderdate + ", ShippedDate=" + shippeddate + ",ShipName=" + shipname + ", ShipAdress=" +shipadress +"]";
            }
        }.toString();
    }
}

class OrderDetail {
    private int ID;
    private Order order;
    private int unitprice;
    private int discount;
    public OrderDetail(int ID, Order order, int unitprice, int discount) {
        this.ID = ID;
        this.order = order;
        this.unitprice = unitprice;
        this.discount = discount;
    }

    @Override
    public String toString() {
        return new Object() {
            @Override
            public String toString() {
                return "OrderDetail[ID=" + ID + ", Order=" + order + ",UnitPrice=" + unitprice + ",Discount=" + discount + "]";
            }
        }.toString();
    }
}

class Product {
    private int ID;
    private int categoryId;
    private  String productname;
    private  int unitprice;
    private  int unitinstok;
    private  int unitinorder;
    public Product(int ID,int categoryId ,String productname, int unitprice, int unitinorder, int unitinstok) {
        this.ID = ID;
        this.categoryId = categoryId;
        this.productname = productname;
        this.unitprice = unitprice;
        this.unitinstok = unitinstok;
        this.unitinorder = unitinorder;
    }

    @Override
    public String toString() {
        return new Object() {
            @Override
            public String toString() {
                return "Product[ID=" + ID + ", CategoryID=" + categoryId + ", ProductName=" + productname + ", UnitPrice=" + unitprice + ". UnitInStok=" +unitinstok + ", UnitinOrder=" + unitinorder + "]";
            }
        }.toString();
    }
}

class Category {
    private int ID;
    private String categoryname;
    private String discription;


    public Category(int ID, String categoryname, String discription) {
        this.ID = ID;
        this.categoryname = categoryname;
        this.discription = discription;
    }

    @Override
    public String toString() {
        return new Object() {
            @Override
            public String toString() {
                return "Category[ID=" + ID +", CategoryName="+ categoryname +", Discription="+ discription +"]";
            }
        }.toString();
    }
}