package InventoryManagement;

public class Main {
    public static void main(String[] args) {
        Product p1=new Product("1","lays", 10, 20);
        Product p2=new Product("2","pepsi",40,30);
        Product p3=new Product("3", "sprite", 20, 50);
        Warehouse w=new Warehouse(5);
        w.addproduct(p1);
        w.addproduct(p2);
        w.addproduct(p3);
        w.display();
        
    }
}
