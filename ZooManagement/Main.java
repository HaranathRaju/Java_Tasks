package ZooManagement;

public class Main {
    public static void main(String[] args) {
        Animal lion = new Lion("leo", 82);
        Animal elephant = new Elephant("jhon", 70);
        Animal monkey = new Monkey("naruto", 60);
        lion.makesound();
        monkey.makesound();
        elephant.makesound();
        lion.eat();
        monkey.sleep();
        lion.sleep();
        monkey.eat();
    }
}
