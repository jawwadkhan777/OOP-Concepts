package OOP;
class Calc {
    int add(int x, int y) {
        return x + y;
    }
    double add(double x, double y) {
        return x + y;
    }
}

class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}


public class Polymorphism {
    public static void main(String[] args) {
        Calc c  = new Calc();
    }
}
