package VehicleTollManagement;

class TollBooth {
    public void processVehicle(Vehicle v) {
        double amount = v.getTollAmount();
        v.setToll(amount);
        System.out.println("Vehicle " + v.getPlateNumber() + " paid toll: " + amount);
    }
}

