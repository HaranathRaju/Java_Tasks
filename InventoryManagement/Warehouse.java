package InventoryManagement;

public class Warehouse {
    Product [] products;
    int count;
    Warehouse (int capacity) {
        products=new Product[capacity];
        count=0;
    }
    boolean addproduct(Product p) {
        if (count<products.length) {
            products[count]=p;
            count++;
            return true;
        } else {
            System.out.println("warehouse is full");
            return false;
        }
    }

    public Product getproduct(String id) {
        for (int i=0;i<products.length;i++) {
            if (products[i].getid().equals(id)) {
                return products[i];
            }
        }
        return null;
    }

    void display() {
        for (int i=0;i<products.length;i++) {
            products[i].displayproduct();
        }
    }
  
}
