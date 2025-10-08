package ParkingLotSystem;

public class Truck extends Vehicle {

    int parkingcharge=100;
    Truck(String platenumber) {
        super(platenumber);
    }

    void showinfo() {
        System.out.println("platenumber: "+platenumber+" parkingcharge: "+parkingcharge);
    }

    int getParkingcharge() {
        return parkingcharge;
    }
    
}
