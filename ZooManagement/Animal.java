package ZooManagement;

public abstract class Animal {
    private String name;
    private int health;
    private boolean ishungry;

    Animal(String name, int health) {
        this.name = name;
        this.health = health;
        this.ishungry = true;
    }

    public abstract void makesound();

    public String getname() {
        return name;
    }

    public int gethealth() {
        return health;
    }

    protected void sethealth(int health) {
        this.health = health;
    }

    public boolean getstatus() {
        return ishungry;
    }

    protected void setstatus(boolean status) {
        this.ishungry = status;
    }

    public void eat() {
        if (ishungry) {
            System.out.println(name + " is eating.");
            setstatus(false);
            sethealth(gethealth() + 10);
        } else {
            System.out.println(name + " is not hungry.");
        }
    }

    public void sleep() {
        if (health > 80) {
            System.out.println("sleeeping");

        } else {
            System.out.println("not sleeping");
        }
    }
}
