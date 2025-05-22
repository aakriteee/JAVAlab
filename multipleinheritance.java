// First interface
interface CanFly {
    void fly();
}

// Second interface
interface CanSwim {
    void swim();
}

// Class implementing multiple interfaces
class Eagle implements CanFly, CanSwim {
    @Override
    public void fly() {
        System.out.println("The eagle flies high.");
    }

    @Override
    public void swim() {
        System.out.println("The eagle cannot swim in the water.");
    }
}

// Main class to test multiple inheritance
public class multipleinheritance {
    public static void main(String[] args) {
        Eagle bird = new Eagle();
        
        // Calling methods from the implemented interfaces
        bird.fly();
        bird.swim();
    }
}
