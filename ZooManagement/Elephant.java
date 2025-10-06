package ZooManagement;

public class Elephant extends Animal {
    Elephant(String name, int health) {
        super(name, health);
    }

    public void makesound() {
        System.out.println("sounds: " + " huhuuh");
    }
}