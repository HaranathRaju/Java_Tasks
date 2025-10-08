package ParkingLotSystem;

public abstract class Vehicle {

    String platenumber;

    Vehicle (String platenumber) {
        this.platenumber=platenumber;
    }

    abstract void showinfo();
    abstract int getParkingcharge();
    



    
}
