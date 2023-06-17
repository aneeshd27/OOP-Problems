package lab;

import java.util.*;
class Order {


    private int orderId;
    private static List<String> itemNames;
    private final Boolean CashOnDelivery;
    public Order(int orderId,List<String> itemNames, Boolean
            CashOnDelivery){
        this.orderId=orderId;
        Order.itemNames =itemNames;
        this.CashOnDelivery=CashOnDelivery;
    }



    public int getOrderId() {
        return orderId;
    }
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
    public static List<String> getItemNames() {
        return itemNames;
    }
    public void setItemNames(List<String> itemNames) {
        this.itemNames = itemNames;
    }
    @Override
    public String toString() {
        return "Order Id: "+getOrderId()+", Item names:"+
        getItemNames()+ "Cash on delivery: "+isCashOnDelivery();
    }
    private Boolean isCashOnDelivery() {
        // TODO Auto-generated method stub
        return CashOnDelivery;
    }

}
class Tester extends Order {




    public Tester(int orderId, List<String> itemNames, Boolean
            CashOnDelivery) {
        super(orderId, itemNames, CashOnDelivery);

    }
    public static List<String> getItems(List<Order> orders) {
        List<String> Items = new ArrayList<>();
        for (Order ignored :orders) {
            Items.addAll(Order.getItemNames());
        }
        return Items;
    }

    public static void main(String[] args) {

        List<Order> orders = new ArrayList<>();
        //List<String> itemNames = null;
        List<String> items1 = new ArrayList<>();
        items1.add("Jeans");
        items1.add("Shirt");
        items1.add("Belt");
        orders.add(new Order(101, items1, true));
        List<String> items2 = new ArrayList<>();
        items2.add("Tie");
        items2.add("Shirt");
        orders.add(new Order(102, items2, true));
        List<String> items3 = new ArrayList<>();
        items3.add("Tshirt");
        items3.add("Socks");
        items3.add("Tie");
        orders.add(new Order(103, items3, true));

        List<String> items = getItems(orders);
        System.out.println("List of Items:");
        for (String item : items) {
            System.out.println(item);
        }
    }
}