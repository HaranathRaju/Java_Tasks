package VehicleTollManagement;

public class Bike extends Vehicle  {
    private  final double rate=10;

    Bike(String platenumber) {
        super(platenumber);

    }
    @Override
    public double getTollAmount() {
        return rate;
    }
    
}
