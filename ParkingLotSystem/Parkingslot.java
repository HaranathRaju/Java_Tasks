package ParkingLotSystem;

public class Parkingslot {

    Vehicle [] slots;
    int count;

    public Parkingslot(int capacity) {
        slots=new Vehicle[capacity];
        count=0;   
    }

    public void add(Vehicle v) {
        if (count<slots.length) {
            slots[count]=v;
            count++;
        } else {
            System.out.println("parkiing slots are full");
        }
    }

    public void totalrevenue() {
        int total=0;
        for (Vehicle v: slots) {
            total+=v.getParkingcharge();
        } 
        System.out.println("total revenue is: "+total);
    }

    public void display() {
        for(int i=0;i<slots.length;i++) {
            slots[i].showinfo();
        }
    }  
}

