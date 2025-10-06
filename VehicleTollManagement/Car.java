package VehicleTollManagement;

public class Car extends Vehicle {
    private final double rate=20;

    Car(String platenumber) {
        super(platenumber);
    }
    @Override
    public double getTollAmount() {
        return rate;
    }

}