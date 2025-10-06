package VehicleTollManagement;

public class Main { 
    public static void main(String[] args) {
        Vehicle bike=new Bike("12345");
        Vehicle car=new Car("23456");
        Vehicle truck =new Truck("34567");
        TollBooth tb=new TollBooth();
        tb.processVehicle(bike);
        tb.processVehicle(car);
        tb.processVehicle(truck);
    }
}

