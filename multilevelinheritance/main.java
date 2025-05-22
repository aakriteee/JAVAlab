// Multilevel Inheritance
// Base class
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Intermediate class
class Reptile extends Animal {
    void crawl() {
        System.out.println("This animal crawls.");
    }
}

// Derived class
class Snake extends Reptile{
    void hiss() {
        System.out.println("The snake hisses.");
    }
}

// Main class to test multilevel inheritance
public class main {
    public main(String[] args) {
        Snake obj = new Snake();
        
        // Calling methods from the base and derived classes
        obj.eat();  
        obj.crawl();  
        obj.hiss();  
    }
}
