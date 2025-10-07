class Car {
    protected int speed;
    protected int fuel;
    protected int distance;
    Car (int speed,int fuel ) {
        this.speed=speed;
        this.fuel=fuel;
        this.distance=0;
    }
    public void drive(int hours) {
        int possibledistance=speed*hours;
        int maxdistance=fuel*10;
        if (possibledistance>distance) {
            distance=possibledistance;
            fuel-=possibledistance/10;
        } else {
            System.out.println("invalid");
        }

    }
    public void showstatus() {
        System.out.println("distance: "+distance+" fuel: "+fuel);
    }
}

class ElectricCar extends Car {
    int battery;
    int distance;

    public ElectricCar(int speed,int battery) {
        super(speed,0);
        this.battery=battery;
        this.distance=0;
    }

    @Override
    public void drive(int hours) {
        int possibledistance=speed*hours;
        int maxdistance=battery*2;
        if (possibledistance>distance) {
            distance+=possibledistance;
            battery-=possibledistance/2;

        } else {
            System.out.println("invalid");
        }

    }
    @Override
    public void showstatus() {
        System.out.println("distance: "+distance+" battery: "+battery);
    }   
}

public class CarSimulation {
    public static void main(String[] args) {
        Car c=new Car(80, 30);
        ElectricCar ec=new ElectricCar(60,100);
        Car cars [] ={c,ec};
        for (int i=0;i<cars.length;i++) {
            cars[i].drive(2);
            cars[i].showstatus();
        }  
    }
    
}
