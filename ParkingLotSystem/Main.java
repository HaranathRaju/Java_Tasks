package ParkingLotSystem;

public class Main {
    public static void main(String[] args) {
        Vehicle  b=new Bike("bajaj");
        Vehicle  c=new Car("honda");
        Vehicle  t=new Truck("tata");
        Parkingslot ps=new Parkingslot(3);
        ps.add(b);
        ps.add(c);
        ps.add(t);
        ps.totalrevenue();
        ps.display();  
    }
    
}
