package InventoryManagement;

public class Product {
    String id;
    String name;
    int price;
    int quantity;
    public Product(String id, String name, int price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    String getid() {
        return id;
    }
    String getname() {
        return name;
    }
    int getprice() {
        return price;
    }
    int getquantity() {
        return quantity;
    }

    void displayproduct() {
        System.out.println("id: "+id+" name: "+name+" price: "+price+" quantity: "+quantity);
    }
}
