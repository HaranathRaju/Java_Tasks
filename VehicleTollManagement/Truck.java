package VehicleTollManagement;

public class Truck extends Vehicle  {
    private final double rate=50;
    
    Truck(String platenumber) {
        super(platenumber);
    }
    @Override
    public double getTollAmount() {
        return rate;
    }

}
