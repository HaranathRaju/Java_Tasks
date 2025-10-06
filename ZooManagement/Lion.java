package ZooManagement;

public class Lion extends Animal {
    Lion(String name, int health) {
        super(name, health);
    }

    @Override
    public void makesound() {
        System.out.println("sounds: " + "howwww");
    }

}
