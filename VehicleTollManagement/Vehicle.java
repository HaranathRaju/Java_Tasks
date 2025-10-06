package VehicleTollManagement;
public abstract class Vehicle {
    private String platenumber;
    private double tollamount;

    Vehicle (String platenumber) {
        this.platenumber=platenumber;
    }

    public abstract double getTollAmount();

    public String getPlateNumber() {
        return platenumber;
    }

    public double getToll() {
        return tollamount;

    }

    public void setToll(double amount) {
        tollamount=amount;
    }

}