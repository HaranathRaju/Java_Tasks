package ParkingLotSystem;

public class Bike extends Vehicle  {

    int parkingcharge=20;

    
    Bike (String platenumber) {
        super(platenumber);
    }

    void showinfo() {
        System.out.println("platenumber: "+platenumber+" parkingcharge :"+parkingcharge);
    }
    int getParkingcharge() {
        return parkingcharge;
    }


    
}
