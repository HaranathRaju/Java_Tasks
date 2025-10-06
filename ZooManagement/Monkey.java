package ZooManagement;

public class Monkey extends Animal {
    Monkey(String name, int health) {
        super(name, health);
    }

    @Override
    public void makesound() {
        System.out.println("sounds: " + " kewkewkew");
    }

}
