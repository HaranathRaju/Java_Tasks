package ParkingLotSystem;

public class Car extends Vehicle  {

    int parkingcharge=50;
    Car(String platenumber) {
        super(platenumber);
    }

    void showinfo() {
        System.out.println("platenumber: "+platenumber+" parkingcharge: "+parkingcharge);
    }

    int getParkingcharge() {
        return parkingcharge;
    }
    
}
